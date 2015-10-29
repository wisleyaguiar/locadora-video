package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@Table(name = "tb_locacao")
public class Locacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codLocacao;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private BigDecimal preco;

	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	
		
    @OneToMany(mappedBy="locacao")
	private List<ItemLocacao> itensLocacao;
	
	public Locacao() {

	}

	public Locacao(Integer codLocacao, Date dataEmprestimo, Date dataDevolucao,
			BigDecimal preco, Cliente cliente) {
		super();
		this.codLocacao = codLocacao;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.preco = preco;
		this.cliente = cliente;
	}

	public Integer getCodLocacao() {
		return codLocacao;
	}

	public void setCodLocacao(Integer codLocacao) {
		this.codLocacao = codLocacao;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "\nLocacao [Codigo = " + codLocacao + "\nDataEmprestimo = "
				+ sdf.format(dataEmprestimo) + "\nDataDevolucao : "
				+ sdf.format(dataDevolucao) + "\nPreco :" + preco
				+ "\nCliente :" + cliente + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codLocacao == null) ? 0 : codLocacao.hashCode());
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
		Locacao other = (Locacao) obj;
		if (codLocacao == null) {
			if (other.codLocacao != null)
				return false;
		} else if (!codLocacao.equals(other.codLocacao))
			return false;
		return true;
	}

	public BigDecimal valorTotalLocacao() {

//		BigDecimal num = new BigDecimal(filmes.size());
//		BigDecimal valTot = getPreco();
//		valTot = valTot.multiply(num);
//		return valTot;
		return new BigDecimal("0.00");

	}
}
