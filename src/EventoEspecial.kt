class EventoEspecial:Proyeccion{

    val tipoEvento: String
    val artista:String

    constructor(titulo:String, genero:String, duracion:String, tipoEvento:String, artista:String ):super(titulo,genero,duracion){
        this.tipoEvento = tipoEvento
        this.artista = artista
    }

    override fun obtenerInformacion(): String = """
        EVENTO ESPECIAL:
        Título: $titulo
        Gender: $genero
        Duracion: $duracion
        Tipo de evento: $tipoEvento
        Artista: $artista
    """.trimIndent()
}