Locadora Prime: Gerenciamento de Aluguel de Filmes, Jogos e Séries
Introdução:
Locadora Prime é um programa inspirado nas regras das locadoras que eu frequentava quando criança, uma de filmes e outra de fitas de jogos para o SNES (Super Nintendo). Acrescentei séries para atualizar o programa para os dias de hoje. O objetivo do programa é ajudar a gerenciar o processo de aluguel dos clientes, evitando confusões e auxiliando o dono da locadora na aplicação de multas por atraso e no cadastro de novos clientes.

Regras para Locação:

Cada cliente pode alugar no máximo um item por vez e tem um prazo de até uma semana para devolver.
Durante o período de aluguel, o cliente não pode alugar novos itens antes de devolver o que já foi alugado.
Classe Principal
Descrição:
A classe Principal é a classe principal do programa. Ela gerencia a interação com o usuário e coordena as operações de inserção, alteração, remoção e listagem de produtos e clientes.

Atributos:

produtos: Lista de produtos da locadora (ArrayList<Item>).
clientes: Lista de clientes da locadora (ArrayList<Pessoa>).
Métodos:

main: Exibe um menu de opções para o usuário e chama os métodos apropriados com base na escolha do usuário.
inserirProduto: Solicita os detalhes de um produto ao usuário, cria um objeto do tipo apropriado (Filmes, Series, Jogos) e o adiciona à lista de produtos.
alterarProduto: Solicita o título de um produto a ser alterado, encontra o produto na lista e permite que o usuário altere seus detalhes.
removerProduto: Solicita o título de um produto a ser removido, encontra o produto na lista e o remove.
listarProdutos: Lista todos os produtos, exibindo seus detalhes.
inserirCliente: Solicita os detalhes de um cliente ao usuário, cria um objeto Pessoa e o adiciona à lista de clientes.
listarClientes: Lista todos os clientes, exibindo seus detalhes.
Classe Pessoa
Descrição:
A classe Pessoa representa um cliente da locadora, armazenando informações pessoais e detalhes sobre o produto alugado.

Atributos:

nome: Nome do cliente.
telefone: Telefone do cliente.
dataDoInicioDoAluguel: Data de início do aluguel do produto.
cpf: CPF do cliente.
produtoAlugado: O produto que o cliente alugou (Item).
Métodos:

Métodos getter e setter para acessar e modificar os atributos do cliente.
Classe Aluguel
Descrição:
A classe Aluguel representa a relação entre um cliente e um produto alugado.

Atributos:

cliente: O cliente que realizou o aluguel (Pessoa).
midia: O produto alugado (Item).
Métodos:

Métodos getter e setter para acessar e modificar os atributos de aluguel.
Classe Item
Descrição:
A classe Item é a classe base para todos os tipos de produtos da locadora, armazenando informações comuns a todos os produtos.

Atributos:

titulo: Título do produto.
categoria: Categoria do produto.
ano: Ano de lançamento do produto.
classificacao: Classificação indicativa do produto.
estudio: Estúdio responsável pelo produto.
Métodos:

Métodos getter e setter para acessar e modificar os atributos do item.
Classe Jogos
Descrição:
A classe Jogos é uma subclasse de Item, representando jogos disponíveis na locadora.

Atributos:

plataforma: Plataforma em que o jogo pode ser jogado (ex: PlayStation, Xbox).
Métodos:

Métodos getter e setter para acessar e modificar os atributos da plataforma.
Classe Filmes
Descrição:
A classe Filmes é uma subclasse de Item, representando filmes disponíveis na locadora.

Atributos:

duracao: Duração do filme em minutos.
Métodos:

Métodos getter e setter para acessar e modificar os atributos da duração.
Classe Series
Descrição:
A classe Series é uma subclasse de Item, representando séries disponíveis na locadora.

Atributos:

numeroDaTemporada: Número de temporadas da série.
numeroDeEpisodeos: Número de episódios por temporada.
Métodos:

Métodos getter e setter para acessar e modificar os atributos de temporadas e episódios.
