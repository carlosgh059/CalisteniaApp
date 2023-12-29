using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataBase
{
    public class Usuario
    {
        [Key] // PK
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)] //Esto es para autoincrementar
        public int id_usuario { get; set; }
        public string Nombre { get; set; }
        public string lugar { get; set; }

        //una colleccion de pacientes
        public virtual ICollection<Paciente> ListaPacientes { get; set; }

    }
}
