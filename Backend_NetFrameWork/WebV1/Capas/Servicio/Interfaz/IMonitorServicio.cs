using WebV1.Capas.Modelo;

namespace WebV1.Capas.Servicio.Interfaz
{
    public interface IMonitorServicio
    {
        Task<IEnumerable<Monitores>> ObtenerTodosMonitores();              //obtener todos los usuarios
        Task<List<string>> ObtenerEmailsPorIDMonitor(int idMonitor);
        Task<Monitores> ObtenerMonitorPorEmailPassword(string email, string password);
        Task<Monitores> ObtenerMonitorPorEmail(string email);
        Task<Monitores> GetDatosMonitorByID(int idMonitor);
        Task<Monitores> ActualizarMonitoByID(int idMonitor, Monitores monitor);
        Task<Monitores> ActualizarMonitorTabla(Monitores monitor);
        Task<Monitores> ActualizarMonitorDieta(Monitores monitor);
    }
}
