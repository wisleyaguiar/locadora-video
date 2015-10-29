package dominio;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tb_itemLocacao")
public class ItemLocacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codItemLocacao;
	private Integer quantidade;

	@ManyToOne
	@JoinColumn(name="filme")
	private Filme filme;
	
	@ManyToOne
	@JoinColumn(name="locacao")
	private Locacao locacao;
	
//	private List<Locacao> locacao;
	

	public ItemLocacao() {
		
	}

	
	public ItemLocacao(Integer codItemLocacao, Integer quantidade, Filme filme,
		Locacao locacao) {
	super();
	this.codItemLocacao = codItemLocacao;
	this.quantidade = quantidade;
	this.filme = filme;
	this.locacao = locacao;
}


	public Integer getCodItemLocacao() {
		return codItemLocacao;
	}

	public void setCodItemLocacao(Integer codItemLocacao) {
		this.codItemLocacao = codItemLocacao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codItemLocacao == null) ? 0 : codItemLocacao.hashCode());
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + ((locacao == null) ? 0 : locacao.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
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
		ItemLocacao other = (ItemLocacao) obj;
		if (codItemLocacao == null) {
			if (other.codItemLocacao != null)
				return false;
		} else if (!codItemLocacao.equals(other.codItemLocacao))
			return false;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (locacao == null) {
			if (other.locacao != null)
				return false;
		} else if (!locacao.equals(other.locacao))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
	
	public BigDecimal valorSubTotal() {

//		BigDecimal num = new BigDecimal(filmes.size());
//		BigDecimal valTot = getPreco();
//		valTot = valTot.multiply(num);
//		return valTot;
		return new BigDecimal("0.00");

	}

	
	

}
