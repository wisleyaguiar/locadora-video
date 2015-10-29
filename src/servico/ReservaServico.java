package servico;

import java.util.List;

import dominio.Reserva;

public interface ReservaServico {
	
	public void inserirAtualizar(Reserva x) throws ServicoException;

	public void excluir(Reserva x);

	public Reserva buscaPorCodigo(int cod);

	public List<Reserva> buscarTodos();

}
