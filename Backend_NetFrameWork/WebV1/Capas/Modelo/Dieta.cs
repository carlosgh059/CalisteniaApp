using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WebV1.Capas.Modelo.Entidad;

namespace WebV1.Seguridad.Models
{
    [Table("Dieta")]
    public class Dieta
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("IDDIETA")]
        public int IdDieta { get; set; }

        [Column("HORARIO1")]
        public string Horario1 { get; set; }

        [Column("HORARIO2")]
        public string Horario2 { get; set; }

        [Column("HORARIO3")]
        public string Horario3 { get; set; }

        [Column("HORARIO4")]
        public string Horario4 { get; set; }

        [Column("HORARIO5")]
        public string Horario5 { get; set; }

        [Column("HORARIO6")]
        public string Horario6 { get; set; }

        [Column("HORARIO7")]
        public string Horario7 { get; set; }

        [Column("HORARIO8")]
        public string Horario8 { get; set; }


        [Column("LUNES1")]
        public string Lunes1 { get; set; }
        [Column("LUNES2")]
        public string Lunes2 { get; set; }
        [Column("LUNES3")]
        public string Lunes3 { get; set; }
        [Column("LUNES4")]
        public string Lunes4 { get; set; }
        [Column("LUNES5")]
        public string Lunes5 { get; set; }
        [Column("LUNES6")]
        public string Lunes6 { get; set; }
        [Column("LUNES7")]
        public string Lunes7 { get; set; }
        [Column("LUNES8")]
        public string Lunes8 { get; set; }

        [Column("MARTES1")]
        public string Martes1 { get; set; }
        [Column("MARTES2")]
        public string Martes2 { get; set; }
        [Column("MARTES3")]
        public string Martes3 { get; set; }
        [Column("MARTES4")]
        public string Martes4 { get; set; }
        [Column("MARTES5")]
        public string Martes5 { get; set; }
        [Column("MARTES6")]
        public string Martes6 { get; set; }
        [Column("MARTES7")]
        public string Martes7 { get; set; }
        [Column("MARTES8")]
        public string Martes8 { get; set; }

        [Column("MIERCOLES1")]
        public string Miercoles1 { get; set; }
        [Column("MIERCOLES2")]
        public string Miercoles2 { get; set; }
        [Column("MIERCOLES3")]
        public string Miercoles3 { get; set; }
        [Column("MIERCOLES4")]
        public string Miercoles4 { get; set; }
        [Column("MIERCOLES5")]
        public string Miercoles5 { get; set; }
        [Column("MIERCOLES6")]
        public string Miercoles6 { get; set; }
        [Column("MIERCOLES7")]
        public string Miercoles7 { get; set; }
        [Column("MIERCOLES8")]
        public string Miercoles8 { get; set; }

        [Column("JUEVES1")]
        public string Jueves1 { get; set; }
        [Column("JUEVES2")]
        public string Jueves2 { get; set; }
        [Column("JUEVES3")]
        public string Jueves3 { get; set; }
        [Column("JUEVES4")]
        public string Jueves4 { get; set; }
        [Column("JUEVES5")]
        public string Jueves5 { get; set; }
        [Column("JUEVES6")]
        public string Jueves6 { get; set; }
        [Column("JUEVES7")]
        public string Jueves7 { get; set; }
        [Column("JUEVES8")]
        public string Jueves8 { get; set; }

        [Column("VIERNES1")]
        public string Viernes1 { get; set; }
        [Column("VIERNES2")]
        public string Viernes2 { get; set; }
        [Column("VIERNES3")]
        public string Viernes3 { get; set; }
        [Column("VIERNES4")]
        public string Viernes4 { get; set; }
        [Column("VIERNES5")]
        public string Viernes5 { get; set; }
        [Column("VIERNES6")]
        public string Viernes6 { get; set; }
        [Column("VIERNES7")]
        public string Viernes7 { get; set; }
        [Column("VIERNES8")]
        public string Viernes8 { get; set; }

        [Column("SABADO1")]
        public string Sabado1 { get; set; }
        [Column("SABADO2")]
        public string Sabado2 { get; set; }
        [Column("SABADO3")]
        public string Sabado3 { get; set; }
        [Column("SABADO4")]
        public string Sabado4 { get; set; }
        [Column("SABADO5")]
        public string Sabado5 { get; set; }
        [Column("SABADO6")]
        public string Sabado6 { get; set; }
        [Column("SABADO7")]
        public string Sabado7 { get; set; }
        [Column("SABADO8")]
        public string Sabado8 { get; set; }


        [Column("DOMINGO1")]
        public string Domingo1 { get; set; }
        [Column("DOMINGO2")]
        public string Domingo2 { get; set; }
        [Column("DOMINGO3")]
        public string Domingo3 { get; set; }
        [Column("DOMINGO4")]
        public string Domingo4 { get; set; }
        [Column("DOMINGO5")]
        public string Domingo5 { get; set; }
        [Column("DOMINGO6")]
        public string Domingo6 { get; set; }
        [Column("DOMINGO7")]
        public string Domingo7 { get; set; }
        [Column("DOMINGO8")]
        public string Domingo8 { get; set; }


    }
}