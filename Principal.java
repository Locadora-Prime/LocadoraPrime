package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    private ArrayList<Item> produtos;  
    private ArrayList<Pessoa> clientes; 

    public Principal() {
        produtos = new ArrayList<>();  
        clientes = new ArrayList<>(); 
    }

    public static void main(String[] args) {
        Principal principal = new Principal();  
        Scanner scanner = new Scanner(System.in);  

        int opcao;

        
        do {
            System.out.println("1. Inserir Produto");
            System.out.println("2. Alterar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Inserir Cliente");
            System.out.println("6. Listar Clientes");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  
            
            switch (opcao) {
                case 1:
                    principal.inserirProduto(scanner);
                    break;
                case 2:
                    principal.alterarProduto(scanner);
                    break;
                case 3:
                    principal.removerProduto(scanner);
                    break;
                case 4:
                    principal.listarProdutos();
                    break;
                case 5:
                    principal.inserirCliente(scanner);
                    break;
                case 6:
                    principal.listarClientes();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);

        scanner.close();  
    }

    
    public void inserirProduto(Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Classificação: ");
        int classificacao = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Estúdio: ");
        String estudio = scanner.nextLine();
        System.out.print("Tipo (1-Filme, 2-Série, 3-Jogo): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

       
        switch (tipo) {
            case 1:
                System.out.print("Duração: ");
                double duracao = scanner.nextDouble();
                scanner.nextLine();  
                produtos.add(new Filmes(titulo, categoria, ano, classificacao, duracao, estudio));
                break;
            case 2:
                System.out.print("Número de Temporadas: ");
                int temporadas = scanner.nextInt();
                System.out.print("Número de Episódios: ");
                int episodios = scanner.nextInt();
                scanner.nextLine();  
                produtos.add(new Series(titulo, categoria, ano, classificacao, estudio, temporadas, episodios));
                break;
            case 3:
                System.out.print("Plataforma: ");
                String plataforma = scanner.nextLine();
                produtos.add(new Jogos(titulo, categoria, ano, classificacao, estudio, plataforma));
                break;
            default:
                System.out.println("Tipo inválido.");
                return;
        }

        System.out.println("Produto inserido com sucesso.");
    }

    
    public void alterarProduto(Scanner scanner) {
        System.out.print("Digite o título do produto a ser alterado: ");
        String titulo = scanner.nextLine();
        for (Item item : produtos) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.print("Novo título: ");
                item.setTitulo(scanner.nextLine());
                System.out.print("Nova categoria: ");
                item.setCategoria(scanner.nextLine());
                System.out.print("Novo ano: ");
                item.setAno(scanner.nextInt());
                System.out.print("Nova classificação: ");
                item.setClassificacao(scanner.nextInt());
                scanner.nextLine();  
                System.out.print("Novo estúdio: ");
                item.setEstudio(scanner.nextLine());
                if (item instanceof Filmes) {
                    System.out.print("Nova duração: ");
                    ((Filmes) item).setDuracao(scanner.nextDouble());
                    scanner.nextLine();  
                } else if (item instanceof Series) {
                    System.out.print("Novo número de temporadas: ");
                    ((Series) item).setNumeroDaTemporada(scanner.nextInt());
                    System.out.print("Novo número de episódios: ");
                    ((Series) item).setNumeroDeEpisodeos(scanner.nextInt());
                    scanner.nextLine();  
                } else if (item instanceof Jogos) {
                    System.out.print("Nova plataforma: ");
                    ((Jogos) item).setPlataforma(scanner.nextLine());
                }
                System.out.println("Produto alterado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(Scanner scanner) {
        System.out.print("Digite o título do produto a ser removido: ");
        String titulo = scanner.nextLine();
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    
    public void listarProdutos() {
        for (Item item : produtos) {
            System.out.println("Título: " + item.getTitulo());
            System.out.println("Categoria: " + item.getCategoria());
            System.out.println("Ano: " + item.getAno());
            System.out.println("Classificação: " + item.getClassificacao());
            System.out.println("Estúdio: " + item.getEstudio());
            if (item instanceof Filmes) {
                System.out.println("Duração: " + ((Filmes) item).getDuracao());
            } else if (item instanceof Series) {
                System.out.println("Temporadas: " + ((Series) item).getNumeroDaTemporada());
                System.out.println("Episódios: " + ((Series) item).getNumeroDeEpisodeos());
            } else if (item instanceof Jogos) {
                System.out.println("Plataforma: " + ((Jogos) item).getPlataforma());
            }
            System.out.println("--------------------------");
        }
    }

    
    public void inserirCliente(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine(); 
        System.out.print("Data do início do aluguel: ");
        String dataDoInicioDoAluguel = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf =  scanner.nextLine();
        System.out.print("Id do produto alugado: ");
        int idProduto = scanner.nextInt();
        Item produtoAlugado = produtos.get(idProduto);

        clientes.add(new Pessoa(nome, telefone, dataDoInicioDoAluguel, cpf,produtoAlugado));
        System.out.println("Cliente inserido com sucesso.");
    }

    
    public void listarClientes() {
        for (Pessoa cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Data do início do aluguel: " + cliente.getdataDoInicioDoAluguel());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Produto Alugado: " + cliente.getProdutoAlugado());
            System.out.println("--------------------------");
        }
    }
}
