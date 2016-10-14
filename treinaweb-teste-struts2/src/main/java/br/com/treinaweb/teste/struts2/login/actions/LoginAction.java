package br.com.treinaweb.teste.struts2.login.actions;

public class LoginAction {

	private String email;
	private String senha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String logar() {
		if (this.email.equals("teste@teste.com") && this.senha.equals("123")) {
			return "SUCCESS";
		} else {
			return "ERROR";
		}
	}

}
