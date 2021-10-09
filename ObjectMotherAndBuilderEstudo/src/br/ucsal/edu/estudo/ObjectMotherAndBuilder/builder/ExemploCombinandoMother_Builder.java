package br.ucsal.edu.estudo.ObjectMotherAndBuilder.builder;

public class ExemploCombinandoMother_Builder {
	
	public static ExemplodeTestDataBuilder comoPadrao() {
		return ExemplodeTestDataBuilder.umUsuario()
				.comNome("KIKI")
				.comNomeDeUsuario("KIKI123")
				.comSenha("senha")
				.doTipo("ROLE_USER");
	}
	
	public static ExemplodeTestDataBuilder umUsuarioSemSenha() {
		return ExemplodeTestDataBuilder.umUsuario()
				.comNome("Ilha")
				.comNomeDeUsuario("Ilhado123")
				.doTipo("ROLE_USER")
				.semSenha();
	}
	
	public static ExemplodeTestDataBuilder umUsuarioAdmin() {
		return ExemplodeTestDataBuilder.umUsuario()
				.comoAdmin()
				.comNome("HUMEbrt")
				.comNomeDeUsuario("Humbertinho123")
				.comSenha("qwerty");
	}
	
}
