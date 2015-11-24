package Model;

import java.util.Date;

public class Historico {
	private Date date;
	private float tempo;
	
	public boolean adicionarHistorico(Historico historico){
		return true;
	}
	
	//Getters and Setters
	
	public Historico buscarHistorico(Usuario usuario){
		return new Historico();
	}

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
