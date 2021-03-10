
package br.edu.iff.ProjetoControleEstoque.model;




public class Funcionario_ADM extends Funcionario{
    
    private String usuario;
    private int senha;
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
