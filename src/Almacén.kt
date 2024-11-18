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

    fun eliminarBebida(id: Int) {
        estantería.forEach { fila ->
            fila.forEach { bebida ->
                if (bebida.getId() == id) {
                    fila.remove(bebida)
                }
            }
        }
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

    fun calcularTotal(marca: String): Double {
        var total = 0.0
        estantería.forEach { fila ->
            fila.forEach { bebida ->
                if (bebida.getMarca() == marca) {
                    total += bebida.getPrecio()
                }
            }
        }
        return total
    }

    fun calcularTotal(columna: Int): Double {
        var total = 0.0
        estantería[columna].forEach { bebida ->
            total += bebida.getPrecio()
        }
        return total
    }
}