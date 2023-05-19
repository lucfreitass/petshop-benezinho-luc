package br.com.petshop.pessoa;

import br.com.petshop.sexo.Sexo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa  {
    private String cpf;
    private Collection<PessoaFisica> filhos = new Vector<>();

    private Sexo sexo;

    public PessoaFisica addFilho(PessoaFisica filho) {
        this.filhos.add(filho);
        return this;
    }

    public PessoaFisica removeFilho(PessoaFisica filho) {
        this.filhos.remove(filho);
        return this;
    }

    public  Collection<Pessoa> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public PessoaFisica() {
    }

    public PessoaFisica(Long id, String nome, String cpf, Collection<PessoaFisica> filhos, Sexo sexo) {
        super(id, nome);
        this.cpf = cpf;
        this.filhos = filhos;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", filhos=" + filhos +
                ", sexo=" + sexo +
                "} " + super.toString();
    }
}
