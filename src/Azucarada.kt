class Azucarada(
    private var id: Int,
    private val litros: Float,
    private val precio: Float,
    private val marca: String,
    private val porcentaje: Float,
    private val promoción: Boolean
) :
    Bebida() {
    override fun toString(): String {
        return "La bebida es de tipo azucarada y contiene $litros de líquido, es de la marca $marca y contiene un $porcentaje" +
                "de azúcar. Su precio es de $precio € y" +
                if (promoción) {
                    "actualmente hay una promoción del 10% de descuento."
                } else {
                    "actualmente no hay ninguna promoción en marcha para esta bebida."
                }
    }

    override fun getId(): Int {
        return id
    }

    override fun getPrecio(): Float {
        if (promoción) {
            return precio * 0.9f
        }
        return precio
    }

    override fun getMarca(): String {
        return marca
    }
}