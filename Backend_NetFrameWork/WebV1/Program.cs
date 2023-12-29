using Microsoft.EntityFrameworkCore;
using System.Text.Json.Serialization;
using WebV1.Capas.Modelo.Data;
using WebV1.Capas.Repositorio.implementacion;
using WebV1.Capas.Repositorio.Interfaces;
using WebV1.Capas.Servicio.Implementacion;
using WebV1.Capas.Servicio.Interfaz;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();



builder.Services.AddControllers().AddJsonOptions(x =>
                x.JsonSerializerOptions.ReferenceHandler = ReferenceHandler.IgnoreCycles);


builder.Services.AddScoped<IUsuarioServicio, UsuarioServicio>();
builder.Services.AddScoped<IUsuarioRepositorio, UsuarioRepositorio>();
builder.Services.AddScoped<IMonitorServicio, MonitorServicio>();
builder.Services.AddScoped<IMonitorRepositorios, MonitorRepositorio>();
/*
//agregarmos el JWT
builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(option =>
{
    option.TokenValidationParameters = new Microsoft.IdentityModel.Tokens.TokenValidationParameters
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidateLifetime = true,
        ValidateIssuerSigningKey = true,
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        ValidAudience = builder.Configuration["Jwt:Audience"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});
*/
//Aqui hacemos la conexion con la base de datos
builder.Services.AddDbContext<WevApiContext>(options =>
{
    options.UseSqlServer(builder.Configuration.GetConnectionString("CadenaConexionSQLServer"));
    

});

var app = builder.Build();

//Consola adminitrdor de paquetes
/*
 *  Add-Migration InitDB
 *  Update-Database
 *  Drop-Table nombre_tabla
 *  Remove-Migration
 */
// Configure the HTTP request pipeline.

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();
//-----------JWT---------------
//app.UseAuthentication();
//--------------------------
app.UseAuthorization();

app.MapControllers();

app.Run();
