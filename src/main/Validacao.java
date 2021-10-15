package main;

import main.Funcionario;

import java.math.BigDecimal;

public interface Validacao {
    boolean validar(Funcionario funcionario, BigDecimal valor);
}
