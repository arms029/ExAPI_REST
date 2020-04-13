package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Teste;

public interface TesteRepository extends JpaRepository<Teste, Long> {
    Teste findByTeste(String teste);
}


