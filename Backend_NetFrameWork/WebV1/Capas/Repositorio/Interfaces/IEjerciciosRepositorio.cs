
using WebV1.Seguridad.Models;

namespace WebV1.Capas.Repositorio.Interfaces
{
    public interface IEjerciciosRepositorio
    {
       // Task<IEnumerable<Cita>> ObtenerTodasCitas();              //obtener todos los usuarios
        Task<Ejercicios> AgregarCita(Ejercicios ejercicio);                 //Agregar un usuario
        Task<Ejercicios> EliminarCitaByID(int idEjercicio);               //eliminar un usuario por el id
        Task<Ejercicios> ActualizarCitaByID(int id, Ejercicios ejercicio);  //actualizar un usuario
    
    }

}
