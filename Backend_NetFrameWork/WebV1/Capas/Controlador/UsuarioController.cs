using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using WebV1.Capas.Modelo;
using WebV1.Capas.Modelo.Entidad;
using WebV1.Capas.Servicio.Interfaz;

namespace WebV1.Capas.Controlador
{
    
    [Route("api/[controller]")]
    [ApiController]
    public class UsuarioController : ControllerBase
    {
        public static int idUsuarioMio =0;

        private readonly IUsuarioServicio _usuarioServicio;
        private readonly IMonitorServicio _monitorServicio;


        public UsuarioController(IUsuarioServicio usuarioServicio, IMonitorServicio monitorServicio)
        {
            _usuarioServicio = usuarioServicio;
            _monitorServicio = monitorServicio;
        }


        [HttpPut("ActualizarDatosMonitor")]
        public async Task<IActionResult> ActualizarDatosMonitor(Monitores monitor)

        {
            var monitorExistente = await _monitorServicio.GetDatosMonitorByID(idUsuarioMio);

            if (monitorExistente == null)
            {
                return NotFound(idUsuarioMio); // Monitor no encontrado
            }

            // Actualizar los datos del monitor existente
            monitorExistente.Nombre = monitor.Nombre;
            monitorExistente.Apellidos = monitor.Apellidos;
            monitorExistente.Peso = monitor.Peso;
            monitorExistente.Edad = monitor.Edad;
            monitorExistente.Email = monitor.Email;
            monitorExistente.Password = monitor.Password;
            monitorExistente.Foto = monitor.Foto;

            await _monitorServicio.ActualizarMonitoByID(idUsuarioMio, monitorExistente); // Actualizar el monitor en el servicio

            return Ok(monitorExistente); // Devolver el monitor actualizado
        }

