package ServicoImpl;

import java.util.List;

import servico.CategoriaServico;
import servico.ServicoException;
import dao.CategoriaDao;
import dao.DaoFactory;
import dao.FilmeDao;
import dao.jpa.EM;
import dominio.Categoria;
import dominio.Filme;

public class CategoriaServicoImpl implements CategoriaServico {

	private CategoriaDao dao;

	public CategoriaServicoImpl() {
		dao = DaoFactory.criarCategoriaDao();
	}

	@Override
	public void inserirAtualizar(Categoria x) throws ServicoException {

		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void excluir(Categoria x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public Categoria buscaPorCodigo(int cod) {

		return dao.buscaPorCodigo(cod);
	}

	@Override
	public List<Categoria> buscarTodos() {

		return dao.buscarTodos();
	}

	@Override
	public List<Filme> listarFilmesPorAno(int ano) {
		
		return dao.listarFilmesPorAno(ano);
	}

}
