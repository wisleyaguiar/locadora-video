package dao;

import dominio.Cliente;
import java.util.List;

public interface ClienteDao {

	public void inserirAtualizar(Cliente x);

	public void excluir(Cliente x);

	public Cliente buscaPorCodigo(int cod);

	public List<Cliente> buscarTodos();

}
