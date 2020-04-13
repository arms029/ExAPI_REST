package br.com.alura.forum.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teste {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teste;

    public Teste() {
    }
    /**
     * @return the teste
     */
    public String getTeste() {
        return teste;
    }
    /**
     * @param teste the teste to set
     */
    public void setTeste(String teste) {
        this.teste = teste;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}