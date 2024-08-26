class PersonalServicios(
    nombre:String,
    apellidos: String,
    id: Long,
    estadoCivil:String,
    var seccion:String
):Persona(nombre, apellidos, id, estadoCivil) {
    fun cambiarSeccion(nuevaSeccion:String){
        this.seccion=nuevaSeccion
    }

    override fun getDatos() {
        super.getDatos()
        println("SECCION:$seccion")
    }

}