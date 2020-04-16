package Pelicula

class Pelicula{
    var _titulo : String = _
    var _genero : String =_
    var _codigo : String =_
    var _duracion : Int = _
    protected var _reproducciones : Int = 0

    def getRepro_()={
        _reproducciones
    }
    
    def GetTitulo_()={_titulo}

    def aumentarRepro_() = _reproducciones += 1

}