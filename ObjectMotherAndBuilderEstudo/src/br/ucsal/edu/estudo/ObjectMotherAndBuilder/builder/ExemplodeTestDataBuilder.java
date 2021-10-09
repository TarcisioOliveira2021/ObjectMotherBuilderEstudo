package br.ucsal.edu.estudo.ObjectMotherAndBuilder.builder;

import br.ucsal.edu.estudo.ObjectMotherAndBuilder.dominio.Usuario;

public class ExemplodeTestDataBuilder {
	//Atribuimos valores defaults.
	private static final String DEFAULT_NOME = "Jonh Smith" ;
	private static final String DEFAUlT_USERNAME = "jsmith";
	private static final String DEFAULT_PASSWORD = "42xcc";
	private static final String DEFAULT_ROLE = "ROLE_USER"; //estrategia errada para fins educacionais o certo serio usar um enum.
	
	//Primeiro pegamos todos os atributos da classe que vamos criar o test builder.
	private String nome = DEFAULT_NOME;
	private String usuario = DEFAUlT_USERNAME;
	private String password = DEFAULT_PASSWORD;
	private String tipo = DEFAULT_ROLE;
	
	//Construtor privado para a classe não ser instanciada
	private ExemplodeTestDataBuilder() {
	}
	
	//Metodos que vamos usar para construir o objeto.
	public static ExemplodeTestDataBuilder umUsuario() {
		return new ExemplodeTestDataBuilder();
	}
	
	//Metodos que vamos usar para construir outros atributos do objeto
	public ExemplodeTestDataBuilder comNome(String nome) {
		this.nome = nome;
		return this; //Retorna a propria instancia do objeto.
	}
	
	public ExemplodeTestDataBuilder comNomeDeUsuario(String usuario) {
		this.usuario = usuario;
		return this;
	}
	
	public ExemplodeTestDataBuilder comSenha(String password) {
		this.password = password;
		return this;
	}
	
	public ExemplodeTestDataBuilder doTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}
	
	public ExemplodeTestDataBuilder comoAdmin() {
		this.tipo = "ROLE_ADMIN";
		return this;
	}
	
	public ExemplodeTestDataBuilder semSenha() {
		this.password = "";
		return this;
	}
	
	//Método que vai crai um usuario
	public Usuario build() {
		return new Usuario(nome, usuario, password, tipo);
	}
}
