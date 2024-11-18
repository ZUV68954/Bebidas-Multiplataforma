abstract class Bebida(id: Int, litros: Double, precio: Double, marca: String) {
    override fun toString(): String {
        return "Algo"
    }

    abstract fun getId(): Int
    abstract fun getPrecio(): Double
    abstract fun getMarca(): String
}