fun main() {
    var lista:MutableList<Estudiante>
    var Estudiante2=Estudiante("Andres","Ahumada",123123,"Casado","Matematicas")

    Estudiante2.agregarCurso("Español")
    Estudiante2.getDatos()

    var Empleado1=Empleado("Ana","Guiterrez",123123,"Casado",2024,2)
    Empleado1.getDatos()

    var Profesor1=Profesores("Cristian","Tijaro",5454,"Soltero","Matematicas")
    Profesor1.getDatos()
    var PersonalServicio1=PersonalServicios("John","Parra",5464,"Soltero","Gimnasio")
    Estudiante2.cambiarEstadoCivil("SOLTERO")
    Estudiante2.getDatos()
}