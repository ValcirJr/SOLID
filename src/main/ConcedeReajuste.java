package main;

import java.math.BigDecimal;
import java.util.List;


public class ConcedeReajuste {

    List<Validacao> validacaos;
    Double valor;

    public ConcedeReajuste(List<Validacao> validacaos) {
        this.validacaos = validacaos;
    }

    public void concedeReajuste(Funcionario funcionario, BigDecimal valor) {
        validacaos.forEach(v -> v.validar(funcionario, valor));
        this.valor = 213.0;
        funcionario.atualizaSalario(valor);
    }
}
