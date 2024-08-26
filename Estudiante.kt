class Estudiante(
    nombre: String,
    apellidos: String,
    id: Long,
    estadoCivil: String,
    var curso: String
) : Persona(nombre, apellidos, id, estadoCivil) {

    var cursos: MutableList<String> = mutableListOf(curso)

    fun agregarCurso(nuevoCurso: String) {
        cursos.add(nuevoCurso)
    }

    override fun getDatos() {
        super.getDatos()
        println("CURSOS: $cursos")
    }
}

