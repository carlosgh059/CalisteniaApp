using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebV1.Seguridad.Models
{
    [Table("Ejercicio")]

    public class Ejercicios
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("IDEJERCICIOS")]
        public int IdEjercicio { get; set; }


    }
}
