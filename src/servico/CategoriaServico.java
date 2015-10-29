package servico;

import java.util.List;

import dominio.Categoria;
import dominio.Filme;

public interface CategoriaServico {

	public void inserirAtualizar(Categoria x) throws ServicoException;

	public void excluir(Categoria x);

	public Categoria buscaPorCodigo(int cod);

	public List<Categoria> buscarTodos();
	
	public List<Filme> listarFilmesPorAno(int ano);
	
}
