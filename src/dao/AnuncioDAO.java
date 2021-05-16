/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static connection.ConnectionFactory.conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Anuncios;
import net.proteanit.sql.DbUtils;
import view.CadastroAnuncio;

/**
 * <h1>Classe reponsável pelo AnuncioDAO</h1>
 *
 * <p>
 * Executa os métodos de CRUD relacionados a classe {@link Anuncios} no banco de
 * dados</p>
 *
 * @author Henrique
 *
 * @see Anuncios
 */
public class AnuncioDAO {

    static Connection conexao = conector();
    static Anuncios anuncio = new Anuncios();
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    /**
     *
     * <h1>Inserir os dados no banco.</h1>
     *
     * <p>
     * Insere os dados do {@link Anuncios} no banco de dados</p>
     *
     * @param anuncio Anuncios, referente ao anuncio informado
     *
     * @author Henrique
     *
     * @see Anuncio
     */
    public static void inserirDados(Anuncios anuncio) {

        String sql = "insert into anuncios (nome, cliente, data_inicio, data_fim, investimento_dia, total_Investido, maxVisu, maxCliques, maxComp)"
                + " values ('" + anuncio.getNome() + "', '"
                + anuncio.getCliente() + "', '"
                + anuncio.getDataInicio().toString() + "', '"
                + anuncio.getDataFim().toString() + "', "
                + anuncio.getInvestimentoDia() + ", "
                + anuncio.getTotal_investido() + ", "
                + anuncio.getMaxVisu() + ", "
                + anuncio.getMaxCliques() + ", "
                + anuncio.getMaxComp() + ")";
        try {
            pst = conexao.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Anúncio cadastrado com sucesso", "Cadastro de anúncio", 1, null);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar anúncio", "Cadastro de anúncio", 0, null);
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * <h1>Pesquisar os dados no banco.</h1>
     *
     * <p>
     * Pesquisa todos os dados do {@link Anuncios} no banco de dados</p>
     *
     * @author Henrique
     *
     * @see Anuncios
     */
    public static ArrayList<ResultSet> procurarDados() {
        ArrayList<ResultSet> listaResultados = new ArrayList<ResultSet>();
        String sql = "select nome 'Nome', cliente 'Cliente', "
                + "data_inicio 'Data de início', data_fim 'Data de fim', "
                + "investimento_dia 'Investimepto p/ dia', total_Investido 'Investimento total', "
                + "maxVisu 'Máx visualizações', maxCliques 'Máx cliques', "
                + "maxComp 'Máx compartilhamentos' from anuncios";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            //Linha a abaixo deve ser comentada para o teste
            CadastroAnuncio.tblAnuncios.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                listaResultados.add(rs);
            }
            return listaResultados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     *
     * <h1>Pesquisar os {@link Anuncios} de um cliente</h1>
     *
     * <p>
     * Recebe um {@link Anuncios} e pesquisa todos os seus dados e apresenta na
     * tabela</p>
     *
     * @param anuncio Anuncios, referente ao anuncio informado
     *
     * @author Henrique
     *
     * @see Anuncios
     */
    public static ArrayList<ResultSet> pesquisarCliente(Anuncios anuncio) {
        ArrayList<ResultSet> listaResultados = new ArrayList<ResultSet>();
        String sql = "select nome 'Nome', cliente 'Cliente', "
                + "data_inicio 'Data de início', data_fim 'Data de fim', "
                + "investimento_dia 'Investimepto p/ dia', total_Investido 'Investimento total', "
                + "maxVisu 'Máx visualizações', maxCliques 'Máx cliques', "
                + "maxComp 'Máx compartilhamentos' from anuncios where cliente like '%" + anuncio.getCliente() + "%'";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            //Linha a abaixo deve ser comentada para o teste
            CadastroAnuncio.tblAnuncios.setModel(DbUtils.resultSetToTableModel(rs));

            while (rs.next()) {
                listaResultados.add(rs);
            }
            return listaResultados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     *
     * <h1>Pesquisar os {@link Anuncios} em um intervalo de datas.</h1>
     *
     * <p>
     * Pesquisa atraves de um {@link Anuncios} onde a data de fim estiver entre
     * a informada .</p>
     *
     * @param anuncio Anuncios, referente ao {@link Anuncios} informado.
     *
     * @return ArrayList<ResultSet>, referente aos resultados encontrados.
     *
     * @author Henrique.
     *
     * @see Anuncios
     */
    public static ArrayList<ResultSet> pesquisarIntervaloEntreDatas(Anuncios anuncio) {
        ArrayList<ResultSet> listaResultados = new ArrayList<ResultSet>();
        String sql = "select nome 'Nome', cliente 'Cliente', "
                + "data_inicio 'Data de início', data_fim 'Data de fim', "
                + "investimento_dia 'Investimepto p/ dia', total_Investido 'Investimento total', "
                + "maxVisu 'Máx visualizações', maxCliques 'Máx cliques', "
                + "maxComp 'Máx compartilhamentos' from anuncios where data_fim between '" + anuncio.getDataInicio()
                + "' and '" + anuncio.getDataFim() + "'";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            //Linha a abaixo deve ser comentada para o teste
            CadastroAnuncio.tblAnuncios.setModel(DbUtils.resultSetToTableModel(rs));

            while (rs.next()) {
                listaResultados.add(rs);
            }
            return listaResultados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     *
     * <h1>Método destinado ao uso de teste.</h1>
     *
     * <p>
     * Limpa todos os dados da tabela do banco.</p>
     *
     * @author Henrique.
     */
    public static void limparTabela() {
        String sql = "delete from anuncios";
        try {
            pst = conexao.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
