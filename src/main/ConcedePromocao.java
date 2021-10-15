package main;

import main.enums.Cargo;

public class ConcedePromocao {

    public void concedePromocao(Funcionario funcionario, boolean metaBatida) {
        if(funcionario.getDadosPessoais().getCargo() == Cargo.GERENTE)
            throw new IllegalArgumentException("Esse funcionário já está no cargo máximo");
        if(metaBatida)
            funcionario.pormove(funcionario.getDadosPessoais().getCargo().proximoCargo());
        else
            throw new IllegalArgumentException("Funcionario não bateu a meta para promoção");

    }

}
