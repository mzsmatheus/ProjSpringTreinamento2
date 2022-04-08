package proj.rh.listatreinamento.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="listatreinamento")
public class Lista  implements Serializable  {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

public Lista(){

}

public Lista(String nome) {
    this.nome = nome;
}

public Lista(Long id, String nome){

this.id = id;
this.nome = nome;

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

@OneToMany(mappedBy="listatreinamento",  fetch = FetchType.LAZY)

private Set<Pessoa> pessoas;

}



