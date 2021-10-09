package br.ucsal.edu.estudo.ObjectMotherAndBuilder.business;

import br.ucsal.edu.estudo.ObjectMotherAndBuilder.builder.ExemploCombinandoMother_Builder;
import br.ucsal.edu.estudo.ObjectMotherAndBuilder.builder.ExemplodeTestDataBuilder;
import br.ucsal.edu.estudo.ObjectMotherAndBuilder.dominio.Usuario;

class UsuarioTeste {
	//Criando um usuario personalizado
	Usuario userBuilder = ExemplodeTestDataBuilder.umUsuario().comNome("Tarcisio").comNomeDeUsuario("ZZz").comSenha("kakaka").doTipo("ROLE_USER").build();
	//Criando um usuario default
	Usuario userUsuario = ExemplodeTestDataBuilder.umUsuario().build();
	//Craindo um admin default
	Usuario adminUsuario = ExemplodeTestDataBuilder.umUsuario().comoAdmin().build();
	
	//Exemplos de criacao combinando os dois metodos.
	ExemplodeTestDataBuilder userBuilderMotherBuilder = ExemploCombinandoMother_Builder.comoPadrao();
	Usuario userBuilderMotherBuilder1 = ExemploCombinandoMother_Builder.umUsuarioSemSenha().build();
	
}
