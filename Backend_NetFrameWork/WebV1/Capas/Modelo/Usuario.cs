using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Reflection.Metadata;
using WebV1.Seguridad.Models;

namespace WebV1.Capas.Modelo.Entidad
{
    [Table("Usuario")]
    public class Usuario
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("IDUSUARIO")]
        public int IdUSuario { get; set; }

        [Column("TIENEMONITOR")]
        public Boolean Tienemonitor { get; set; }
       
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

        public int? MonitorId { get; set; } // Optional foreign key property
        public Monitores? Monitor { get; set; } // Optional reference navigation to principal

    }
}

