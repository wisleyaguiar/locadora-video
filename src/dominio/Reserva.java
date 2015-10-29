package dominio;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name="tb_reserva")
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codReserva;
	private Integer quantidadefilmes;
	private Date dataReserva;
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name="reserva")
	private Filme filme;
	
		
	public Reserva() {
		
	}

	
	public Reserva(Integer codReserva, Integer quantidadefilmes,
			Date dataReserva, String observacao, Filme filme) {
		super();
		this.codReserva = codReserva;
		this.quantidadefilmes = quantidadefilmes;
		this.dataReserva = dataReserva;
		this.observacao = observacao;
		this.filme = filme;
	}



	public Integer getCodReserva() {
		return codReserva;
	}

	public void setCodReserva(Integer codReserva) {
		this.codReserva = codReserva;
	}

	
	public Integer getQuantidadefilmes() {
		return quantidadefilmes;
	}

	public void setQuantidadefilmes(Integer quantidadefilmes) {
		this.quantidadefilmes = quantidadefilmes;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	
	public Filme getFilme() {
		return filme;
	}


	public void setFilme(Filme filme) {
		this.filme = filme;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codReserva == null) ? 0 : codReserva.hashCode());
		result = prime * result
				+ ((dataReserva == null) ? 0 : dataReserva.hashCode());
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime
				* result
				+ ((quantidadefilmes == null) ? 0 : quantidadefilmes.hashCode());
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
		Reserva other = (Reserva) obj;
		if (codReserva == null) {
			if (other.codReserva != null)
				return false;
		} else if (!codReserva.equals(other.codReserva))
			return false;
		if (dataReserva == null) {
			if (other.dataReserva != null)
				return false;
		} else if (!dataReserva.equals(other.dataReserva))
			return false;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (quantidadefilmes == null) {
			if (other.quantidadefilmes != null)
				return false;
		} else if (!quantidadefilmes.equals(other.quantidadefilmes))
			return false;
		return true;
	}


	

	

	
	

	
}
