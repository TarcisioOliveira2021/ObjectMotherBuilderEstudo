package br.ucsal.edu.estudo.ObjectMotherAndBuilder.builder;

import br.ucsal.edu.estudo.ObjectMotherAndBuilder.dominio.Usuario;

//Classe que permite criar usuario.
public class ExemploDeObjectMother {
	
	//Cria um usuario comum com os dados passados como default. 
	public static Usuario aRegularUser() {
		return new Usuario ("Jonh smith", "jsmith" , "42xcc", "ROLE_USER");
	}
	
	//Cria um administrador usando os dados defaults dentro do metodo.
	private static Usuario anAdmin() {
		return new Usuario("Main", "admin", "admin", "ROLE_ADMIN");
	}
	
	//Instanciação de um novo usuario e um novo administrador usando a classe ObjectMother para cirar um objeto ( usuario ou admin ).
	Usuario usuario = ExemploDeObjectMother.aRegularUser();
	Usuario admin = ExemploDeObjectMother.anAdmin();
}
