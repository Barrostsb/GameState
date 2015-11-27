package Model;

import Model.DAO.UsuarioDAO;
import Model.DAO.UsuarioDAOImpl;

public class Usuario {
	private long id;
	private String login;
	private String senha;

	private UsuarioDAO dao;
	
	public Usuario(){}
	
	public Usuario(long id, String login, String senha){
		this.id = id;
		this.login = login;
		this.senha = senha;
	}
	
	public boolean salvar(long id, String login, String senha){
		dao = new UsuarioDAOImpl();
		Usuario usuario = new Usuario(id, login, senha);
		return dao.create(usuario) ? true : false; 
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
	public void setlogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
