document.getElementById("bt iniciar sesion").addEventListener("click",Iniciarsesion);
document.getElementById("bt iniciar Registro").addEventListener("click",Registro);
window.addEventListener("resize",anchoPagina)

var contenedor_login_registro= document.querySelector (".contenedor_login-registro");
var Formulario_logeo = document.querySelector(".Formulario_logeo");
var Formulario_Registro = document.querySelector(".Formulario_Registro");
var caja_trasera_logeo = document.querySelector(".caja_trasera-logeo");
var caja_trasera_registro = document.querySelector(".caja_trasera-registro");

function anchoPagina(){

    if (window.innerWidth > 850){
    caja_trasera_logeo.style.display="block";
    caja_trasera_registro.style.display = "block";

    }else{
    caja_trasera_registro.style.display = "block";
    caja_trasera_registro.style.opacity = "1";
    caja_trasera_logeo.style.display= "none";
    Formulario_logeo.style.display="block";
    Formulario_Registro.style.display ="none";
    contenedor_login_registro.style.left = "0px";

    }
}


function Iniciarsesion(){
    if (window.innerWidth>850){
    contenedor_login_registro.style.left = "10px";
    Formulario_logeo.style.display = "block";
    Formulario_Registro.style.display = "none";
    caja_trasera_logeo.style.opacity="1" ;
    caja_trasera_registro.style.opacity="0" ;

    }else{
    contenedor_login_registro.style.left = "0px";
    Formulario_logeo.style.display = "block";
    Formulario_Registro.style.display= "none";
    caja_trasera_logeo.style.display="none" ;
    caja_trasera_registro.style.display="block" ;
    }
}


function Registro(){
if (window.innerWidth>850){
contenedor_login_registro.style.left = "410px";
Formulario_logeo.style.display = "none";
Formulario_Registro.style.display= "block";
caja_trasera_logeo.style.opacity="0" ;
caja_trasera_registro.style.opacity="1" ;

}else{
    contenedor_login_registro.style.left = "0px";
    Formulario_logeo.style.display = "none";
    Formulario_Registro.style.display= "block";
    caja_trasera_registro.style.display="none" ;
    caja_trasera_logeo.style.opacity="1" ;
    caja_trasera_logeo.style.display="block" ;
}
}