        [HttpPut("DietaCambiarUsuario/{email}")]
        public async Task<IActionResult> CambiarDietaUsuarioXEmail(string email, Usuario usuarios)
        {

            if (email.Equals("yo"))
            {

                var usuarioExistente = await _monitorServicio.GetDatosMonitorByID(idUsuarioMio);

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Horario1 = usuarios.dieta.Horario1;
                usuarioExistente.dieta.Horario2 = usuarios.dieta.Horario2;
                usuarioExistente.dieta.Horario3 = usuarios.dieta.Horario3;
                usuarioExistente.dieta.Horario4 = usuarios.dieta.Horario4;
                usuarioExistente.dieta.Horario5 = usuarios.dieta.Horario5;
                usuarioExistente.dieta.Horario6 = usuarios.dieta.Horario6;
                usuarioExistente.dieta.Horario7 = usuarios.dieta.Horario7;
                usuarioExistente.dieta.Horario8 = usuarios.dieta.Horario8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Lunes1 = usuarios.dieta.Lunes1;
                usuarioExistente.dieta.Lunes2 = usuarios.dieta.Lunes2;
                usuarioExistente.dieta.Lunes3 = usuarios.dieta.Lunes3;
                usuarioExistente.dieta.Lunes4 = usuarios.dieta.Lunes4;
                usuarioExistente.dieta.Lunes5 = usuarios.dieta.Lunes5;
                usuarioExistente.dieta.Lunes6 = usuarios.dieta.Lunes6;
                usuarioExistente.dieta.Lunes7 = usuarios.dieta.Lunes7;
                usuarioExistente.dieta.Lunes8 = usuarios.dieta.Lunes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Martes1 = usuarios.dieta.Martes1;
                usuarioExistente.dieta.Martes2 = usuarios.dieta.Martes2;
                usuarioExistente.dieta.Martes3 = usuarios.dieta.Martes3;
                usuarioExistente.dieta.Martes4 = usuarios.dieta.Martes4;
                usuarioExistente.dieta.Martes5 = usuarios.dieta.Martes5;
                usuarioExistente.dieta.Martes6 = usuarios.dieta.Martes6;
                usuarioExistente.dieta.Martes7 = usuarios.dieta.Martes7;
                usuarioExistente.dieta.Martes8 = usuarios.dieta.Martes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Miercoles1 = usuarios.dieta.Miercoles1;
                usuarioExistente.dieta.Miercoles2 = usuarios.dieta.Miercoles2;
                usuarioExistente.dieta.Miercoles3 = usuarios.dieta.Miercoles3;
                usuarioExistente.dieta.Miercoles4 = usuarios.dieta.Miercoles4;
                usuarioExistente.dieta.Miercoles5 = usuarios.dieta.Miercoles5;
                usuarioExistente.dieta.Miercoles6 = usuarios.dieta.Miercoles6;
                usuarioExistente.dieta.Miercoles7 = usuarios.dieta.Miercoles7;
                usuarioExistente.dieta.Miercoles8 = usuarios.dieta.Miercoles8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Jueves1 = usuarios.dieta.Jueves1;
                usuarioExistente.dieta.Jueves2 = usuarios.dieta.Jueves2;
                usuarioExistente.dieta.Jueves3 = usuarios.dieta.Jueves3;
                usuarioExistente.dieta.Jueves4 = usuarios.dieta.Jueves4;
                usuarioExistente.dieta.Jueves5 = usuarios.dieta.Jueves5;
                usuarioExistente.dieta.Jueves6 = usuarios.dieta.Jueves6;
                usuarioExistente.dieta.Jueves7 = usuarios.dieta.Jueves7;
                usuarioExistente.dieta.Jueves8 = usuarios.dieta.Jueves8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Viernes1 = usuarios.dieta.Viernes1;
                usuarioExistente.dieta.Viernes2 = usuarios.dieta.Viernes2;
                usuarioExistente.dieta.Viernes3 = usuarios.dieta.Viernes3;
                usuarioExistente.dieta.Viernes4 = usuarios.dieta.Viernes4;
                usuarioExistente.dieta.Viernes5 = usuarios.dieta.Viernes5;
                usuarioExistente.dieta.Viernes6 = usuarios.dieta.Viernes6;
                usuarioExistente.dieta.Viernes7 = usuarios.dieta.Viernes7;
                usuarioExistente.dieta.Viernes8 = usuarios.dieta.Viernes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Sabado1 = usuarios.dieta.Sabado1;
                usuarioExistente.dieta.Sabado2 = usuarios.dieta.Sabado2;
                usuarioExistente.dieta.Sabado3 = usuarios.dieta.Sabado3;
                usuarioExistente.dieta.Sabado4 = usuarios.dieta.Sabado4;
                usuarioExistente.dieta.Sabado5 = usuarios.dieta.Sabado5;
                usuarioExistente.dieta.Sabado6 = usuarios.dieta.Sabado6;
                usuarioExistente.dieta.Sabado7 = usuarios.dieta.Sabado7;
                usuarioExistente.dieta.Sabado8 = usuarios.dieta.Sabado8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Domingo1 = usuarios.dieta.Domingo1;
                usuarioExistente.dieta.Domingo2 = usuarios.dieta.Domingo2;
                usuarioExistente.dieta.Domingo3 = usuarios.dieta.Domingo3;
                usuarioExistente.dieta.Domingo4 = usuarios.dieta.Domingo4;
                usuarioExistente.dieta.Domingo5 = usuarios.dieta.Domingo5;
                usuarioExistente.dieta.Domingo6 = usuarios.dieta.Domingo6;
                usuarioExistente.dieta.Domingo7 = usuarios.dieta.Domingo7;
                usuarioExistente.dieta.Domingo8 = usuarios.dieta.Domingo8;
                await _monitorServicio.ActualizarMonitorDieta(usuarioExistente);
                return Ok();

            }
            else
            { 
               

             var usuarioExistente = await _usuarioServicio.ObtenerUsuarioPorEmail(email);
            if (usuarioExistente != null)
            {

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Horario1 = usuarios.dieta.Horario1;
                usuarioExistente.dieta.Horario2 = usuarios.dieta.Horario2;
                usuarioExistente.dieta.Horario3 = usuarios.dieta.Horario3;
                usuarioExistente.dieta.Horario4 = usuarios.dieta.Horario4;
                usuarioExistente.dieta.Horario5 = usuarios.dieta.Horario5;
                usuarioExistente.dieta.Horario6 = usuarios.dieta.Horario6;
                usuarioExistente.dieta.Horario7 = usuarios.dieta.Horario7;
                usuarioExistente.dieta.Horario8 = usuarios.dieta.Horario8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Lunes1 = usuarios.dieta.Lunes1;
                usuarioExistente.dieta.Lunes2 = usuarios.dieta.Lunes2;
                usuarioExistente.dieta.Lunes3 = usuarios.dieta.Lunes3;
                usuarioExistente.dieta.Lunes4 = usuarios.dieta.Lunes4;
                usuarioExistente.dieta.Lunes5 = usuarios.dieta.Lunes5;
                usuarioExistente.dieta.Lunes6 = usuarios.dieta.Lunes6;
                usuarioExistente.dieta.Lunes7 = usuarios.dieta.Lunes7;
                usuarioExistente.dieta.Lunes8 = usuarios.dieta.Lunes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Martes1 = usuarios.dieta.Martes1;
                usuarioExistente.dieta.Martes2 = usuarios.dieta.Martes2;
                usuarioExistente.dieta.Martes3 = usuarios.dieta.Martes3;
                usuarioExistente.dieta.Martes4 = usuarios.dieta.Martes4;
                usuarioExistente.dieta.Martes5 = usuarios.dieta.Martes5;
                usuarioExistente.dieta.Martes6 = usuarios.dieta.Martes6;
                usuarioExistente.dieta.Martes7 = usuarios.dieta.Martes7;
                usuarioExistente.dieta.Martes8 = usuarios.dieta.Martes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Miercoles1 = usuarios.dieta.Miercoles1;
                usuarioExistente.dieta.Miercoles2 = usuarios.dieta.Miercoles2;
                usuarioExistente.dieta.Miercoles3 = usuarios.dieta.Miercoles3;
                usuarioExistente.dieta.Miercoles4 = usuarios.dieta.Miercoles4;
                usuarioExistente.dieta.Miercoles5 = usuarios.dieta.Miercoles5;
                usuarioExistente.dieta.Miercoles6 = usuarios.dieta.Miercoles6;
                usuarioExistente.dieta.Miercoles7 = usuarios.dieta.Miercoles7;
                usuarioExistente.dieta.Miercoles8 = usuarios.dieta.Miercoles8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Jueves1 = usuarios.dieta.Jueves1;
                usuarioExistente.dieta.Jueves2 = usuarios.dieta.Jueves2;
                usuarioExistente.dieta.Jueves3 = usuarios.dieta.Jueves3;
                usuarioExistente.dieta.Jueves4 = usuarios.dieta.Jueves4;
                usuarioExistente.dieta.Jueves5 = usuarios.dieta.Jueves5;
                usuarioExistente.dieta.Jueves6 = usuarios.dieta.Jueves6;
                usuarioExistente.dieta.Jueves7 = usuarios.dieta.Jueves7;
                usuarioExistente.dieta.Jueves8 = usuarios.dieta.Jueves8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Viernes1 = usuarios.dieta.Viernes1;
                usuarioExistente.dieta.Viernes2 = usuarios.dieta.Viernes2;
                usuarioExistente.dieta.Viernes3 = usuarios.dieta.Viernes3;
                usuarioExistente.dieta.Viernes4 = usuarios.dieta.Viernes4;
                usuarioExistente.dieta.Viernes5 = usuarios.dieta.Viernes5;
                usuarioExistente.dieta.Viernes6 = usuarios.dieta.Viernes6;
                usuarioExistente.dieta.Viernes7 = usuarios.dieta.Viernes7;
                usuarioExistente.dieta.Viernes8 = usuarios.dieta.Viernes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Sabado1 = usuarios.dieta.Sabado1;
                usuarioExistente.dieta.Sabado2 = usuarios.dieta.Sabado2;
                usuarioExistente.dieta.Sabado3 = usuarios.dieta.Sabado3;
                usuarioExistente.dieta.Sabado4 = usuarios.dieta.Sabado4;
                usuarioExistente.dieta.Sabado5 = usuarios.dieta.Sabado5;
                usuarioExistente.dieta.Sabado6 = usuarios.dieta.Sabado6;
                usuarioExistente.dieta.Sabado7 = usuarios.dieta.Sabado7;
                usuarioExistente.dieta.Sabado8 = usuarios.dieta.Sabado8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Domingo1 = usuarios.dieta.Domingo1;
                usuarioExistente.dieta.Domingo2 = usuarios.dieta.Domingo2;
                usuarioExistente.dieta.Domingo3 = usuarios.dieta.Domingo3;
                usuarioExistente.dieta.Domingo4 = usuarios.dieta.Domingo4;
                usuarioExistente.dieta.Domingo5 = usuarios.dieta.Domingo5;
                usuarioExistente.dieta.Domingo6 = usuarios.dieta.Domingo6;
                usuarioExistente.dieta.Domingo7 = usuarios.dieta.Domingo7;
                usuarioExistente.dieta.Domingo8 = usuarios.dieta.Domingo8;
                await _usuarioServicio.ActualizarUsuarioTabla(usuarioExistente);
                return Ok();
            }
            else
            {
                return NotFound();
            }
            }
        }

