package dao;

import dominio.Categoria;
import dominio.Filme;

import java.util.ArrayList;
import java.util.List;

public interface CategoriaDao {

	public void inserirAtualizar(Categoria x);

	public void excluir(Categoria x);

	public Categoria buscaPorCodigo(int cod);

	public List<Categoria> buscarTodos();
	
	public List<Filme> listarFilmesPorAno(int ano);

}
