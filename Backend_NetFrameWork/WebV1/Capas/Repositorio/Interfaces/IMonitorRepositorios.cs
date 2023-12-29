

using WebV1.Capas.Modelo;
using WebV1.Capas.Modelo.Entidad;
using WebV1.Seguridad.Models;

namespace WebV1.Capas.Repositorio.Interfaces
{
    public interface IMonitorRepositorios
    {
        Task<IEnumerable<Monitores>> ObtenerTodosMonitores();              //obtener todos los usuarios
        Task<List<string>> ObtenerEmailsPorIDMonitor(int idMonitor);
        Task<Monitores> ObtenerMonitorPorEmailPassword(string email, string password);
        Task<Monitores> ObtenerMonitorPorEmail(string email);
        Task<Monitores> GetDatosMonitorByID(int idMonitor);
        Task<Monitores> ActualizarMonitorTabla(Monitores monitor);
        Task<Monitores> ActualizarMonitorDieta(Monitores monitor);
        Task<Monitores> ActualizarMonitoByID(int idMonitor, Monitores monitor);
        



    }
}
