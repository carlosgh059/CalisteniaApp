
using WebV1.Seguridad.Models;

namespace WebV1.Capas.Repositorio.Interfaces
{
    public interface ITablaRepositorio
    {
       // Task<IEnumerable<Dieta>> ObtenerTodosMedicos();              //obtener todos los usuarios

        Task<Tabla> ActualizarTabla(int id, Tabla tabla);                 //Agregar un usuario
        Task<Tabla> GetDatosTablaById(int idTabla);               //eliminar un usuario por el id
    
    }

}
