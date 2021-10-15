package main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoTemporal implements Validacao{

    @Override
    public boolean validar(Funcionario funcionario, BigDecimal valor) {
        var dataAtual = LocalDate.now();
        var dataUltimoAumento = funcionario.getDataUltimaPromocao();
        var diferencaDeMeses = ChronoUnit.MONTHS.between(dataAtual, dataUltimoAumento);
        if(diferencaDeMeses > 6l)
            throw new IllegalArgumentException("Não se pode conceder aumentos num intervalo menor que 6 meses");
        return true;
    }
}
