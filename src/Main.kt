fun main(){
    var asientosVacios:MutableList<String>

    var pelicula1:Pelicula = Pelicula("Matrix","Accion","1 hora 30 min", asientosVacios, "Wachowski", listOf("Keanu Reeves", "Carrie-Annie Moss"))
    pelicula1.rellenarAsientos(pelicula1.asientos)

    println(pelicula1.asientos)
}