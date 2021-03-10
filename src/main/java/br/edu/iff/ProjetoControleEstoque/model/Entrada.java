package br.edu.iff.ProjetoControleEstoque.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Objects;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entrada implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_hota_e;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(nullable=false)
    private Funcionario_resp funcionario_resp;
    private Produto produto;
    @Embedded
    private Alocacao alocacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario_resp getFuncionario_resp() {
        return funcionario_resp;
    }

    public void setFuncionario_resp(Funcionario_resp funcionario_resp) {
        this.funcionario_resp = funcionario_resp;
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

