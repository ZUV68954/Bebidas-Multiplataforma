fun main() {
    val bebida: Bebida = Agua(0, 4.0, 4.0, "Bezoya", true)
    val bebida1: Bebida = Agua(1, 1.0, 4.0, "Aquabona", true)
    val almacén = Almacén()
    almacén.agregarBebida(bebida)
    almacén.agregarBebida(bebida1)
    almacén.mostrarBebidas()
    almacén.eliminarBebida(0)
    almacén.mostrarBebidas()
    println(almacén.calcularTotal())
}