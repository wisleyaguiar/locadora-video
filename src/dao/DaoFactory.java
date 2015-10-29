package dao;

import dao.jpa.CategoriaDaoImpl;
import dao.jpa.ClienteDaoImpl;
import dao.jpa.FilmeDaoImpl;
import dao.jpa.ItemLocacaoDaoImpl;
import dao.jpa.LocacaoDaoImpl;
import dao.jpa.ReservaDaoImpl;


public class DaoFactory {

	
	
	public static CategoriaDao criarCategoriaDao() {
	
		return new CategoriaDaoImpl();
	}

	public static FilmeDao criarFilmeDao() {
		
		return new FilmeDaoImpl();

	}
	public static ClienteDao criarClienteDao() {
		
		return new ClienteDaoImpl();
	}
	public static LocacaoDao criarLocacaoDao() {
		
		return new LocacaoDaoImpl();
	}
   public static ReservaDao criarReservaDao() {
		
		return new ReservaDaoImpl();
	}
   public static ItemLocacaoDao criarItemLocacaoDao() {
		
		return new ItemLocacaoDaoImpl();
	}
	
	
}
