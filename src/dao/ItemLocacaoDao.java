package dao;

import java.util.List;

import dominio.ItemLocacao;

public interface ItemLocacaoDao {

	public void inserirAtualizar(ItemLocacao x);

	public void excluir(ItemLocacao x);

	public ItemLocacao buscaPorCodigo(int cod);

	public List<ItemLocacao> buscarTodos();
}
