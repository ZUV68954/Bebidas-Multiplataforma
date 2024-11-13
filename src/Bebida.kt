abstract class Bebida(id: Int, litros: Double, precio: Double, marca: String) {
    override fun toString(): String {
        return "Algo"
    }
    open abstract fun getId(): Int
}