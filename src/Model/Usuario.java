package Model;

public class Usuario {
	private long id;
	private String nome;
	
	public boolean salvar(long id, String nome, int senha){
		return true;
	}
	
	public boolean excluir(long id){
		return true;
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
	public void setNome(String nome) {
		this.nome = nome;
	}
}
