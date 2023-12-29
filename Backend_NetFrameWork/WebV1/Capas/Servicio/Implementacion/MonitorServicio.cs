using WebV1.Capas.Modelo;
using WebV1.Capas.Repositorio.Interfaces;
using WebV1.Capas.Servicio.Interfaz;

namespace WebV1.Capas.Servicio.Implementacion
{
    public class MonitorServicio : IMonitorServicio
    {
        private readonly IMonitorRepositorios _monitorRepositorios;

        public MonitorServicio(IMonitorRepositorios monitorRepositorios)
        {
            _monitorRepositorios = monitorRepositorios;
        }

        public async Task<Monitores> ActualizarMonitoByID(int idMonitor, Monitores monitor)
        {
            return await _monitorRepositorios.ActualizarMonitoByID(idMonitor, monitor);
        }

        public async Task<Monitores> ActualizarMonitorDieta(Monitores monitor)
        {
            return await _monitorRepositorios.ActualizarMonitorDieta(monitor);
        }

        public async Task<Monitores> ActualizarMonitorTabla(Monitores monitor)
        {
           return await _monitorRepositorios.ActualizarMonitorTabla(monitor);
        }

        public async Task<Monitores> GetDatosMonitorByID(int idMonitor)
        {
            return await _monitorRepositorios.GetDatosMonitorByID(idMonitor);
        }

        public async Task<List<string>> ObtenerEmailsPorIDMonitor(int idMonitor)
        {
            return await _monitorRepositorios.ObtenerEmailsPorIDMonitor(idMonitor);
        }

        public async Task<Monitores> ObtenerMonitorPorEmail(string email)
        {
            return await _monitorRepositorios.ObtenerMonitorPorEmail(email);
        }

        public async Task<Monitores> ObtenerMonitorPorEmailPassword(string email, string password)
        {
            return await _monitorRepositorios.ObtenerMonitorPorEmailPassword(email, password);
        }

        public async Task<IEnumerable<Monitores>> ObtenerTodosMonitores()
        {
            return await _monitorRepositorios.ObtenerTodosMonitores();
        }
    }
}
