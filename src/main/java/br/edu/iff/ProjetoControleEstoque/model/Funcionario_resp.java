package br.edu.iff.ProjetoControleEstoque.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario_resp extends Funcionario{
    @Column(length = 10,nullable = false)
    private String usuario;
    @Column(length = 6,nullable = false)
    private int senha;
    
    @JsonBackReference
    @OneToMany(mappedBy = "funcionario_resp")
    private List<Entrada> entradas=new ArrayList<>();
    @JsonBackReference
    @OneToMany(mappedBy = "funcionario_resp")
    private List<Despache> despaches= new ArrayList<>();
    
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
