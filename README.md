# GerenciadorAnuncio

Versão do JDK: 14.0.1 
Versão do NetBeans: 8.2 
Versão do Wamp: 3.2.3 64bit

Para que o programa funcione corretamente, é necessário iniciar o WampServer e logo após, executar o script do banco de dados presente neste repositório no MySQL Workbench para criar a base de dados.

Após criar a base de dados, deve-se importar o projeto para o NetBeans, após importar, é necessário verificar se as bibliotecas do programa (presentes na pasta "lib" do repositório) foram importadas corretamente no pacote das bibliotecas. Caso não tenham sido, é necessário adicioná-las no pacote "Bibliotecas" do projeto, caso contrário, o programa não funcionará.

A classe "ConnectionFactory", do pacote "connection" deve ser configurada com a URL do endereço onde o banco de dados foi criado, juntamente com o usuário do banco de dados, e a senha do mesmo (Para realizar tais alterações basta substituir as informações que estão entre aspas pelas informações do banco de dados de quem for executar o programa).

Logo que a classe "ConnectionFactory", for configurada, é necessário estabelecer a conexão do banco de dados com o NetBeans. Para fazer isto, basta acessar a aba serviçoes, localizada no canto superior esquerdo no NetBeans, clicar com o botão direito em banco de dados, nova conexão, após isto, aparecerá o banco de dados criado através do script deste repositório, deve-se então clicar com o botão direito no mesmo e selecionar a opção de conectar.

Após todos estes passos, será possível executar o programa, através de sua classe principal "CadastroAnuncio.java" localizada no pacote view.

Assim que for executado, o programa mostrará uma tela de cadastro juntamente com uma tabela, que assim que informadas as informações corretamente para efetuar o cadastro do anúncio, mostrará o registro do mesmo.

O programa permite a pesquisa de anúncios por nome de cliente, para efetuar tal pesquisa, basta clicar no botão localizado ao lado do campo para informar o cliente.

O programa também permite a pesquisa de anúncios por intervalo de tempo através da data de fim, para efetuar tal pesquisa, basta clicar no botão localizado ao lado do campo para informar a data de fim.

<strong>IMPORTANTE</strong>: Para que os testes unitários ocorram corretamente, é necessário adicionar a biblioteca "JUnit 4.12" no pacote de bibliotecas de teste. Para realizar os testes é necessário comentar as linhas que efetuam a inserção dos dados na jTable na clase AnuncioDAO.
