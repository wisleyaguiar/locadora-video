package servico;

import java.util.List;

import dominio.ItemLocacao;

public interface ItemLocacaoServico {
	
	public void inserirAtualizar(ItemLocacao x) throws ServicoException;

	public void excluir(ItemLocacao x);

	public ItemLocacao buscaPorCodigo(int cod);

	public List<ItemLocacao> buscarTodos();

}
