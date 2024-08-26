class Profesores(
    nombre:String,
    apellidos: String,
    id: Long,
    estadoCivil:String,
    var departamento:String
):Persona(nombre, apellidos, id, estadoCivil) {
    fun cambiarDepartamento(nuevoDepartamento:String){
        this.departamento=nuevoDepartamento
    }

    override fun getDatos() {
        super.getDatos()
        println("DEPARTAMENTO:$departamento")
    }

}