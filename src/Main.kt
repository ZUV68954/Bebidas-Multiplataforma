fun main() {
    val bebida: Bebida = Agua(0, 4F, 4F, "Bezoya", true)
    val bebida1: Bebida = Agua(1, 1F, 4F, "Aquabona", true)
    val almacén = Almacén()
    almacén.agregarBebida(bebida)
    almacén.agregarBebida(bebida1)
    almacén.mostrarBebidas()
    println(almacén.eliminarBebida(0))
    almacén.mostrarBebidas()
    println(almacén.calcularTotal("Aquabona"))
}