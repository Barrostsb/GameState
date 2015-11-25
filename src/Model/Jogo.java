package Model;

import DAO.GenericDAO;
import DAO.JogoDAOImpl;

public class Jogo {
	private long id;
	private String nome;
	
	private GenericDAO<Jogo> dao; 
	
	public Jogo(){}
	public Jogo(long id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public boolean salvar(long id, String nome){
		dao = new JogoDAOImpl();
		Jogo jogo = new Jogo(id, nome);
		return dao.create(jogo) != null ? true : false; 
	}
	
	public boolean excluir(long id){
		dao = new JogoDAOImpl();
		Jogo jogo = new Jogo();
		jogo = dao.read(id);
		return dao.delete(jogo) != null ? true : false; 
	}

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String login) {
		this.nome = login;
	}
}
