package ServicoImpl;

import java.util.List;

import servico.LocacaoServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.LocacaoDao;
import dao.jpa.EM;
import dominio.Locacao;

public class LocacaoServicoImpl implements LocacaoServico {

    private LocacaoDao dao;
	
	public LocacaoServicoImpl(){
		dao  = DaoFactory.criarLocacaoDao();
	}
	
	@Override
	public void inserirAtualizar(Locacao x) throws ServicoException {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public void excluir(Locacao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public Locacao buscaPorCodigo(int cod) {
		
		return dao.buscaPorCodigo(cod);
	}

	@Override
	public List<Locacao> buscarTodos() {
		
		return dao.buscarTodos();
	}

}
