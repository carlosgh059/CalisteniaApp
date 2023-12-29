using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace WebV1.Migrations
{
    /// <inheritdoc />
    public partial class InitDB : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Dieta",
                columns: table => new
                {
                    IDDIETA = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    HORARIO1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO8 = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Dieta", x => x.IDDIETA);
                });

            migrationBuilder.CreateTable(
                name: "Ejercicio",
                columns: table => new
                {
                    IDEJERCICIOS = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1")
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Ejercicio", x => x.IDEJERCICIOS);
                });

            migrationBuilder.CreateTable(
                name: "Tabla",
                columns: table => new
                {
                    IDTABLA = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    HORARIO1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    HORARIO8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    LUNES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MARTES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    MIERCOLES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    JUEVES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    VIERNES8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SABADO8 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO1 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO2 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO3 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO4 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO5 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO6 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO7 = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    DOMINGO8 = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Tabla", x => x.IDTABLA);
                });

            migrationBuilder.CreateTable(
                name: "Monitor",
                columns: table => new
                {
                    IDMONITOR = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    NOMBRE = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    APELLIDOS = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    PESO = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    EDAD = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    FOTO = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    EMAIL = table.Column<string>(type: "varchar(255)", nullable: false),
                    PASSWORD = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Tabla = table.Column<int>(type: "int", nullable: false),
                    Dieta = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Monitor", x => x.IDMONITOR);
                    table.ForeignKey(
                        name: "FK_Monitor_Dieta_Dieta",
                        column: x => x.Dieta,
                        principalTable: "Dieta",
                        principalColumn: "IDDIETA",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_Monitor_Tabla_Tabla",
                        column: x => x.Tabla,
                        principalTable: "Tabla",
                        principalColumn: "IDTABLA",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Usuario",
                columns: table => new
                {
                    IDUSUARIO = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    TIENEMONITOR = table.Column<bool>(type: "bit", nullable: false),
                    NOMBRE = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    APELLIDOS = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    PESO = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    EDAD = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    FOTO = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    EMAIL = table.Column<string>(type: "varchar(255)", nullable: false),
                    PASSWORD = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Tabla = table.Column<int>(type: "int", nullable: false),
                    Dieta = table.Column<int>(type: "int", nullable: false),
                    MonitorId = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Usuario", x => x.IDUSUARIO);
                    table.ForeignKey(
                        name: "FK_Usuario_Dieta_Dieta",
                        column: x => x.Dieta,
                        principalTable: "Dieta",
                        principalColumn: "IDDIETA",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_Usuario_Monitor_MonitorId",
                        column: x => x.MonitorId,
                        principalTable: "Monitor",
                        principalColumn: "IDMONITOR");
                    table.ForeignKey(
                        name: "FK_Usuario_Tabla_Tabla",
                        column: x => x.Tabla,
                        principalTable: "Tabla",
                        principalColumn: "IDTABLA",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Monitor_Dieta",
                table: "Monitor",
                column: "Dieta");

            migrationBuilder.CreateIndex(
                name: "IX_Monitor_Tabla",
                table: "Monitor",
                column: "Tabla");

            migrationBuilder.CreateIndex(
                name: "IX_Usuario_Dieta",
                table: "Usuario",
                column: "Dieta");

            migrationBuilder.CreateIndex(
                name: "IX_Usuario_MonitorId",
                table: "Usuario",
                column: "MonitorId");

            migrationBuilder.CreateIndex(
                name: "IX_Usuario_Tabla",
                table: "Usuario",
                column: "Tabla");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Ejercicio");

            migrationBuilder.DropTable(
                name: "Usuario");

            migrationBuilder.DropTable(
                name: "Monitor");

            migrationBuilder.DropTable(
                name: "Dieta");

            migrationBuilder.DropTable(
                name: "Tabla");
        }
    }
}