        [HttpPut("TablaCambiarUsuario/{email}")]
        public async Task<IActionResult> CambiarTablaUsuarioXEmail(string email, Usuario usuarios)
        {
            if (email.Equals("yo"))
            {
                var usuarioExistente = await _monitorServicio.GetDatosMonitorByID(idUsuarioMio);
                if (usuarioExistente != null)
                {
                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Horario1 = usuarios.tabla.Horario1;
                    usuarioExistente.tabla.Horario2 = usuarios.tabla.Horario2;
                    usuarioExistente.tabla.Horario3 = usuarios.tabla.Horario3;
                    usuarioExistente.tabla.Horario4 = usuarios.tabla.Horario4;
                    usuarioExistente.tabla.Horario5 = usuarios.tabla.Horario5;
                    usuarioExistente.tabla.Horario6 = usuarios.tabla.Horario6;
                    usuarioExistente.tabla.Horario7 = usuarios.tabla.Horario7;
                    usuarioExistente.tabla.Horario8 = usuarios.tabla.Horario8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Lunes1 = usuarios.tabla.Lunes1;
                    usuarioExistente.tabla.Lunes2 = usuarios.tabla.Lunes2;
                    usuarioExistente.tabla.Lunes3 = usuarios.tabla.Lunes3;
                    usuarioExistente.tabla.Lunes4 = usuarios.tabla.Lunes4;
                    usuarioExistente.tabla.Lunes5 = usuarios.tabla.Lunes5;
                    usuarioExistente.tabla.Lunes6 = usuarios.tabla.Lunes6;
                    usuarioExistente.tabla.Lunes7 = usuarios.tabla.Lunes7;
                    usuarioExistente.tabla.Lunes8 = usuarios.tabla.Lunes8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Martes1 = usuarios.tabla.Martes1;
                    usuarioExistente.tabla.Martes2 = usuarios.tabla.Martes2;
                    usuarioExistente.tabla.Martes3 = usuarios.tabla.Martes3;
                    usuarioExistente.tabla.Martes4 = usuarios.tabla.Martes4;
                    usuarioExistente.tabla.Martes5 = usuarios.tabla.Martes5;
                    usuarioExistente.tabla.Martes6 = usuarios.tabla.Martes6;
                    usuarioExistente.tabla.Martes7 = usuarios.tabla.Martes7;
                    usuarioExistente.tabla.Martes8 = usuarios.tabla.Martes8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Miercoles1 = usuarios.tabla.Miercoles1;
                    usuarioExistente.tabla.Miercoles2 = usuarios.tabla.Miercoles2;
                    usuarioExistente.tabla.Miercoles3 = usuarios.tabla.Miercoles3;
                    usuarioExistente.tabla.Miercoles4 = usuarios.tabla.Miercoles4;
                    usuarioExistente.tabla.Miercoles5 = usuarios.tabla.Miercoles5;
                    usuarioExistente.tabla.Miercoles6 = usuarios.tabla.Miercoles6;
                    usuarioExistente.tabla.Miercoles7 = usuarios.tabla.Miercoles7;
                    usuarioExistente.tabla.Miercoles8 = usuarios.tabla.Miercoles8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Jueves1 = usuarios.tabla.Jueves1;
                    usuarioExistente.tabla.Jueves2 = usuarios.tabla.Jueves2;
                    usuarioExistente.tabla.Jueves3 = usuarios.tabla.Jueves3;
                    usuarioExistente.tabla.Jueves4 = usuarios.tabla.Jueves4;
                    usuarioExistente.tabla.Jueves5 = usuarios.tabla.Jueves5;
                    usuarioExistente.tabla.Jueves6 = usuarios.tabla.Jueves6;
                    usuarioExistente.tabla.Jueves7 = usuarios.tabla.Jueves7;
                    usuarioExistente.tabla.Jueves8 = usuarios.tabla.Jueves8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Viernes1 = usuarios.tabla.Viernes1;
                    usuarioExistente.tabla.Viernes2 = usuarios.tabla.Viernes2;
                    usuarioExistente.tabla.Viernes3 = usuarios.tabla.Viernes3;
                    usuarioExistente.tabla.Viernes4 = usuarios.tabla.Viernes4;
                    usuarioExistente.tabla.Viernes5 = usuarios.tabla.Viernes5;
                    usuarioExistente.tabla.Viernes6 = usuarios.tabla.Viernes6;
                    usuarioExistente.tabla.Viernes7 = usuarios.tabla.Viernes7;
                    usuarioExistente.tabla.Viernes8 = usuarios.tabla.Viernes8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Sabado1 = usuarios.tabla.Sabado1;
                    usuarioExistente.tabla.Sabado2 = usuarios.tabla.Sabado2;
                    usuarioExistente.tabla.Sabado3 = usuarios.tabla.Sabado3;
                    usuarioExistente.tabla.Sabado4 = usuarios.tabla.Sabado4;
                    usuarioExistente.tabla.Sabado5 = usuarios.tabla.Sabado5;
                    usuarioExistente.tabla.Sabado6 = usuarios.tabla.Sabado6;
                    usuarioExistente.tabla.Sabado7 = usuarios.tabla.Sabado7;
                    usuarioExistente.tabla.Sabado8 = usuarios.tabla.Sabado8;

                    // Actualizar la tabla del usuario
                    usuarioExistente.tabla.Domingo1 = usuarios.tabla.Domingo1;
                    usuarioExistente.tabla.Domingo2 = usuarios.tabla.Domingo2;
                    usuarioExistente.tabla.Domingo3 = usuarios.tabla.Domingo3;
                    usuarioExistente.tabla.Domingo4 = usuarios.tabla.Domingo4;
                    usuarioExistente.tabla.Domingo5 = usuarios.tabla.Domingo5;
                    usuarioExistente.tabla.Domingo6 = usuarios.tabla.Domingo6;
                    usuarioExistente.tabla.Domingo7 = usuarios.tabla.Domingo7;
                    usuarioExistente.tabla.Domingo8 = usuarios.tabla.Domingo8;


                    await _monitorServicio.ActualizarMonitorTabla(usuarioExistente);
                    return Ok(usuarioExistente);
                }
                else
                {
                   return NotFound();
                }
               

            }
            else
            {

          
            var usuarioExistente = await _usuarioServicio.ObtenerUsuarioPorEmail(email);
            
            if (usuarioExistente != null)
            {
                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Horario1 = usuarios.tabla.Horario1;
                usuarioExistente.tabla.Horario2 = usuarios.tabla.Horario2;
                usuarioExistente.tabla.Horario3 = usuarios.tabla.Horario3;
                usuarioExistente.tabla.Horario4 = usuarios.tabla.Horario4;
                usuarioExistente.tabla.Horario5 = usuarios.tabla.Horario5;
                usuarioExistente.tabla.Horario6 = usuarios.tabla.Horario6;
                usuarioExistente.tabla.Horario7 = usuarios.tabla.Horario7;
                usuarioExistente.tabla.Horario8 = usuarios.tabla.Horario8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Lunes1 = usuarios.tabla.Lunes1;
                usuarioExistente.tabla.Lunes2 = usuarios.tabla.Lunes2;
                usuarioExistente.tabla.Lunes3 = usuarios.tabla.Lunes3;
                usuarioExistente.tabla.Lunes4 = usuarios.tabla.Lunes4;
                usuarioExistente.tabla.Lunes5 = usuarios.tabla.Lunes5;
                usuarioExistente.tabla.Lunes6 = usuarios.tabla.Lunes6;
                usuarioExistente.tabla.Lunes7 = usuarios.tabla.Lunes7;
                usuarioExistente.tabla.Lunes8 = usuarios.tabla.Lunes8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Martes1 = usuarios.tabla.Martes1;
                usuarioExistente.tabla.Martes2 = usuarios.tabla.Martes2;
                usuarioExistente.tabla.Martes3 = usuarios.tabla.Martes3;
                usuarioExistente.tabla.Martes4 = usuarios.tabla.Martes4;
                usuarioExistente.tabla.Martes5 = usuarios.tabla.Martes5;
                usuarioExistente.tabla.Martes6 = usuarios.tabla.Martes6;
                usuarioExistente.tabla.Martes7 = usuarios.tabla.Martes7;
                usuarioExistente.tabla.Martes8 = usuarios.tabla.Martes8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Miercoles1 = usuarios.tabla.Miercoles1;
                usuarioExistente.tabla.Miercoles2 = usuarios.tabla.Miercoles2;
                usuarioExistente.tabla.Miercoles3 = usuarios.tabla.Miercoles3;
                usuarioExistente.tabla.Miercoles4 = usuarios.tabla.Miercoles4;
                usuarioExistente.tabla.Miercoles5 = usuarios.tabla.Miercoles5;
                usuarioExistente.tabla.Miercoles6 = usuarios.tabla.Miercoles6;
                usuarioExistente.tabla.Miercoles7 = usuarios.tabla.Miercoles7;
                usuarioExistente.tabla.Miercoles8 = usuarios.tabla.Miercoles8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Jueves1 = usuarios.tabla.Jueves1;
                usuarioExistente.tabla.Jueves2 = usuarios.tabla.Jueves2;
                usuarioExistente.tabla.Jueves3 = usuarios.tabla.Jueves3;
                usuarioExistente.tabla.Jueves4 = usuarios.tabla.Jueves4;
                usuarioExistente.tabla.Jueves5 = usuarios.tabla.Jueves5;
                usuarioExistente.tabla.Jueves6 = usuarios.tabla.Jueves6;
                usuarioExistente.tabla.Jueves7 = usuarios.tabla.Jueves7;
                usuarioExistente.tabla.Jueves8 = usuarios.tabla.Jueves8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Viernes1 = usuarios.tabla.Viernes1;
                usuarioExistente.tabla.Viernes2 = usuarios.tabla.Viernes2;
                usuarioExistente.tabla.Viernes3 = usuarios.tabla.Viernes3;
                usuarioExistente.tabla.Viernes4 = usuarios.tabla.Viernes4;
                usuarioExistente.tabla.Viernes5 = usuarios.tabla.Viernes5;
                usuarioExistente.tabla.Viernes6 = usuarios.tabla.Viernes6;
                usuarioExistente.tabla.Viernes7 = usuarios.tabla.Viernes7;
                usuarioExistente.tabla.Viernes8 = usuarios.tabla.Viernes8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Sabado1 = usuarios.tabla.Sabado1;
                usuarioExistente.tabla.Sabado2 = usuarios.tabla.Sabado2;
                usuarioExistente.tabla.Sabado3 = usuarios.tabla.Sabado3;
                usuarioExistente.tabla.Sabado4 = usuarios.tabla.Sabado4;
                usuarioExistente.tabla.Sabado5 = usuarios.tabla.Sabado5;
                usuarioExistente.tabla.Sabado6 = usuarios.tabla.Sabado6;
                usuarioExistente.tabla.Sabado7 = usuarios.tabla.Sabado7;
                usuarioExistente.tabla.Sabado8 = usuarios.tabla.Sabado8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Domingo1 = usuarios.tabla.Domingo1;
                usuarioExistente.tabla.Domingo2 = usuarios.tabla.Domingo2;
                usuarioExistente.tabla.Domingo3 = usuarios.tabla.Domingo3;
                usuarioExistente.tabla.Domingo4 = usuarios.tabla.Domingo4;
                usuarioExistente.tabla.Domingo5 = usuarios.tabla.Domingo5;
                usuarioExistente.tabla.Domingo6 = usuarios.tabla.Domingo6;
                usuarioExistente.tabla.Domingo7 = usuarios.tabla.Domingo7;
                usuarioExistente.tabla.Domingo8 = usuarios.tabla.Domingo8;


                await _usuarioServicio.ActualizarUsuarioTabla(usuarioExistente);
                return Ok(usuarioExistente);
            }
            else
            {
                return NotFound();
            }

            }
        }


