package br.com.alura.forum;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class GeradorDeSenhas {

	//GERADOR DE SENHAS COM HASH
	public static void main(String[] args) {
		System.out.println("--------------------------------------------");
		System.out.println((new BCryptPasswordEncoder()).encode("123456"));
	}

}