using Microsoft.EntityFrameworkCore;
using System.Text.Json.Serialization;
using System.Text.Json;
using WebV1.Capas.Modelo;
using WebV1.Capas.Modelo.Data;
using WebV1.Capas.Repositorio.Interfaces;
using WebV1.Capas.Modelo.Entidad;

namespace WebV1.Capas.Repositorio.implementacion
{
    public class MonitorRepositorio : IMonitorRepositorios
    {

        private readonly WevApiContext _context;


        public MonitorRepositorio(WevApiContext context)
        {
            _context = context;
        }

        public async Task<Monitores> ObtenerMonitorPorEmailPassword(string email, string password)
        {
            var monitores = await _context.ListaMonitores.FirstOrDefaultAsync(u => u.Email == email && u.Password == password);
            return monitores;
        }

        public async Task<List<string>> ObtenerEmailsPorIDMonitor(int idMonitor)
        {
            var monitor = await _context.ListaMonitores
                   .Include(a => a.ListaDeUSuarios)
                   .FirstOrDefaultAsync(a => a.IdMonitor == idMonitor);

            if (monitor == null)
                return null;

            var emails = monitor.ListaDeUSuarios.Select(u => u.Email).ToList();
            return emails;
        }

        public async Task<IEnumerable<Monitores>> ObtenerTodosMonitores()
        {

            return await _context.ListaMonitores
                .Include(a => a.ListaDeUSuarios)
                    .ThenInclude(u => u.dieta)
                .Include(a => a.ListaDeUSuarios)
                    .ThenInclude(u => u.tabla)
                .ToListAsync();
        }

        public async Task<Monitores> ObtenerMonitorPorEmail(string email)
        {
            return await _context.ListaMonitores
                   .Include(m => m.ListaDeUSuarios)
                       .ThenInclude(u => u.dieta)
                   .Include(m => m.ListaDeUSuarios)
                       .ThenInclude(u => u.tabla)
                   .SingleOrDefaultAsync(m => m.Email == email);
        }


        public async Task<Monitores> GetDatosMonitorByID(int idMonitor)
        {
            var monitor = await _context.ListaMonitores
             .Include(u => u.tabla)
             .Include(u => u.dieta)
             .Include(m => m.ListaDeUSuarios)
             .FirstOrDefaultAsync(u => u.IdMonitor == idMonitor);

            return monitor;
        }

        public async Task<Monitores> ActualizarMonitoByID(int idMonitor, Monitores monitor)
        {
            var monitorExistente = await _context.ListaMonitores.FindAsync(idMonitor);

            if (monitorExistente != null)
            {
                monitorExistente.Nombre = monitor.Nombre;
                monitorExistente.Apellidos = monitor.Apellidos;
                monitorExistente.Peso = monitor.Peso;
                monitorExistente.Edad = monitor.Edad;
                monitorExistente.Email = monitor.Email;
                monitorExistente.Password = monitor.Password;
                monitorExistente.Foto = monitor.Foto;

                await _context.SaveChangesAsync(); // Guardar los cambios en la base de datos

                return monitorExistente;
            }

            return null; // Si no se encontró el monitor con el ID especificado
        }

        public async Task<Monitores> ActualizarMonitorTabla(Monitores monitor)
        {
            _context.Entry(monitor).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return monitor;
        }

        public async Task<Monitores> ActualizarMonitorDieta(Monitores monitor)
        {
            _context.Entry(monitor).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return monitor;
        }
    }
}
