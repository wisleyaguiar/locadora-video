package dao;

import dominio.Locacao;
import java.util.List;

public interface LocacaoDao {

	public void inserirAtualizar(Locacao x);

	public void excluir(Locacao x);

	public Locacao buscaPorCodigo(int cod);

	public List<Locacao> buscarTodos();

}
