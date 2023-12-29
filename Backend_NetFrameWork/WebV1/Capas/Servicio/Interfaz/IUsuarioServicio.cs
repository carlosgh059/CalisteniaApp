using WebV1.Capas.Modelo.Entidad;

namespace WebV1.Capas.Servicio.Interfaz
{
    public interface IUsuarioServicio
    {
        Task<IEnumerable<Usuario>> ObtenerTodosUsuarios();              //obtener todos los usuarios
        Task<Usuario> AgregarUsuario(Usuario usuario);
        Task<Usuario> GetDatosUsuarioByID(int idUsuario);
        Task<Usuario> ActualizarUsuarioById(int id, Usuario usuario);
        Task<Usuario> ObtenerUsuarioPorEmailPassword(string email, string password);
        Task<Usuario> ActualizarUsuarioTabla(Usuario usuario);
        Task<Usuario> ActualizarUsuarioDieta(Usuario usuario);
        Task<Usuario> ActualizarUsuarioMonitor(int id, int ids);
        Task<Usuario> ObtenerUsuarioPorEmail(string email);

    }
}
