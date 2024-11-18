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
        for (i in 0..<estantería.size) {
            // Recorre la lista en orden inverso para evitar problemas al borrar bebidas
            for (j in estantería[i].size - 1 downTo 0) {
                if (estantería[i][j].getId() == id) {
                    estantería[i].removeAt(j)
                }
            }
        }
    }


    fun mostrarBebidas() {
        for (i in 0..<estantería.size) {
            for (j in 0..<estantería[i].size) {
                println(estantería[i][j].toString())
            }
        }
    }

    fun calcularTotal(): Double {
        var total = 0.0
        for (i in 0..<estantería.size) {
            for (j in 0..<estantería[i].size) {
                total += estantería[i][j].getPrecio()
            }
        }
        return total
    }

    fun calcularTotal(marca: String): Double {
        var total = 0.0
        for (i in 0..<estantería.size) {
            for (j in 0..<estantería[i].size) {
                if (estantería[i][j].getMarca() == marca) {
                    total += estantería[i][j].getPrecio()
                }
            }
        }
        return total
    }

    fun calcularTotal(columna: Int): Double {
        var total = 0.0
        for (j in 0..<estantería[columna].size) {
            total += estantería[columna][j].getPrecio()
        }
        return total
    }
}