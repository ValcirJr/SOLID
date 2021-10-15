package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentual implements Validacao{

    @Override
    public boolean validar(Funcionario funcionario, BigDecimal valor) {
        var salarioAtual = funcionario.getDadosPessoais().getSalario();
        BigDecimal porcentagemMinima = (salarioAtual.multiply(valor)).divide(BigDecimal.valueOf(100l), RoundingMode.HALF_DOWN);
        if(porcentagemMinima.compareTo(BigDecimal.valueOf(35l)) > 0)
            throw new IllegalArgumentException("Valor para novo salário ultrapassa os 40%");
        return true;
    }
}
