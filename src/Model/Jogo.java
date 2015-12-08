package Model;

import java.util.List;

import Model.DAO.JogoDAO;
import Model.DAO.JogoDAOImpl;

public class Jogo {
	private long idJogo;
	private String nome;
	
	private JogoDAO dao; 
	
	public Jogo(){}
	
	public Jogo(Jogo jogo){
		this.idJogo = jogo.getId();
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
		List<Jogo> list = dao.listAll(); 
		return list; 
	}

	//Getters and Setters
	public long getId() {
		return idJogo;
	}

	public void setId(long id) {
		this.idJogo = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String login) {
		this.nome = login;
	}
}
