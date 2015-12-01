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
	
	public boolean adicionarTempoJogo(TempoJogo tempoJogo){
		dao = new TempoJogoDAOImpl();
		TempoJogo tempo = new TempoJogo(tempoJogo.date, tempoJogo.tempo);
		return dao.create(tempo) ? true : false; 
	}
	
	public List<TempoJogo> buscarTempoJogo(long idUsuario){
		dao = new TempoJogoDAOImpl();
		return dao.listAllByUser(idUsuario);
	}

	public List<TempoJogo> buscarTempoJogo(){
		dao = new TempoJogoDAOImpl();
		return dao.listAll();
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
