class Agua(
    private var id: Int,
    private val litros: Float,
    private val precio: Float,
    private val marca: String,
    private val mineral: Boolean
) :
    Bebida() {
    override fun toString(): String {
        return "La bebida son $litros litros de agua, tiene un precio de $precio € y la comercializa la marca $marca. " +
                if (mineral) {
                    "Este agua es agua mineral."
                } else {
                    "Este agua no es agua mineral."
                }
    }

    override fun getId(): Int {
        return id
    }

    override fun getPrecio(): Float {
        return precio
    }

    override fun getMarca(): String {
        return marca
    }
}