using Microsoft.EntityFrameworkCore;

namespace DataBase
{

    public class WevApiContext : DbContext
    {

        public WevApiContext(DbContextOptions<WevApiContext> options) : base(options)
        {
            
        }

        public DbSet<Paciente> ListaPacientes { get; set;}
        public DbSet<Usuario> ListaUsuarios { get; set; }

        //este metodo lo que hace es cambiarte el nombre de la tabla 
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Usuario>().ToTable("Usuario");
            modelBuilder.Entity<Paciente>().ToTable("Paciente");
        }

    }
}