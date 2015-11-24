package Model;

public class Jogo {
	private long id;
	private String login;
	private int senha;
	
	public boolean salvar(long id, String nome, int senha){
		return true;
	}
	
	public boolean excluir(long id){
		return true;
	}

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
