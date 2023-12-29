
using WebV1.Seguridad.Models;

namespace WebV1.Capas.Repositorio.Interfaces
{
    public interface IDietaRepositorio
    {
        Task<Dieta> ActualizarDieta(int id, Dieta dieta);                //eliminar un usuario por el id
        Task<Dieta> GetDatosDietaById(int idTabla);  //actualizar un usuario
    
    }

}
