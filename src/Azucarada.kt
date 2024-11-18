class Azucarada(
    private var id: Int,
    private val litros: Double,
    private val precio: Double,
    private val marca: String,
    private val porcentaje: Double,
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

    override fun getPrecio(): Double {
        if (promoción) {
            return precio / 10
        }
        return precio
    }

    override fun getMarca(): String {
        return marca
    }
}