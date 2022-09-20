package steps;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class Test {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
	   metodos.abrirNavegador();
	}

	@Quando("clicar na opcao Register")
	public void clicar_na_opcao_register() {
	    metodos.clicar(el.getRegister());
	    metodos.validarTexto("Signing up is easy!", el.getValSigning() );
	}

	@Quando("preencher todos os dados cadastrais")
	public void preencher_todos_os_dados_cadastrais() {
    metodos.escrever("leonardo", el.getName());
    metodos.escrever("Rodrigues", el.getLastName());
    metodos.escrever("João de Oliveira Rosa Junior", el.getAddress());
    metodos.escrever("Cananéia", el.getCity());
    metodos.escrever("SP", el.getState());
    metodos.escrever("11990000", el.getZipCode());
    metodos.escrever("(47) 3339-5175", el.getPhone());
    metodos.escrever("523.079.170-55", el.getSSN());
    metodos.escrever("AntonioLeonelrjr6900", el.getUsername());
    metodos.escrever("antonioLeonel1234", el.getPassword());
    metodos.escrever("antonioLeonel1234", el.getConfirm());
    metodos.clicar(el.getRegisterCadastro());
   
	}

	@Entao("valido se o formulario foi cadastrado")
	public void valido_se_o_formulario_foi_cadastrado() {
	    metodos.validarTexto("Welcome AntonioLeonelrjr", el.getValidarTextoRegister());
	    metodos.fecharNavegador();
	}

	@Quando("clicar na opcao esqueci login")
	public void clicar_na_opcao_esqueci_login() {
	    metodos.clicar(el.getForgot());
	}

	@Quando("preencher todas o meus dados cadastrais")
	public void preencher_todas_o_meus_dados_cadastrais() {
		 metodos.escrever("leonardo", el.getName2());
		    metodos.escrever("Rodrigues", el.getLastName2());
		    metodos.escrever("João de Oliveira Rosa Junior", el.getAddress2());
		    metodos.escrever("Cananéia", el.getCity2());
		    metodos.escrever("SP", el.getState2());
		    metodos.escrever("11990000", el.getZipCode2());
		    metodos.escrever("523.079.170-55", el.getSSN2());
		    metodos.clicar(el.getFindMyLogin());
		    metodos.fecharNavegador();
	}

	@Entao("valido mensagem de conclusao")
	public void valido_mensagem_de_conclusao() {
	   metodos.validarTexto("Customer Lookup", el.getValidarTextoForgot());
	}

	@Quando("clicar na opcao Username e Password")
	public void clicar_na_opcao_username_e_password() {
	}
	
	@Quando("preencher com o meus dados cadastrais")
	public void preencher_com_o_meus_dados_cadastrais() {
	    metodos.escrever("AntonioLeonelrjr6900", el.getUser());
	    metodos.escrever("antonioLeonel1234", el.getPassWord());
	    metodos.clicar(el.getLoginn());
	}

		@Entao("valido se o login foi efetuado")
		public void validoSeOLoginFoiEfetuado() {
		 metodos.validarTexto("Accounts Overview", el.getAccountsOverview());
		 metodos.fecharNavegador();
		}



}



