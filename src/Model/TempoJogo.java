package Model;

import java.util.Date;
import java.util.List;

import Model.DAO.TempoJogoDAO;
import Model.DAO.TempoJogoDAOImpl;

public class TempoJogo {
	private Date data;
	private String horarioInicial;
	private String horarioFinal;
	private long idUsuario;
	private long idJogo;
	
	
	private TempoJogoDAO dao; 
	
	public TempoJogo(){}
	public TempoJogo(Date data, String horarioInicial, String horarioFinal, long idUsuario, long idJogo){
		this.data = data;
		this.horarioInicial = horarioInicial;
		this.horarioFinal = horarioFinal;
		this.idUsuario = idUsuario;
		this.idJogo = idJogo;
	}
	
	public boolean adicionarTempoJogo(TempoJogo tempoJogo){
		dao = new TempoJogoDAOImpl();
		TempoJogo tempo = new TempoJogo(tempoJogo.data, tempoJogo.horarioInicial, tempoJogo.horarioFinal, tempoJogo.idUsuario, tempoJogo.idJogo);
		return dao.create(tempo); 
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
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHorarioInicial() {
		return horarioInicial;
	}

	public void setHorarioInicial(String horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	
	public String getHorarioFinal() {
		return horarioFinal;
	}
	
	public void setHorarioFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
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
