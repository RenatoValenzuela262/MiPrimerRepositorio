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

    open fun mostrarAsientos(){
        var asientosDisponibles: MutableList<String> = mutableListOf()

        var i:Int=1
        while(i<=160){
            asientosDisponibles.add(i.toString())
            i=i+1
        }

        i = 1
        while(i<=160){
            if((i%10)==0){
                println(asientosDisponibles[i-1])
            }else{
                if(i<=10){
                    print(asientosDisponibles[i-1]+"   ")
                }else if(10<i && i<=100){
                    print(asientosDisponibles[i-1]+"  ")
                }else{
                    print(asientosDisponibles[i-1]+" ")
                }
            }
            i=i+1
        }
    }
}