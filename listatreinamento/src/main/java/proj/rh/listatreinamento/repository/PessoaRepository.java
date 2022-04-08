package proj.rh.listatreinamento.repository;
import org.springframework.data.repository.CrudRepository;
import proj.rh.listatreinamento.domain.Pessoa;
import proj.rh.listatreinamento.domain.Lista;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    
    List<Pessoa> findByLista(Lista lista, Sort sort);

}


