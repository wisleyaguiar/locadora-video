package ServicoImpl;

import java.util.List;

import servico.ReservaServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.ReservaDao;
import dao.jpa.EM;
import dominio.Reserva;

public class ReservaServicoImpl implements ReservaServico {
	
    private ReservaDao dao;
	
	public ReservaServicoImpl(){
		dao  = DaoFactory.criarReservaDao();
	}

	@Override
	public void inserirAtualizar(Reserva x) throws ServicoException {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public void excluir(Reserva x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public Reserva buscaPorCodigo(int cod) {
		
		return dao.buscaPorCodigo(cod);
	}

	@Override
	public List<Reserva> buscarTodos() {
		
		return dao.buscarTodos();
	}

}
