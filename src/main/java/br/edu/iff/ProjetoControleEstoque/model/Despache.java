package br.edu.iff.ProjetoControleEstoque.model;
import java.io.Serializable;
import java.util.Objects;
import java.util.Calendar;

public class Despache implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Funcionario funcionario;
    private Produto produto;
    private String local_de_despache;
    private Calendar data_hora_s;

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

    public String getLocal_de_despache() {
        return local_de_despache;
    }

    public void setLocal_de_despache(String local_de_despache) {
        this.local_de_despache = local_de_despache;
    }

    public Calendar getData_hora_s() {
        return data_hora_s;
    }

    public void setData_hora_s(Calendar data_hora_s) {
        this.data_hora_s = data_hora_s;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
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
        final Despache other = (Despache) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    

    
    

 


    public Despache() {
    }
    
    
    
}
