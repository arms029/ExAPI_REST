package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //monta query automaticamente
    Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao);
    
    //monta query manualmente
    // @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    // List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")String nomeCurso);

}