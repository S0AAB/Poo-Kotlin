open class Persona(
    var nombre: String,
    var apellidos: String,
    var id: Long,
    var estadoCivil: String
) {
    open fun getDatos() {
        println("NOMBRE: $nombre\nAPELLIDOS: $apellidos\nID: $id\nESTADO CIVIL: $estadoCivil")
    }

    open fun cambiarEstadoCivil(nuevoEstado: String) {
        this.estadoCivil = nuevoEstado
    }
}