        [HttpGet("DameusuarioXEmail/{email}")]
        public async Task<IActionResult> ObtenerUsuarioPorEmail(string email)
        {
            try
            {

           var monitores = await _monitorServicio.GetDatosMonitorByID(idUsuarioMio);         
           var usuario = await _usuarioServicio.ObtenerUsuarioPorEmail(email);
                if (usuario != null)
                {
                    return Ok(usuario);
                }
                else if(monitores != null)
                {
                    return Ok(monitores);
                }
                else
                {
                    return NotFound();
                }
           
            }catch (Exception ex)
            {
                return StatusCode(500, ex.Message);
            }
        }
    
       [HttpGet("Saludo")]
        public ActionResult<string> Saludo()
        {
            return Ok("Hola");
        }


        [HttpPost]
        public async Task<ActionResult<Usuario>> AgregarUsuario([FromBody] Usuario usuario)
        {
            var email = usuario.Email;

            var usuarios = await _usuarioServicio.ObtenerUsuarioPorEmail(email);
            var monitors = await _monitorServicio.ObtenerMonitorPorEmail(email);

            if(usuarios == null && monitors == null)
            {
                var nuevoUsuario = await _usuarioServicio.AgregarUsuario(usuario);
                return CreatedAtAction(nameof(GetDatosUsuarioByID), new { id = nuevoUsuario.IdUSuario }, nuevoUsuario);
            }
            else
            {
                return NotFound();
            }

         
        }


