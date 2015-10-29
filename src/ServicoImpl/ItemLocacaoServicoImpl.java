package ServicoImpl;

import java.util.List;

import servico.ItemLocacaoServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.ItemLocacaoDao;
import dao.jpa.EM;
import dominio.ItemLocacao;

public class ItemLocacaoServicoImpl implements ItemLocacaoServico {
	
private ItemLocacaoDao dao;
	
	public ItemLocacaoServicoImpl(){
		dao  = DaoFactory.criarItemLocacaoDao();
	}

	@Override
	public void inserirAtualizar(ItemLocacao x) throws ServicoException {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void excluir(ItemLocacao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public ItemLocacao buscaPorCodigo(int cod) {
		
		return dao.buscaPorCodigo(cod);
	}

	@Override
	public List<ItemLocacao> buscarTodos() {
		
		return dao.buscarTodos();
	}

}
