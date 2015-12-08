package Model;

import Model.DAO.EstadoJogoDAO;
import Model.DAO.EstadoJogoDAOImpl;

public class EstadoJogo {
	private double pontuacao;
	private double lifeBar;
	private long fase;
	private long idUsuario;
	private long idJogo;
	
	private EstadoJogoDAO dao; 
	
	public EstadoJogo(){}
	
	public EstadoJogo(double pontuacao,double lifeBar,long fase, long idUsuario, long idJogo){
		this.pontuacao = pontuacao;
		this.lifeBar = lifeBar;
		this.fase = fase;
		this.idUsuario = idUsuario;
		this.idJogo = idJogo;
	}
	
	public boolean armazenarEstadoJogo(EstadoJogo estadoJogo){
		dao = new EstadoJogoDAOImpl();
		EstadoJogo estado = new EstadoJogo(estadoJogo.getPontuacao(), estadoJogo.getLifeBar(), estadoJogo.getFase(), estadoJogo.getIdUsuario(), estadoJogo.getIdJogo());
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

	public long getFase() {
		return fase;
	}

	public void setFase(long fase) {
		this.fase = fase;
	}
	
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long id_usuario) {
		this.idUsuario = id_usuario;
	}
	public long getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(long id_jogo) {
		this.idJogo = id_jogo;
	}
	
}
