package main;

import main.enums.Cargo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimaPromocao;

    public boolean isGerente() {
        return this.dadosPessoais.getCargo() == Cargo.GERENTE;
    }

    public void atualizaSalario(BigDecimal novoValor){
        this.dadosPessoais.setSalario(novoValor);
        this.dataUltimaPromocao = LocalDate.now();
    }

    public void pormove(Cargo proximoCargo) {
        this.dadosPessoais.setCargo(proximoCargo);
    }

    public LocalDate getDataUltimaPromocao() {
        return dataUltimaPromocao;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public void setDataUltimaPromocao(LocalDate dataUltimaPromocao) {
        this.dataUltimaPromocao = dataUltimaPromocao;
    }
}
