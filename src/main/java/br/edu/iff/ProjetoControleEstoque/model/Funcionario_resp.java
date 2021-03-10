
package br.edu.iff.ProjetoControleEstoque.model;

import java.util.List;


public class Funcionario_resp extends Funcionario{
    
    private String usuario;
    private int senha;
    

    private List<Entrada> entradas;
    private List<Despache> despaches;
    

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

    public Funcionario_resp() {
    }

    
}
