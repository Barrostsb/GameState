package Model;

import java.util.Date;
import java.util.List;

import Model.DAO.TempoJogoDAO;
import Model.DAO.TempoJogoDAOImpl;

public class TempoJogo {
	private Date date;
	private float tempo;
	
	private TempoJogoDAO dao; 
	
	public TempoJogo(){}
	public TempoJogo(Date date, float tempo){
		this.date = date;
		this.tempo = tempo;
	}
	
	public boolean adicionarHistorico(TempoJogo historico){
		dao = new TempoJogoDAOImpl();
		TempoJogo hist = new TempoJogo(historico.date, historico.tempo);
		return dao.create(hist) ? true : false; 
	}
	
	public List<TempoJogo> buscarHistorico(Usuario usuario){
		dao = new TempoJogoDAOImpl();
		return dao.listAllByUser(usuario);
	}

	
	//Getters and Setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getTempo() {
		return tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
}
