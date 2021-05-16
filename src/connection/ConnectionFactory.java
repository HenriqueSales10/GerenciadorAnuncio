package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <h1>Classe responsável pela conexão com o banco</h1>
 *
 * <p>
 * Conecta o programa com o banco de dados MySQL referenciada.</p>
 *
 * @author Henrique
 */
public class ConnectionFactory {

    /**
     *
     * < h1>Inicia a conexao com o banco MySQL</h1>
     *
     * <p>
     * Prepara uma conexão JDBC com o mysql, informa url, user e password para
     * que possa ser iniciada a conexão com DB "bdanuncios"</p>
     *
     * @return conexao Connection, retorna a conexão caso tenha conseguido
     * estabelecer a conexão, e null caso não tenha conseguido.
     *
     * @author Henrique
     */
    public static Connection conector() {

        java.sql.Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/bdanuncios";
        String user = "root";
        String password = "";

        try {
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println("Não foi possível conectar ao banco de dados");
            System.out.println(e);
            return null;
        }
    }

}
