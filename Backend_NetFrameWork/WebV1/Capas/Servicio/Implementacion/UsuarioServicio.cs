using WebV1.Capas.Modelo.Entidad;
using WebV1.Capas.Repositorio.Interfaces;
using WebV1.Capas.Servicio.Interfaz;

namespace WebV1.Capas.Servicio.Implementacion
{
    public class UsuarioServicio : IUsuarioServicio
    {

        private readonly IUsuarioRepositorio _usuarioRepositorio;

        public UsuarioServicio(IUsuarioRepositorio usuarioRepositorio)
        {
            _usuarioRepositorio = usuarioRepositorio;
        }
        public async Task<Usuario> ActualizarUsuarioById(int id, Usuario usuario)
        {
            return await _usuarioRepositorio.ActualizarUsuarioById(id, usuario);
        }

        public async Task<Usuario> ActualizarUsuarioDieta(Usuario usuario)
        {
            return await _usuarioRepositorio.ActualizarUsuarioDieta(usuario);
        }

        public async Task<Usuario> ActualizarUsuarioMonitor(int id, int ids)
        {
            return await _usuarioRepositorio.ActualizarUsuarioMonitor(id, ids);
        }

        public  async Task<Usuario> ActualizarUsuarioTabla(Usuario usuario)
        {
            return await _usuarioRepositorio.ActualizarUsuarioTabla(usuario);
        }

        public async Task<Usuario> AgregarUsuario(Usuario usuario)
        {
            return await _usuarioRepositorio.AgregarUsuario(usuario);
        }

        public async Task<Usuario> GetDatosUsuarioByID(int idUsuario)
        {
            return await _usuarioRepositorio.GetDatosUsuarioByID(idUsuario);
        }

        public async Task<IEnumerable<Usuario>> ObtenerTodosUsuarios()
        {
            return await  _usuarioRepositorio.ObtenerTodosUsuarios();
        }

        public async Task<Usuario> ObtenerUsuarioPorEmail(string email)
        {
            return await _usuarioRepositorio.ObtenerUsuarioPorEmail(email);
        }

        public async Task<Usuario> ObtenerUsuarioPorEmailPassword(string email, string password)
        {
            return await _usuarioRepositorio.ObtenerUsuarioPorEmailPassword(email,password);
        }
    }
}
