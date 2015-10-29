package principal;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import servico.CategoriaServico;
import servico.FilmeServico;
import servico.ItemLocacaoServico;
import servico.LocacaoServico;
import servico.ServicoException;
import servico.ServicoFactory;
import dao.DaoFactory;
import dominio.Categoria;
import dominio.Filme;
import dominio.ItemLocacao;
import dominio.Locacao;

public class ProgramaServico {

	public static void main(String[] args) throws ParseException {

		Scanner ent = new Scanner(System.in);
		int op = 0;
		 int cod = 0 ;
     
		Categoria cat = null;
		Filme fil = null;
		Locacao loc = null;
		ItemLocacao itemLoc = null;

		CategoriaServico categoriaServico = ServicoFactory.criarCategoriaServico();
		FilmeServico filmeServico = ServicoFactory.criarFilmeServico();
		LocacaoServico locacaoServico = ServicoFactory.criarLocacaoServico();
		ItemLocacaoServico itemLocacaoServico = ServicoFactory.criarItemLocacaoServico();

		while (op != 7) {
			Menu.mostrar();
			op = Integer.parseInt(ent.nextLine());

			switch (op) {
			case 1:

				System.out.println("************ LOCADORA DE FILMES ************** ");
				
				List<Filme> listFilmes = filmeServico.buscarTodos();

				System.out.println("Catalogo de Filmes:");
				for (Filme x : listFilmes) {
					System.out.println(x.getCodFilme() +" = " +x.getTitulo() + ", " + x.getAno()
							+ " - " + x.getCategoria().getDescricao());

					System.out
							.println("********************************************** ");
				}

			
				
				break;
				
			case 2:

				System.out
						.println("************ LOCADORA DE FILMES ************** ");
			
					System.out.println("\nDigite o titulo do filme: ");
					String titulo = ent.nextLine();
					System.out.println("Digite o ano : ");
					int ano = Integer.parseInt(ent.nextLine());
					System.out.println("Digite a categoria : ");
					int cate = Integer.parseInt(ent.nextLine());
					
					cat = categoriaServico.buscaPorCodigo(cate);
					
					if (cat == null) {
						System.out.println("Código inexistente!");
					} else {
								System.out.println("categoria encontrada: "+cat.getDescricao());
							}
							
			
				fil = new Filme(null,titulo, ano, null,cat,null,null);
				
				
					
					
					try {
						filmeServico.inserirAtualizar(fil);
						
						System.out.println("Filme inserido! Código: " + fil.getCodFilme());
					}
					catch (ServicoException e) {
						
						System.out.println("Falha ao inserir Filme! "+e.getMessage());
					}
				
				
				
						
				break;

			case 3:
				//PESQUISAR FILME POR CODIGO
			
				System.out.println("Digite o código de um Filme: ");
				cod = Integer.parseInt(ent.nextLine());
			
				fil = filmeServico.buscaPorCodigo(cod);
				if (fil == null) {
					System.out.println("Código inexistente!");
				} else {
					System.out.println("Filme: "+ fil.getTitulo() + "\nAno: " + fil.getAno()+fil.getCategoria());
				}
				
				
				break;
				
			case 4:

				// TESTE FILMES POR ANO
				List<Filme> listFil = filmeServico.buscarTodos();
				
				
				System.out.println("************ LOCADORA DE FILMES ************** ");
				System.out.println("Digite o ano do Filme: ");
				int an = Integer.parseInt(ent.nextLine());
												
				List<Filme> listFi = categoriaServico.listarFilmesPorAno(an);
		//		Filme f = em.find(Filme.class, an);
								
	
			System.out.println("Titulo do Filme :"+((Filme) listFi).getTitulo()+"\nAno :"+listFi.get(an));
								
				
				System.out.println("********************************************** ");
	
				
			
				break;
			case 5:

				// TESTE VALOR TOTAL DAS LOCACOES
				// System.out.println("Valor Total Locacoes: R$"+loc1.valorTotalLocacoes());
				
				// TESTE FILMES POR CATEGORIA
				// System.out.println(Categoria.filmesPorCategoria(cat2));

				break;
			case 6:
				
				
				break;
			case 7:
				System.out.println("Fim do programa!");
				break;
			default:
				System.out.println("Opção inválida");
			}

		//	ent.close();
		}
	}
}
