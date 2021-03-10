package br.edu.iff.ProjetoControleEstoque.model;
import java.io.Serializable;
import java.util.Objects;
import java.util.Calendar;


public class Entrada implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Funcionario funcionario;
    private Produto produto;
    private Calendar data_hota_e;
  
    private Alocacao alocacao;
   

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Calendar getData_hota_e() {
        return data_hota_e;
    }

    public void setData_hota_e(Calendar data_hota_e) {
        this.data_hota_e = data_hota_e;
    }
      public Alocacao getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Alocacao alocacao) {
        this.alocacao = alocacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entrada other = (Entrada) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   


    public Entrada() {
    }
    
  
}
