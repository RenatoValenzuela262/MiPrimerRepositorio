fun main(){
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

    var busca: Int = 17

    i=0

    while(i<160){
        if(busca.toString() == asientosDisponibles[i]){
            println("Asiento disponible, reservando...")
            asientosDisponibles[i]="X"
        }else{
            i=i+1
        }
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