        [HttpGet("DAmeEmailUsuariosXMonitor")]
        public async Task<IActionResult> ObtenerEmailUsuariosXMonitor(int idMonitor)
        {
            try
            {
                var emails = await _monitorServicio.ObtenerEmailsPorIDMonitor(idUsuarioMio);
                if (emails == null)
                    return NotFound();

                return Ok(emails);
            }
            catch (Exception ex)
            {
                return StatusCode(500, "Ocurrió un error en el servidor");
            }
        }



        [HttpGet]
        public async Task<ActionResult<IEnumerable<Usuario>>> ObtenerTodosUsuarios()
        {
            var usuarios = await _usuarioServicio.ObtenerTodosUsuarios();
            return Ok(usuarios);
        }





        [HttpGet("TodosMonitores")]
        public async Task<ActionResult<IEnumerable<Monitores>>> ObtenerTodosMonitores()
        {
            var monitores = await _monitorServicio.ObtenerTodosMonitores();
            return Ok(monitores);
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Usuario>> GetDatosUsuarioByID(int id)
        {
            var usuario = await _usuarioServicio.GetDatosUsuarioByID(id);

            if (usuario == null)
                return NotFound();

            return Ok("El id del suario es " + idUsuarioMio+" "+ usuario);
        }

     
        [HttpPut("{id}")]
        public async Task<IActionResult> ActualizarUsuarioById(int id, [FromBody] Usuario usuario)
        {
            usuario.IdUSuario = idUsuarioMio; // Asignar el valor del id al objeto usuario

            var usuarioActualizado = await _usuarioServicio.ActualizarUsuarioById(idUsuarioMio, usuario);

            if (usuarioActualizado == null)
                return NotFound();

            return Ok("Usuario Actualizado");
        }

        [HttpPost("Login")]
        public async Task<IActionResult> Login(string email, string password)
        {
            var usuario = await _usuarioServicio.ObtenerUsuarioPorEmailPassword(email, password);
            var monitor = await _monitorServicio.ObtenerMonitorPorEmailPassword(email, password);


            if (usuario != null)
            {
                idUsuarioMio = usuario.IdUSuario; // Guardar el ID del usuario en la variable idUsuarioMio
                return Ok("usuario"); // Devolver un resultado "OK"
            }

            if (monitor != null)
            {
                idUsuarioMio = monitor.IdMonitor; // Guardar el ID del usuario en la variable idUsuarioMio
                return Ok("monitor"); // Devolver un resultado "OK"
            }

            return NotFound(); // Usuario no encontrado
        }

        [HttpGet("CargarDatosUsuario")]
        public async Task<IActionResult> CargarDatosUsuario()
        {

            try
            {
                Debug.Write("El id del usuario es " + idUsuarioMio);
                // Obtener el usuario según el ID guardado en la variable idUsuarioMio
                var usuario = await _usuarioServicio.GetDatosUsuarioByID(idUsuarioMio);

                if (usuario != null)
                {
                    // Devolver los datos del usuario en un objeto JSON
                    return Ok(usuario);
                }

                return NotFound(); // Usuario no encontrado
            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Error interno del servidor: {ex.Message}");
            }
        }


        [HttpPut("ActualizarTabla")]
        public async Task<IActionResult> ActualizarUsuarioTabla([FromBody] Usuario usuarios)
        {
            try
            {
               var usuarioExistente = await _usuarioServicio.GetDatosUsuarioByID(idUsuarioMio);

                if (usuarioExistente == null)
                    return NotFound();

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Horario1 = usuarios.tabla.Horario1;
                usuarioExistente.tabla.Horario2 = usuarios.tabla.Horario2;
                usuarioExistente.tabla.Horario3 = usuarios.tabla.Horario3;
                usuarioExistente.tabla.Horario4 = usuarios.tabla.Horario4;
                usuarioExistente.tabla.Horario5 = usuarios.tabla.Horario5;
                usuarioExistente.tabla.Horario6 = usuarios.tabla.Horario6;
                usuarioExistente.tabla.Horario7 = usuarios.tabla.Horario7;
                usuarioExistente.tabla.Horario8 = usuarios.tabla.Horario8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Lunes1 = usuarios.tabla.Lunes1;
                usuarioExistente.tabla.Lunes2 = usuarios.tabla.Lunes2;
                usuarioExistente.tabla.Lunes3 = usuarios.tabla.Lunes3;
                usuarioExistente.tabla.Lunes4 = usuarios.tabla.Lunes4;
                usuarioExistente.tabla.Lunes5 = usuarios.tabla.Lunes5;
                usuarioExistente.tabla.Lunes6 = usuarios.tabla.Lunes6;
                usuarioExistente.tabla.Lunes7 = usuarios.tabla.Lunes7;
                usuarioExistente.tabla.Lunes8 = usuarios.tabla.Lunes8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Martes1 = usuarios.tabla.Martes1;
                usuarioExistente.tabla.Martes2 = usuarios.tabla.Martes2;
                usuarioExistente.tabla.Martes3 = usuarios.tabla.Martes3;
                usuarioExistente.tabla.Martes4 = usuarios.tabla.Martes4;
                usuarioExistente.tabla.Martes5 = usuarios.tabla.Martes5;
                usuarioExistente.tabla.Martes6 = usuarios.tabla.Martes6;
                usuarioExistente.tabla.Martes7 = usuarios.tabla.Martes7;
                usuarioExistente.tabla.Martes8 = usuarios.tabla.Martes8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Miercoles1 = usuarios.tabla.Miercoles1;
                usuarioExistente.tabla.Miercoles2 = usuarios.tabla.Miercoles2;
                usuarioExistente.tabla.Miercoles3 = usuarios.tabla.Miercoles3;
                usuarioExistente.tabla.Miercoles4 = usuarios.tabla.Miercoles4;
                usuarioExistente.tabla.Miercoles5 = usuarios.tabla.Miercoles5;
                usuarioExistente.tabla.Miercoles6 = usuarios.tabla.Miercoles6;
                usuarioExistente.tabla.Miercoles7 = usuarios.tabla.Miercoles7;
                usuarioExistente.tabla.Miercoles8 = usuarios.tabla.Miercoles8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Jueves1 = usuarios.tabla.Jueves1;
                usuarioExistente.tabla.Jueves2 = usuarios.tabla.Jueves2;
                usuarioExistente.tabla.Jueves3 = usuarios.tabla.Jueves3;
                usuarioExistente.tabla.Jueves4 = usuarios.tabla.Jueves4;
                usuarioExistente.tabla.Jueves5 = usuarios.tabla.Jueves5;
                usuarioExistente.tabla.Jueves6 = usuarios.tabla.Jueves6;
                usuarioExistente.tabla.Jueves7 = usuarios.tabla.Jueves7;
                usuarioExistente.tabla.Jueves8 = usuarios.tabla.Jueves8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Viernes1 = usuarios.tabla.Viernes1;
                usuarioExistente.tabla.Viernes2 = usuarios.tabla.Viernes2;
                usuarioExistente.tabla.Viernes3 = usuarios.tabla.Viernes3;
                usuarioExistente.tabla.Viernes4 = usuarios.tabla.Viernes4;
                usuarioExistente.tabla.Viernes5 = usuarios.tabla.Viernes5;
                usuarioExistente.tabla.Viernes6 = usuarios.tabla.Viernes6;
                usuarioExistente.tabla.Viernes7 = usuarios.tabla.Viernes7;
                usuarioExistente.tabla.Viernes8 = usuarios.tabla.Viernes8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Sabado1 = usuarios.tabla.Sabado1;
                usuarioExistente.tabla.Sabado2 = usuarios.tabla.Sabado2;
                usuarioExistente.tabla.Sabado3 = usuarios.tabla.Sabado3;
                usuarioExistente.tabla.Sabado4 = usuarios.tabla.Sabado4;
                usuarioExistente.tabla.Sabado5 = usuarios.tabla.Sabado5;
                usuarioExistente.tabla.Sabado6 = usuarios.tabla.Sabado6;
                usuarioExistente.tabla.Sabado7 = usuarios.tabla.Sabado7;
                usuarioExistente.tabla.Sabado8 = usuarios.tabla.Sabado8;

                // Actualizar la tabla del usuario
                usuarioExistente.tabla.Domingo1 = usuarios.tabla.Domingo1;
                usuarioExistente.tabla.Domingo2 = usuarios.tabla.Domingo2;
                usuarioExistente.tabla.Domingo3 = usuarios.tabla.Domingo3;
                usuarioExistente.tabla.Domingo4 = usuarios.tabla.Domingo4;
                usuarioExistente.tabla.Domingo5 = usuarios.tabla.Domingo5;
                usuarioExistente.tabla.Domingo6 = usuarios.tabla.Domingo6;
                usuarioExistente.tabla.Domingo7 = usuarios.tabla.Domingo7;
                usuarioExistente.tabla.Domingo8 = usuarios.tabla.Domingo8;

                // Guardar los cambios en la base de datos
                await _usuarioServicio.ActualizarUsuarioTabla(usuarioExistente);

                return Ok("si");

            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Error interno del servidor: {ex.Message}");
            }
        }



        [HttpPut("ActualizarTablaMonitor/{id}")]
        public async Task<IActionResult> ActualizarUsuarioMonitor(int id)
        {
           
           var usuario =  await _usuarioServicio.ActualizarUsuarioMonitor(idUsuarioMio, id);

                if(usuario != null)
                {
                    return Ok("si");
                }

                return NotFound("No se ha podido actualizar");

        }



        [HttpPut("ActualizarDieta")]
        public async Task<IActionResult> ActualizarUsuarioDieta([FromBody] Usuario usuarios)
        {
            try
            {
                var usuarioExistente = await _usuarioServicio.GetDatosUsuarioByID(idUsuarioMio);

                if (usuarioExistente == null)
                    return NotFound();

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Horario1 = usuarios.dieta.Horario1;
                usuarioExistente.dieta.Horario2 = usuarios.dieta.Horario2;
                usuarioExistente.dieta.Horario3 = usuarios.dieta.Horario3;
                usuarioExistente.dieta.Horario4 = usuarios.dieta.Horario4;
                usuarioExistente.dieta.Horario5 = usuarios.dieta.Horario5;
                usuarioExistente.dieta.Horario6 = usuarios.dieta.Horario6;
                usuarioExistente.dieta.Horario7 = usuarios.dieta.Horario7;
                usuarioExistente.dieta.Horario8 = usuarios.dieta.Horario8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Lunes1 = usuarios.dieta.Lunes1;
                usuarioExistente.dieta.Lunes2 = usuarios.dieta.Lunes2;
                usuarioExistente.dieta.Lunes3 = usuarios.dieta.Lunes3;
                usuarioExistente.dieta.Lunes4 = usuarios.dieta.Lunes4;
                usuarioExistente.dieta.Lunes5 = usuarios.dieta.Lunes5;
                usuarioExistente.dieta.Lunes6 = usuarios.dieta.Lunes6;
                usuarioExistente.dieta.Lunes7 = usuarios.dieta.Lunes7;
                usuarioExistente.dieta.Lunes8 = usuarios.dieta.Lunes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Martes1 = usuarios.dieta.Martes1;
                usuarioExistente.dieta.Martes2 = usuarios.dieta.Martes2;
                usuarioExistente.dieta.Martes3 = usuarios.dieta.Martes3;
                usuarioExistente.dieta.Martes4 = usuarios.dieta.Martes4;
                usuarioExistente.dieta.Martes5 = usuarios.dieta.Martes5;
                usuarioExistente.dieta.Martes6 = usuarios.dieta.Martes6;
                usuarioExistente.dieta.Martes7 = usuarios.dieta.Martes7;
                usuarioExistente.dieta.Martes8 = usuarios.dieta.Martes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Miercoles1 = usuarios.dieta.Miercoles1;
                usuarioExistente.dieta.Miercoles2 = usuarios.dieta.Miercoles2;
                usuarioExistente.dieta.Miercoles3 = usuarios.dieta.Miercoles3;
                usuarioExistente.dieta.Miercoles4 = usuarios.dieta.Miercoles4;
                usuarioExistente.dieta.Miercoles5 = usuarios.dieta.Miercoles5;
                usuarioExistente.dieta.Miercoles6 = usuarios.dieta.Miercoles6;
                usuarioExistente.dieta.Miercoles7 = usuarios.dieta.Miercoles7;
                usuarioExistente.dieta.Miercoles8 = usuarios.dieta.Miercoles8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Jueves1 = usuarios.dieta.Jueves1;
                usuarioExistente.dieta.Jueves2 = usuarios.dieta.Jueves2;
                usuarioExistente.dieta.Jueves3 = usuarios.dieta.Jueves3;
                usuarioExistente.dieta.Jueves4 = usuarios.dieta.Jueves4;
                usuarioExistente.dieta.Jueves5 = usuarios.dieta.Jueves5;
                usuarioExistente.dieta.Jueves6 = usuarios.dieta.Jueves6;
                usuarioExistente.dieta.Jueves7 = usuarios.dieta.Jueves7;
                usuarioExistente.dieta.Jueves8 = usuarios.dieta.Jueves8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Viernes1 = usuarios.dieta.Viernes1;
                usuarioExistente.dieta.Viernes2 = usuarios.dieta.Viernes2;
                usuarioExistente.dieta.Viernes3 = usuarios.dieta.Viernes3;
                usuarioExistente.dieta.Viernes4 = usuarios.dieta.Viernes4;
                usuarioExistente.dieta.Viernes5 = usuarios.dieta.Viernes5;
                usuarioExistente.dieta.Viernes6 = usuarios.dieta.Viernes6;
                usuarioExistente.dieta.Viernes7 = usuarios.dieta.Viernes7;
                usuarioExistente.dieta.Viernes8 = usuarios.dieta.Viernes8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Sabado1 = usuarios.dieta.Sabado1;
                usuarioExistente.dieta.Sabado2 = usuarios.dieta.Sabado2;
                usuarioExistente.dieta.Sabado3 = usuarios.dieta.Sabado3;
                usuarioExistente.dieta.Sabado4 = usuarios.dieta.Sabado4;
                usuarioExistente.dieta.Sabado5 = usuarios.dieta.Sabado5;
                usuarioExistente.dieta.Sabado6 = usuarios.dieta.Sabado6;
                usuarioExistente.dieta.Sabado7 = usuarios.dieta.Sabado7;
                usuarioExistente.dieta.Sabado8 = usuarios.dieta.Sabado8;

                // Actualizar la tabla del usuario
                usuarioExistente.dieta.Domingo1 = usuarios.dieta.Domingo1;
                usuarioExistente.dieta.Domingo2 = usuarios.dieta.Domingo2;
                usuarioExistente.dieta.Domingo3 = usuarios.dieta.Domingo3;
                usuarioExistente.dieta.Domingo4 = usuarios.dieta.Domingo4;
                usuarioExistente.dieta.Domingo5 = usuarios.dieta.Domingo5;
                usuarioExistente.dieta.Domingo6 = usuarios.dieta.Domingo6;
                usuarioExistente.dieta.Domingo7 = usuarios.dieta.Domingo7;
                usuarioExistente.dieta.Domingo8 = usuarios.dieta.Domingo8;

                // Guardar los cambios en la base de datos
                await _usuarioServicio.ActualizarUsuarioTabla(usuarioExistente);

                return Ok("si");

            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Error interno del servidor: {ex.Message}");
            }
        }




        [HttpGet("CargarDatosMonitor")]
        public async Task<IActionResult> CargarDatosMonitor ()
        {

            try
            {
                Debug.Write("El id del usuario es " + idUsuarioMio);
                // Obtener el usuario según el ID guardado en la variable idUsuarioMio
                var monitor = await _monitorServicio.GetDatosMonitorByID(idUsuarioMio);

                if (monitor != null)
                {
                    // Devolver los datos del usuario en un objeto JSON
                    return Ok(monitor);
                }

                return NotFound(); // Usuario no encontrado
            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Error interno del servidor: {ex.Message}");
            }
        }



    }
}
