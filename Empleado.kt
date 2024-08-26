class Empleado(
    nombre:String,
    apellidos: String,
    id: Long,
    estadoCivil:String,
    var incorporacion:Int,
    var numDespacho:Int)

    :Persona(nombre, apellidos ,id, estadoCivil) {
    fun reasignarDespacho(nuevoDespacho:Int){
        this.numDespacho=nuevoDespacho
    }
    override fun getDatos(){
        super.getDatos()
        println("AÑO INCORPORACION:$incorporacion")
        println("NUMERO DESPACHO:$numDespacho")
    }

}