using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataBase
{
    public class Paciente
    {

        [Key]//PK
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)] //Esto es para autoincrementar
        public int id_paciente { set; get; }
        public string nombreUsuario { set; get; }
        public int id_usuario{ get; set; }

        //Aqui hacemos el enlace de Paciente a usuario
        [ForeignKey("id_usuario")]
        public virtual Usuario usuario { set; get; }
    }
}
