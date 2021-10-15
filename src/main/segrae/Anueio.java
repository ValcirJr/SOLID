package main.segrae;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anueio implements Reajuste{

    private BigDecimal valor;
    private LocalDate dataReajusteAnuenio;

    @Override
    public BigDecimal valor() {
        return this.valor;
    }

    @Override
    public LocalDate dataReajuste() {
        return this.dataReajusteAnuenio;
    }

}
