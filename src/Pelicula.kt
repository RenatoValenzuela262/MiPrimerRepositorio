class Pelicula:Proyeccion{

    val director:String
    val actores:List<String>

    constructor(titulo:String, genero:String, duracion:String, asientos: MutableList<String>, director: String, actores:List<String>):super(titulo,genero,duracion,asientos){
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