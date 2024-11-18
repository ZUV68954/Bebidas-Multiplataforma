abstract class Bebida {
    override fun toString(): String {
        return "Esto no lo deberías de ver nunca."
    }

    abstract fun getId(): Int
    abstract fun getPrecio(): Float
    abstract fun getMarca(): String
}