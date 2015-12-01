package Model;

import java.util.List;

import Model.DAO.JogoDAO;
import Model.DAO.JogoDAOImpl;

public class Jogo {
	private long id;
	private String nome;
	
	private JogoDAO dao; 
	
	public Jogo(){}
	
	public Jogo(Jogo jogo){
		this.id = jogo.getId();
		this.nome = jogo.getNome();
	}
	
	public boolean salvar(Jogo jogo){
		dao = new JogoDAOImpl();		
		return dao.create(jogo); 
	}
	
	public boolean excluir(long id){
		dao = new JogoDAOImpl();
		Jogo jogo = new Jogo();
		jogo = dao.read(id);
		return dao.delete(jogo); 
	}
	
	public boolean alterar(Jogo jogo){
		dao = new JogoDAOImpl();
		return dao.update(jogo); 
	}
	
	public List<Jogo> buscarJogos(){
		dao = new JogoDAOImpl();
		//List<Jogo> = 
		return null; 
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
