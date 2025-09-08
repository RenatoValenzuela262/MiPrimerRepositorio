class Pelicula:Proyeccion{

    val director:String
    val actores:List<String>

    constructor(titulo:String, genero:String, duracion:String, director: String,actores:List<String>):super(titulo,genero,duracion){
        this.director = director
        this.actores = actores
    }

    override fun obtenerInformacion(): String = """
    Pelicula:
    Título: $titulo,
    Genero: $genero,
    Duracion: $duracion,
    Director: $director,
    Actores: ${actores.joinToString(", ")}
    """.trimIndent()
}