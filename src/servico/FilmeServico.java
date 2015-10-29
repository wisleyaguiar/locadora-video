package servico;

import java.util.List;

import dominio.Filme;

public interface FilmeServico {
	
	public void inserirAtualizar(Filme x) throws ServicoException;

	public void excluir(Filme x);
	
	public Filme buscaPorCodigo(int cod);
	
	public List<Filme> buscarTodos();

}
