
import dao.AnuncioDAO;
import java.time.LocalDate;
import static org.junit.Assert.*;
import model.Anuncios;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author henri
 */
public class AnunciosDAOTeste {

    /**
     * Para que o teste ocorra corretamente, deve-se comentar a linha onde
     * insere o dado na JTable na classe AnuncioDAO.buscarDados.
     */
    @Test
    public void testeInserirDados() {
        Anuncios anuncio = new Anuncios();
        AnuncioDAO.limparTabela();

        anuncio.setNome("Lucas");
        anuncio.setCliente("Henrique");
        anuncio.setDataInicio(LocalDate.of(2021, 05, 14));
        anuncio.setDataFim(LocalDate.of(2021, 05, 15));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.33);
        anuncio.setMaxComp(1.0);
        anuncio.setMaxVisu(30.0);
        anuncio.setTotal_investido(1.0);

        AnuncioDAO.inserirDados(anuncio);

        assertEquals(1, AnuncioDAO.procurarDados().size());
    }

    /**
     * Para que o teste ocorra corretamente, deve-se comentar a linha onde
     * insere o dado na JTable na classe AnuncioDAO.buscarDados.
     */
    @Test
    public void testeProcurarDados() {
        Anuncios anuncio = new Anuncios();
        Anuncios anuncio2 = new Anuncios();
        AnuncioDAO.limparTabela();

        anuncio.setNome("Lucas");
        anuncio.setCliente("Henrique");
        anuncio.setDataInicio(LocalDate.of(2021, 05, 14));
        anuncio.setDataFim(LocalDate.of(2021, 05, 15));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.33);
        anuncio.setMaxComp(1.0);
        anuncio.setMaxVisu(30.0);
        anuncio.setTotal_investido(1.0);

        anuncio2.setNome("Pedro");
        anuncio2.setCliente("Carlos");
        anuncio2.setDataInicio(LocalDate.of(2021, 05, 19));
        anuncio2.setDataFim(LocalDate.of(2021, 05, 21));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.66);
        anuncio.setMaxComp(10.0);
        anuncio.setMaxVisu(60.0);
        anuncio.setTotal_investido(2.0);

        AnuncioDAO.inserirDados(anuncio);
        AnuncioDAO.inserirDados(anuncio2);

        assertEquals(2, AnuncioDAO.procurarDados().size());
    }

    /**
     * Para que o teste ocorra corretamente, deve-se comentar a linha onde
     * insere o dado na JTable na classe AnuncioDAO.pesquisarCliente.
     */
    @Test
    public void testePesquisarCliente() {
        Anuncios anuncio = new Anuncios();
        Anuncios anuncio2 = new Anuncios();
        AnuncioDAO.limparTabela();

        anuncio.setNome("Lucas");
        anuncio.setCliente("Henrique");
        anuncio.setDataInicio(LocalDate.of(2021, 05, 14));
        anuncio.setDataFim(LocalDate.of(2021, 05, 15));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.33);
        anuncio.setMaxComp(1.0);
        anuncio.setMaxVisu(30.0);
        anuncio.setTotal_investido(1.0);

        anuncio2.setNome("Pedro");
        anuncio2.setCliente("Carlos");
        anuncio2.setDataInicio(LocalDate.of(2021, 05, 19));
        anuncio2.setDataFim(LocalDate.of(2021, 05, 21));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.66);
        anuncio.setMaxComp(10.0);
        anuncio.setMaxVisu(60.0);
        anuncio.setTotal_investido(2.0);

        assertEquals(2, AnuncioDAO.pesquisarCliente(anuncio2).size());
    }

    /**
     * Para que o teste ocorra corretamente, deve-se comentar a linha onde
     * insere o dado na JTable na classe
     * AnuncioDAO.pesquisarIntervaloEntreDatas.
     */
    @Test
    public void testePesquisarInteravaloEntreDatas() {
        Anuncios anuncio = new Anuncios();
        Anuncios anuncio2 = new Anuncios();
        AnuncioDAO.limparTabela();

        anuncio.setNome("Lucas");
        anuncio.setCliente("Henrique");
        anuncio.setDataInicio(LocalDate.of(2021, 05, 14));
        anuncio.setDataFim(LocalDate.of(2021, 05, 15));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.33);
        anuncio.setMaxComp(1.0);
        anuncio.setMaxVisu(30.0);
        anuncio.setTotal_investido(1.0);

        anuncio2.setNome("Pedro");
        anuncio2.setCliente("Carlos");
        anuncio2.setDataInicio(LocalDate.of(2021, 05, 19));
        anuncio2.setDataFim(LocalDate.of(2021, 05, 21));
        anuncio.setInvestimentoDia(1.0);
        anuncio.setMaxCliques(0.66);
        anuncio.setMaxComp(10.0);
        anuncio.setMaxVisu(60.0);
        anuncio.setTotal_investido(2.0);

        AnuncioDAO.inserirDados(anuncio);
        AnuncioDAO.inserirDados(anuncio2);

        assertEquals(2, AnuncioDAO.pesquisarCliente(anuncio2).size());
    }
}
