package br.edu.iff.ProjetoControleEstoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Funcionario_ADM extends Funcionario{
    @Column(length = 10,nullable = false)
    private String usuario;
    @Column(length = 6,nullable = false)
    private int senha;
    @Column(length = 10,nullable = false)
    private int chave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Funcionario_ADM() {
    }
    
}
