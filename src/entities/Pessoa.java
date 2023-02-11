package entities;

public class Pessoa {

	private Integer idPessoa;
	private String name;
	private String email;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer idPessoa, String name, String email) {
		super();
		this.idPessoa = idPessoa;
		this.name = name;
		this.email = email;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
