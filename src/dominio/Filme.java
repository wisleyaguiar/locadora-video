package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_filme")
public class Filme implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codFilme;
	private String titulo;
	private Integer ano;
	private Integer quantidadeMidia;
	
	@ManyToOne
	@JoinColumn(name="categoria")
	private Categoria categoria;
	
	@OneToMany(mappedBy="filme")
	private List<ItemLocacao> itensLocacao;
	
	@OneToMany(mappedBy="filme")
	private List<Reserva> reservas;
		
    public static ArrayList<Filme> filmes = new ArrayList<Filme>();
	
	public Filme() {
	    super();
	}

	
	public Filme(Integer codFilme, String titulo, Integer ano,
			Integer quantidadeMidia, Categoria categoria,
			List<ItemLocacao> itensLocacao, List<Reserva> reservas) {
		super();
		this.codFilme = codFilme;
		this.titulo = titulo;
		this.ano = ano;
		this.quantidadeMidia = quantidadeMidia;
		this.categoria = categoria;
		this.itensLocacao = itensLocacao;
		this.reservas = reservas;
	}



	public Integer getCodFilme() {
		return codFilme;
	}

	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	public Integer getQuantidadeMidia() {
		return quantidadeMidia;
	}

	public void setQuantidadeMidia(Integer quantidadeMidia) {
		this.quantidadeMidia = quantidadeMidia;
	}

	
	public List<ItemLocacao> getItensLocacao() {
		return itensLocacao;
	}

	public void setItensLocacao(List<ItemLocacao> itensLocacao) {
		this.itensLocacao = itensLocacao;
	}

	
	public List<Reserva> getReservas() {
		return reservas;
	}


	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}


	public static void setFilmes(ArrayList<Filme> filmes) {
		Filme.filmes = filmes;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}
	/* Associacao de muitos*/
	public void addItemLocacao(ItemLocacao x){
		this.itensLocacao.add(x);
	}
	
	public void removeFilme(ItemLocacao x){
		this.itensLocacao.remove(x);
	}
	/* Associacao de muitos*/
	public void addReserva(Reserva x){
		this.reservas.add(x);
	}

	public void removeReservas(Reserva x){
		this.reservas.remove(x);
	}

	@Override
	public String toString() {
	return "\nFilme [Codigo = " +codFilme+ "\nTitulo = " + titulo  +"\nAno : "+ano+categoria+"]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result
				+ ((codFilme == null) ? 0 : codFilme.hashCode());
		result = prime * result
				+ ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result
				+ ((quantidadeMidia == null) ? 0 : quantidadeMidia.hashCode());
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
		Filme other = (Filme) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (codFilme == null) {
			if (other.codFilme != null)
				return false;
		} else if (!codFilme.equals(other.codFilme))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (quantidadeMidia == null) {
			if (other.quantidadeMidia != null)
				return false;
		} else if (!quantidadeMidia.equals(other.quantidadeMidia))
			return false;
		return true;
	}

	
	

	
}
