package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ReservaDao;
import dominio.Reserva;

public class ReservaDaoImpl implements ReservaDao {

	private EntityManager  em;
	
	public ReservaDaoImpl() {
		
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Reserva x) {
		if (x.getCodReserva() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Reserva x) {
		x = em.merge(x);
		em.remove(x);

	}

	@Override
	public Reserva buscaPorCodigo(int cod) {
		return em.find(Reserva.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> buscarTodos() {
		String jpql = "SELECT x FROM Reserva x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
