package servico;

import ServicoImpl.CategoriaServicoImpl;
import ServicoImpl.ClienteServicoImpl;
import ServicoImpl.FilmeServicoImpl;
import ServicoImpl.ItemLocacaoServicoImpl;
import ServicoImpl.LocacaoServicoImpl;
import ServicoImpl.ReservaServicoImpl;

public class ServicoFactory {
	
	public static ClienteServico criarClienteServico(){
		return new ClienteServicoImpl();
		
	}

	public static CategoriaServico criarCategoriaServico(){
		return new CategoriaServicoImpl();
		
	}
	public static FilmeServico criarFilmeServico(){
		return new FilmeServicoImpl();
		
	}
	public static LocacaoServico criarLocacaoServico(){
		return new LocacaoServicoImpl();
		
	}
	public static ReservaServico criarReservaServico(){
		return new ReservaServicoImpl();
		
	}
	public static ItemLocacaoServico criarItemLocacaoServico(){
		return new ItemLocacaoServicoImpl();
		
	}
			
		
}
