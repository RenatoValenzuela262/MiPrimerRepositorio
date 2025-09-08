open class Proyeccion
    (
    val titulo:String,
    val genero:String,
    val duracion:String
    )
{
    open fun obtenerInformacion(): String{
        return "Título: $titulo, Género: $genero, Duracion: $duracion"
    }
}