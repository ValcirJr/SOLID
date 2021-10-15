package main.segrae;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributado {

    private BigDecimal valor;
    private LocalDate dataPromocao;

    @Override
    public BigDecimal valor() {
        return this.valor;
    }

    @Override
    public LocalDate dataReajuste() {
        return this.dataPromocao;
    }

    @Override
    public BigDecimal percentualTaxaReajuste() {
        return BigDecimal.valueOf(0.1);
    }
}
