package model;

import java.time.LocalDate;

/**
 *
 * < h1>Anuncio para ser cadastrado</h1>
 *
 * <p>
 * Parâmetros dos anuncios para serem cadastrados no banco</p>
 *
 *
 */
public class Anuncios {

    private String nome;
    private String cliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalDate dataBusca;

  
    private Double investimentoDia;
    private Double total_investido;
    private Double maxVisu;
    private Double maxCliques;
    private Double maxComp;

    
      public LocalDate getDataBusca() {
        return dataBusca;
    }

    public void setDataBusca(LocalDate dataBusca) {
        this.dataBusca = dataBusca;
    }
    
    
    /**
     * <h1>Retorna o máximo de visualizações do anúncio da classe
     * {@link Anuncios}</h1>
     *
     * @return maxVisu, referente ao máximo de visualizações.
     *
     * @see {@link Anuncios}
     */
    public Double getMaxVisu() {
        return maxVisu;
    }

    /**
     *
     * <h1>Salva o máximo de visualizações do anúncio da classe
     * {@link Anuncios}</h1>
     *
     * @param maxVisu Double, referente ao máximo de visualizações .
     *
     * @see Anuncio
     */
    public void setMaxVisu(Double maxVisu) {
        this.maxVisu = maxVisu;
    }

    /**
     * <h1>Retorna o máximo de cliques do anúncio da classe
     * {@link Anuncios}</h1>
     *
     * @return maxCliques, referente ao máximo de cliques.
     *
     * @see {@link Anuncios}
     */
    public Double getMaxCliques() {
        return maxCliques;
    }

    /**
     *
     * <h1>Salva o máximo de cliques do anúncio da classe {@link Anuncios}</h1>
     *
     * @param maxCliques Double, referente ao máximo de cliques .
     *
     * @see Anuncio
     */
    public void setMaxCliques(Double maxCliques) {
        this.maxCliques = maxCliques;
    }

    /**
     * <h1>Retorna o máximo de compartilhamentos do anúncio da classe
     * {@link Anuncios}</h1>
     *
     * @return maxComp, referente ao máximo de compartilhamentos.
     *
     * @see {@link Anuncios}
     */
    public Double getMaxComp() {
        return maxComp;
    }

    /**
     *
     * <h1>Salva o máximo de compartilhamentos do anúncio da classe
     * {@link Anuncios}</h1>
     *
     * @param maxComp Double, referente ao máximo de compartilhamentos .
     *
     * @see Anuncio
     */
    public void setMaxComp(Double maxComp) {
        this.maxComp = maxComp;
    }

    /**
     * <h1>Retorna o total investido do anúncio da classe {@link Anuncios}</h1>
     *
     * @return total_investido, referente ao total investido.
     *
     * @see {@link Anuncios}
     */
    public Double getTotal_investido() {
        return total_investido;
    }

    /**
     *
     * <h1>Salva ototal investido do anúncio da classe {@link Anuncios}</h1>
     *
     * @param total_investido Double, referente ao total investido.
     *
     * @see Anuncio
     */
    public void setTotal_investido(Double total_investido) {
        this.total_investido = total_investido;
    }

    /**
     * <h1>Retorna o nome da classe {@link Anuncios}</h1>
     *
     * @return nome, referente ao nome.
     *
     * @see {@link Anuncios}
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * <h1>Salva o nome do anúncio da classe {@link Anuncios}</h1>
     *
     * @param nome String, referente ao nome informado.
     *
     * @see Anuncio
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * <h1>Retorna o cliente do anúncio da classe {@link Anuncios}</h1>
     *
     * @return cliente, referente ao cliente.
     *
     * @see {@link Anuncios}
     */
    public String getCliente() {
        return cliente;
    }

    /**
     *
     * <h1>Salva o cliente do anúncio da classe {@link Anuncios}</h1>
     *
     * @param cliente String, referente ao cliente informado.
     *
     * @see Anuncios
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * <h1>Retorna a data de inicio do anúncio da classe {@link Anuncios}</h1>
     *
     *
     * @see {@link Anuncios}
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     *
     * <h1>Salva a data de inico do anúncio da classe {@link Anuncios}</h1>
     *
     * @param dataInicio LocalDate, referente a data informada.
     *
     * @see Anuncios
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * <h1>Retorna a data de fim do anúncio da classe {@link Anuncios}</h1>
     *
     * @return dataFim, referente a data de fim.
     *
     * @see {@link Anuncios}
     */
    public LocalDate getDataFim() {
        return dataFim;
    }

    /**
     *
     * <h1>Salva a data de fim do anúncio da classe {@link Anuncios}</h1>
     *
     * @param dataFim LocalDate, referente a data informada.
     *
     * @see Anuncios
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * <h1>Retorna o investimento do anúncio da classe {@link Anuncios}</h1>
     *
     * @return investimentoDia, referente ao investimento do dia.
     *
     * @see {@link Anuncios}
     */
    public Double getInvestimentoDia() {
        return investimentoDia;
    }

    /**
     *
     * <h1>Salva o investimento do anúncio da classe {@link Anuncios}</h1>
     *
     * @param investimentoDia Double, referente ao valor informado.
     *
     * @see Anuncios
     */
    public void setInvestimentoDia(Double investimentoDia) {
        this.investimentoDia = investimentoDia;
    }
}
