package negocio;

public class Instituicao {

	private int codigo;
	private String descricao;
	
	public void exibir(){
		System.out.println("C�digo = " + this.getCodigo());
		System.out.println("Descri��o = " + this.getDescricao());
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
