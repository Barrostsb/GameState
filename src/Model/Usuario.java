package Model;

import java.util.List;
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
	
	public boolean salvar(Usuario usuario){
		dao = new UsuarioDAOImpl();
		return dao.create(usuario); 
	}
	
	public boolean alterar(Usuario usuario){
		dao = new UsuarioDAOImpl();
		return dao.update(usuario); 
	}
	
	
	public boolean excluir(long id){
		dao = new UsuarioDAOImpl();
		Usuario usu = dao.read(id);
		return dao.delete(usu); 
	}
	
	public List<Usuario> buscarUsuarios(){
		dao = new UsuarioDAOImpl();
		List<Usuario> list=dao.listAll(); 
		return list; 
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
