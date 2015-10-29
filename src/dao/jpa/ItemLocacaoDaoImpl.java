package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ItemLocacaoDao;
import dominio.ItemLocacao;

public class ItemLocacaoDaoImpl implements ItemLocacaoDao {

	private EntityManager  em;
	
	public ItemLocacaoDaoImpl() {
		
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(ItemLocacao x) {
		if (x.getCodItemLocacao() != null) {
			x = em.merge(x);
		}
		em.persist(x);

	}

	@Override
	public void excluir(ItemLocacao x) {
		x = em.merge(x);
		em.remove(x);

	}

	@Override
	public ItemLocacao buscaPorCodigo(int cod) {
		return em.find(ItemLocacao.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemLocacao> buscarTodos() {
		String jpql = "SELECT x FROM ItemLocacao x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
