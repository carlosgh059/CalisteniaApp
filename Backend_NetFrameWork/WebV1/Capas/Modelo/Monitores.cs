using Microsoft.Extensions.Hosting;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using WebV1.Capas.Modelo.Entidad;
using WebV1.Seguridad.Models;

namespace WebV1.Capas.Modelo
{
    [Table("Monitor")]
    public class Monitores
    {

        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("IDMONITOR")]
        public int IdMonitor { get; set; }

        [Column("NOMBRE")]
        public string Nombre { get; set; }

        [Column("APELLIDOS")]
        public string Apellidos { get; set; }

        [Column("PESO")]
        public string Peso { get; set; }

        [Column("EDAD")]
        public string Edad { get; set; }

        [Column("FOTO")]
        public string Foto { get; set; }

        [Required]
        [Column("EMAIL", TypeName = "varchar(255)")]
        public string Email { get; set; }

        [Required]
        [Column("PASSWORD")]
        public string Password { get; set; }

        [ForeignKey("Tabla")]
        public virtual Tabla tabla { get; set; }

        [ForeignKey("Dieta")]
        public virtual Dieta dieta { get; set; }


        public virtual ICollection<Usuario> ListaDeUSuarios{ get; set;}  

    }
}
