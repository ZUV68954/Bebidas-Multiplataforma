fun main() {
    var bebida: Bebida = Agua(0, 4.0, 4.0, "Bezoya", true)
    var bebida1: Bebida = Agua(1, 1.0, 4.0, "Aquabona", true)
    val almacén: Almacén = Almacén()
    almacén.agregarBebida(bebida)
    almacén.agregarBebida(bebida1)
    almacén.mostrarBebidas()
    almacén.eliminarBebida(0)
    almacén.mostrarBebidas()
}