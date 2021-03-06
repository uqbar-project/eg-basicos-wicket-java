package uqbar.ejemplosBasicos.applicationModel;

import java.io.Serializable;
import java.util.List;

import uqbar.ejemplosBasicos.domain.Biblioteca;
import uqbar.ejemplosBasicos.domain.Libro;

public class BuscadorLibros implements Serializable {
	private String tituloBusqueda = "";
	private List<Libro> resultado = null;

	public void buscar() {
		if (this.tituloBusqueda == null) {
			this.tituloBusqueda = "";
		} 
		this.resultado = Biblioteca.getInstance().buscar(this.tituloBusqueda);
	}

	// ********************************************************
	// ** Accessors
	// ********************************************************
	public String getTituloBusqueda() {
		return this.tituloBusqueda;
	}
	
	public void setTituloBusqueda(String tituloBusqueda) {
		this.tituloBusqueda = tituloBusqueda;
	}

	public List<Libro> getResultado() {
		return this.resultado;
	}
	
	public void setResultado(List<Libro> resultado) {
		this.resultado = resultado;
	}

}
