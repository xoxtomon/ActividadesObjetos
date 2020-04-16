import Usuario._
import Plan._
import Pelicula._
import ModuloSistema._

object main extends App{
    val mod = new ModuloSistema
    val pel1 = new Pelicula
    val pel2 = new Pelicula
    val usuario1  = new Usuario

    //inicializar peliculas
    pel1._titulo = "home"
    pel1._genero = "accion"
    pel1._codigo = "1234"
    pel1._duracion = 33
    
    pel2._titulo = "prueba"
    pel2._genero = "drama"
    pel2._codigo = "12345"
    pel2._duracion = 22

    //obtener valores iniciales pelicula
    println(pel1.getRepro_())
    println(pel2.getRepro_())
    
    //verificar el objeto desde el modulo
    val lst = List(pel1, pel2)
    mod.peliculas_(lst)
    mod.peliculas().foreach{
        p => println(p.getRepro_())
    }

    //aumentar reproducciones desde un usuario
    usuario1.verPelicula_(pel1)
    usuario1.verPelicula_(pel2)

    //comprobar cambio desde el modulo
    mod.peliculas().foreach{
        p => println(p.getRepro_())
    }

    val usuario2 = new Usuario("paul", "123456789","contra","20","correo",false)
    
    //Verificar contraseña
    println(usuario2.esContra_("contra"))
    println(usuario2.esContra_("contraOtra"))

    println(usuario2._nombre)
    println(usuario2._cedula)
    println(usuario2._contra)
    println(usuario2._edad)
    println(usuario2._correo)
    println(usuario2._esAdmin)

   //verificar peliculas descargadas
    usuario2.DescargarPelicula_(pel1)
    usuario2.DescargarPelicula_(pel2)
    
    if(usuario2.GetPelisDescargadas_() == Nil) println("esta vacio.")
    else println("tiene elementos.")

    usuario2.GetPelisDescargadas_().foreach(x=>println(x.GetTitulo_()))
    
    

}