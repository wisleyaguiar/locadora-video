package servico;

import java.util.List;

import dominio.Cliente;

public interface ClienteServico {

	public void inserirAtualizar(Cliente x) throws ServicoException;

	public void excluir(Cliente x);

	public Cliente buscaPorCodigo(int cod);

	public List<Cliente> buscarTodos();
	
}
