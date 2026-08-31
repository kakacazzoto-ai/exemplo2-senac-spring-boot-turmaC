package br.senac.tasds;
import org.springframework.data.jpa.repository.JpaRepository;
import br.senac.tads.dws.exemplo2.model.produto;

public interface ProdutoRepository extends JpaRepository<produto, long{
    
}
