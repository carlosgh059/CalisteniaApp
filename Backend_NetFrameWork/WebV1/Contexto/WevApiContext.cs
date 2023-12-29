using Microsoft.EntityFrameworkCore;
using System.Reflection.Emit;
using System.Reflection.Metadata;
using WebV1.Capas.Modelo.Entidad;
using WebV1.Seguridad.Models;
//herencia tpt, tph, tpc, CCTI 
namespace WebV1.Capas.Modelo.Data
{

    public class WevApiContext : DbContext
    {
        public DbSet<Usuario> ListaUsuarios { get; set; }
        public DbSet<Dieta> ListaDieta { get; set; }
        public DbSet<Tabla> ListaTabla { get; set; }
        public DbSet<Ejercicios> ListaEjercicios { get; set; }
        public DbSet<Monitores> ListaMonitores { get; set; }

        public WevApiContext(DbContextOptions<WevApiContext> options) : base(options)
        {

        }


        //este metodo lo que hace es cambiarte el nombre de la tabla 
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
  
            modelBuilder.Entity<Monitores>()
              .HasMany(e => e.ListaDeUSuarios)
              .WithOne(e => e.Monitor)
              .HasForeignKey(e => e.MonitorId)
              .IsRequired(false);
  
            
        }


    }
}