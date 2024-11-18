class Agua(
    private var id: Int,
    private val litros: Double,
    private val precio: Double,
    private val marca: String,
    private val mineral: Boolean
) :
    Bebida(id, litros, precio, marca) {
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

    override fun getPrecio(): Double {
        return precio
    }

    override fun getMarca(): String {
        return marca
    }
}