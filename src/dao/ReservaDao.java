package dao;

import dominio.Reserva;
import java.util.List;

public interface ReservaDao {

	public void inserirAtualizar(Reserva x);

	public void excluir(Reserva x);

	public Reserva buscaPorCodigo(int cod);

	public List<Reserva> buscarTodos();

}
