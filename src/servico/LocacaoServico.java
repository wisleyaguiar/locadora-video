package servico;

import java.util.List;

import dominio.Locacao;

public interface LocacaoServico {
	
	public void inserirAtualizar(Locacao x) throws ServicoException;

	public void excluir(Locacao x);

	public Locacao buscaPorCodigo(int cod);

	public List<Locacao> buscarTodos();

}
