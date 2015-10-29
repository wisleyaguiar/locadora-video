package dao;

import dominio.Filme;
import java.util.List;

public interface FilmeDao {

	public void inserirAtualizar(Filme x);

	public void excluir(Filme x);
	
	public Filme buscaPorCodigo(int cod);
	
	public List<Filme> buscarTodos();
	


}
