import kotlin.system.exitProcess

class Almacén {
    private val estantería: ArrayList<ArrayList<Bebida>> = arrayListOf(
        ArrayList(), ArrayList(), ArrayList(),
        ArrayList(), ArrayList()
    )

    fun agregarBebida(bebida: Bebida) {
        if (estantería[0].size < 5) {
            estantería[0].add(bebida)
        } else if (estantería[1].size < 5) {
            estantería[1].add(bebida)
        } else if (estantería[2].size < 5) {
            estantería[2].add(bebida)
        } else if (estantería[3].size < 5) {
            estantería[3].add(bebida)
        } else if (estantería[4].size < 5) {
            estantería[4].add(bebida)
        } else if (estantería[5].size < 5) {
            estantería[5].add(bebida)
        } else {
            println("No caben más bebidas en la estantería.")
        }
    }

    fun eliminarBebida(id: Int): Boolean {
        estantería.forEach { fila ->
            fila.forEach { bebida ->
                if (bebida.getId() == id) {
                    fila.remove(bebida)
                    return true
                }
            }
        }
        return false
    }


    fun mostrarBebidas() {
        estantería.forEach { fila ->
            fila.forEach { bebida ->
                println(bebida.toString())
            }
        }
    }

    fun calcularTotal(): Double {
        var total = 0.0
        estantería.forEach { fila ->
            fila.forEach { bebida ->
                total += bebida.getPrecio()
            }
        }
        return total
    }

    fun calcularTotal(marca: String): Float {
        var total = 0f
        estantería.forEach { fila ->
            fila.forEach { bebida ->
                if (bebida.getMarca() == marca) {
                    total += bebida.getPrecio()
                }
            }
        }
        if (total == 0f) {
            println("La marca solicitada no exite.")
            exitProcess(-1)
        }
        return total
    }

    fun calcularTotal(columna: Int): Float {
        if (columna - 1 > 5 || columna - 1 < 0) {
            println("La columna solicitada no existe.")
            exitProcess(-1)
        }
        var total = 0f
        estantería[columna - 1].forEach { bebida ->
            total += bebida.getPrecio()
        }
        if (total == 0f) {
            println("No hay bebidas en esa columna.")
            exitProcess(-1)
        }
        return total
    }
}