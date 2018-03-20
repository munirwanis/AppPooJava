package negocio;

public class Disciplina {

	private int codigo;
	private String descricao;
	
	public void exibir(){
		System.out.println("Código = " + this.getCodigo());
		System.out.println("Descrição = " + this.getDescricao());
	}
	
	public Disciplina() {
		this.setCodigo(999);
	}
	
	public Disciplina(String descricao) {
		this();
		this.setDescricao(descricao);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}