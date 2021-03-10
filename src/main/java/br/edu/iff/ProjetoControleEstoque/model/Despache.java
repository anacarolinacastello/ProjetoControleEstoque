package br.edu.iff.ProjetoControleEstoque.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Objects;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Despache implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String local_de_despache;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_hora_s;
    
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(nullable=false)
    private Funcionario_resp funcionario_resp;
    private Produto produto;

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
