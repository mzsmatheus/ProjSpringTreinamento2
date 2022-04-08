package proj.rh.listatreinamento.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;


@Entity
@Table(name = "pessoa") public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String sobrenome;
    private String setor;


    public Pessoa(Long id, String nome, String sobrenome, String setor) {

        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.setor = setor;
    
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome, String setor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.setor = setor;
    }
    
    public Pessoa() {
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
    
    public String getSobrenome(){
        return sobrenome;

    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSetor(){
        return setor;

    }

    public void setSetor(String setor) {
        this.setor = setor;
    
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Lista lista;
 

}

