package br.ucsal.edu.estudo.ObjectMotherAndBuilder.dominio;

public class Usuario {
	private String nome;
	private String usuario;
	private String password;
	private String tipo;
	
	public Usuario(String nome, String usuario, String password, String tipo) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", usuario=" + usuario + ", password=" + password + ", tipo=" + tipo + "]";
	}
	
	
}
