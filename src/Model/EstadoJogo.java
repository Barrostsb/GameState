package Model;

import Model.DAO.EstadoJogoDAO;
import Model.DAO.EstadoJogoDAOImpl;

public class EstadoJogo {
	private double pontuacao;
	private double lifeBar;
	private double fase;
	
	private EstadoJogoDAO dao; 
	
	public EstadoJogo(){}
	
	public EstadoJogo(double pontuacao,double lifeBar,double fase){
		this.pontuacao = pontuacao;
		this.lifeBar = lifeBar;
		this.fase = fase;
	}
	
	public boolean armazenarEstadoJogo(EstadoJogo estadoJogo){
		dao = new EstadoJogoDAOImpl();
		EstadoJogo estado = new EstadoJogo(estadoJogo.getPontuacao(), estadoJogo.getLifeBar(), estadoJogo.getFase());
		return dao.create(estado);
	}
	
	public EstadoJogo buscarEstadoJogo(long idUsuario, long idJogo){
		dao = new EstadoJogoDAOImpl();
		return dao.read(idUsuario, idJogo);
	}
	
	//Getter and Setters
	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public double getLifeBar() {
		return lifeBar;
	}

	public void setLifeBar(double lifeBar) {
		this.lifeBar = lifeBar;
	}

	public double getFase() {
		return fase;
	}

	public void setFase(double fase) {
		this.fase = fase;
	}
}
