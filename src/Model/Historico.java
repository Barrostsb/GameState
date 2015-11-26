package Model;

import java.util.Date;
import java.util.List;

import DAO.HistoricoDAO;
import DAO.HistoricoDAOImpl;

public class Historico {
	private Date date;
	private float tempo;
	
	private HistoricoDAO dao; 
	
	public Historico(){}
	public Historico(Date date, float tempo){
		this.date = date;
		this.tempo = tempo;
	}
	
	public boolean adicionarHistorico(Historico historico){
		dao = new HistoricoDAOImpl();
		Historico hist = new Historico(historico.date, historico.tempo);
		return dao.create(hist) ? true : false; 
	}
	
	public List<Historico> buscarHistorico(Usuario usuario){
		dao = new HistoricoDAOImpl();
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
