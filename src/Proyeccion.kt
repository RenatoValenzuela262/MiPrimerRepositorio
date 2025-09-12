import kotlinx.coroutines.delay

open class Proyeccion
    (
    val titulo:String,
    val genero:String,
    val duracion:String,
    val asientos:MutableList<String>
    )
{
    open fun obtenerInformacion(): String{
        return "Título: $titulo, Género: $genero, Duracion: $duracion"
    }

    open fun rellenarAsientos(asientosDisponibles: MutableList<String>){
        var i:Int=1
        while(i<=160){
            asientosDisponibles.add(i.toString())
            i=i+1
        }
    }

    open fun mostrarAsientos(asientosDisponibles: MutableList<String>){
        var i:Int = 1
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
            i+=1
        }
    }

    open suspend fun reservarAsiento(asiento:Int, asientosDisponibles: MutableList<String>){
        var i:Int = 0
        while(i<160){
            if(asiento.toString() == asientosDisponibles[i]){
                println("Asiento disponible, reservando...")
                asientosDisponibles[i]="X "

                if(i<=10){
                    println("Asiento disponible, reservando...")
                    delay(3000)
                    println("Reservado, tu asiento es el: $asiento")
                    asientosDisponibles[i]="X"
                }else if(i<=100){
                    println("Asiento disponible, reservando...")
                    delay(3000)
                    println("Reservado, tu asiento es el: $asiento")
                    asientosDisponibles[i]="X "
                }else{
                    println("Asiento disponible, reservando...")
                    delay(3000)
                    println("Reservado, tu asiento es el: $asiento")
                    asientosDisponibles[i]="X  "
                }
            }else{
                i=i+1
            }
        }
    }
}