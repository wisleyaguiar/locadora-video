package ServicoImpl;

import java.util.List;

import servico.FilmeServico;
import servico.ServicoException;
import dao.CategoriaDao;
import dao.DaoFactory;
import dao.FilmeDao;
import dao.jpa.EM;
import dominio.Categoria;
import dominio.Filme;

public class FilmeServicoImpl implements FilmeServico {
	
private FilmeDao dao;
	
	public FilmeServicoImpl(){
		dao  = DaoFactory.criarFilmeDao();
	}

	@Override
	public void inserirAtualizar(Filme x) throws ServicoException {
		
		CategoriaDao categoriaDao = DaoFactory.criarCategoriaDao();
		Categoria cat = categoriaDao.buscaPorCodigo(x.getCategoria().getCodCategoria());
		
		for (Filme fil : cat.getFilmes()) {
			if (fil.getTitulo().equals(x.getTitulo())) {
				throw new ServicoException(
						"Nome de filme já existente para esta categoria", 1);
			}
		}

		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}

	

	@Override
	public void excluir(Filme x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public Filme buscaPorCodigo(int cod) {
		
		return dao.buscaPorCodigo(cod);
	}

	@Override
	public List<Filme> buscarTodos() {
		
		return dao.buscarTodos();
	}

}
