/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Jhony Vill da Silva
 */
@Entity
@Table(name = "equipamento")
public class Equipamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private int quantidadeEstoque;
    private int quantidadeEmprestado;
    private String observacao;
    
    @OneToOne(mappedBy = "equipamento")
    private Emprestimo emprestimo;
    
    public Equipamento() {
    }

    public Equipamento(String nome, int quantidadeEstoque, String observacao) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.observacao = observacao;
    }

    public Equipamento(Long id, String nome,int quantidadeEstoque, String observacao) {
        this.id = id;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.observacao = observacao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEmprestado() {
        return quantidadeEmprestado;
    }

    public void setQuantidadeEmprestado(int quantidadeEmprestado) {
        this.quantidadeEmprestado = quantidadeEmprestado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Equipamento[ id=" + id + " ]";
    }

}
