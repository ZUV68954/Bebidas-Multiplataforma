abstract class Bebida {
    override fun toString(): String {
        return "Esto no lo deberías de ver nunca."
    }

    abstract fun getId(): Int
    abstract fun getPrecio(): Double
    abstract fun getMarca(): String
}