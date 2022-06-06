package one.digitalinnovation.collections

import java.math.BigDecimal

//funçao estendida somatoria
fun Array<BigDecimal>.somatoria() = this.reduce { acc, valor ->
    acc + valor
}

//funçao estendida que mostra media, nao ha no leque de arrays
fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()