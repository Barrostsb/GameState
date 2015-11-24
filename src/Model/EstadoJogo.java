package Model;

public class EstadoJogo {
	private double pontuacao;
	private double lifeBar;
	private double fase;
	
	public boolean armazenarEstadoJogo(EstadoJogo estadoJogo){
		return true;
	}
	
	public EstadoJogo buscarEstadoJogo(Jogo jogo, Usuario usuario){
		return new EstadoJogo();
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
