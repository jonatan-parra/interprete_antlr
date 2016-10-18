package objetos;

public class Objeto {

	private String id;
	private String objeto;
	private String tipo;
	
	public Objeto(String id, String tipo){
		this.id = id;
		this.tipo = tipo;
	}
	
	public Objeto(String id){
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString(){
		return "[" + id + ", " + objeto + ", " + tipo + "]";
	}

}
