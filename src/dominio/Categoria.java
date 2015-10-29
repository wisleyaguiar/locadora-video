package dominio;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_categoria")
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="codCategoria")
	private Integer codCategoria;
	
	@Column (name="descricao")
	private String descricao;
	
	@OneToMany(mappedBy="categoria")	
	private List<Filme> filmes;
	
	public Categoria() {
		filmes = new ArrayList<Filme>();
	}

	public Categoria(Integer codCategoria, String descricao, List<Filme> filmes) {
		super();
		this.codCategoria = codCategoria;
		this.descricao = descricao;
		this.filmes = filmes;
	}

	public Integer getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(Integer codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	/* Associacao de muitos*/
	public void addFilme(Filme x){
		this.filmes.add(x);
	}
	
	public void removeFilme(Filme x){
		this.filmes.remove(x);
	}
	
	@Override
	public String toString() {
	return "\nCategoria: " +descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codCategoria == null) ? 0 : codCategoria.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((filmes == null) ? 0 : filmes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (codCategoria == null) {
			if (other.codCategoria != null)
				return false;
		} else if (!codCategoria.equals(other.codCategoria))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (filmes == null) {
			if (other.filmes != null)
				return false;
		} else if (!filmes.equals(other.filmes))
			return false;
		return true;
	}

	public static ArrayList<Filme> listarFilmesPorAno(int ano){
		ArrayList<Filme> list = new ArrayList<>();
		for (Filme x : list)  {
			if(x.getAno() == ano){
				list.add(x);
			}			
		}
		return list;
	}	
	public static List<Filme> filmesPorCategoria(Categoria c){
		return c.filmes;		
	}
}
