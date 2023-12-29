using Microsoft.EntityFrameworkCore;
using WebV1.Capas.Modelo.Data;
using WebV1.Capas.Modelo.Entidad;
using WebV1.Capas.Repositorio.Interfaces;

namespace WebV1.Capas.Repositorio.implementacion
{
    public class UsuarioRepositorio : IUsuarioRepositorio
    {
        private readonly WevApiContext _context;


        public UsuarioRepositorio(WevApiContext context)
        {
            _context = context;

        }


        public async Task<Usuario> ActualizarUsuarioTabla(Usuario usuario)
        {
            _context.Entry(usuario).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return usuario;
        }

        public async Task<Usuario> ActualizarUsuarioById(int id, Usuario usuario)
        {
            var usuarioExistente = await _context.ListaUsuarios.FindAsync(id);

            if (usuarioExistente != null)
            {
                usuarioExistente.Nombre = usuario.Nombre;
                usuarioExistente.Apellidos = usuario.Apellidos;
                usuarioExistente.Peso = usuario.Peso;
                usuarioExistente.Edad = usuario.Edad;
                usuarioExistente.Foto = usuario.Foto;
                usuarioExistente.Email = usuario.Email;
                usuarioExistente.Password = usuario.Password;

                await _context.SaveChangesAsync();
                return usuarioExistente;
            }

            return null; // El usuario no existe
        }

        public async Task<Usuario> AgregarUsuario(Usuario usuario)
        {
            _context.ListaUsuarios.Add(usuario);
            await _context.SaveChangesAsync();
            return usuario;
        }

        public async Task<Usuario> GetDatosUsuarioByID(int idUsuario)
        {
            var usuario = await _context.ListaUsuarios
              .Include(u => u.tabla)
              .Include(u => u.dieta)
              .FirstOrDefaultAsync(u => u.IdUSuario == idUsuario);

            return usuario;
        }

        public async Task<IEnumerable<Usuario>> ObtenerTodosUsuarios()
        {

            var usuarios = await _context.ListaUsuarios
                .Include(u => u.tabla)
                .Include(u => u.dieta)
                .ToListAsync();

            return usuarios;
        }

        public async Task<Usuario> ObtenerUsuarioPorEmailPassword(string email, string password)
        {
            var usuario = await _context.ListaUsuarios.FirstOrDefaultAsync(u => u.Email == email && u.Password == password);
            return usuario;
        }

        public async Task<Usuario> ActualizarUsuarioMonitor(int id, int ids)
        {
            var usuarioExistente = await _context.ListaUsuarios.FindAsync(id);

            if (usuarioExistente != null)
            {
                usuarioExistente.Tienemonitor = true;
                usuarioExistente.MonitorId = ids;

                await _context.SaveChangesAsync();
                return usuarioExistente;
            }

            return null; // El usuario no existe
        }

        public async Task<Usuario> ActualizarUsuarioDieta(Usuario usuario)
        {
            _context.Entry(usuario).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return usuario;
        }

        public async Task<Usuario> ObtenerUsuarioPorEmail(string email)
        {
            return await _context.ListaUsuarios
                        .Include(u => u.tabla)
                        .Include(u => u.dieta)
                        .FirstOrDefaultAsync(u => u.Email == email);
        }
    }
}
