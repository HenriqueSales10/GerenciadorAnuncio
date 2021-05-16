package view;

import connection.ConnectionFactory;
import model.Anuncios;
import dao.AnuncioDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

public class CadastroAnuncio extends javax.swing.JFrame {

    static Integer diaInicio, mesInicio, anoInicio, diaFim, mesFim, anoFim;

    static Anuncios anuncio = new Anuncios();
    Connection conexao;

    public CadastroAnuncio() {
        initComponents();
        conexao = ConnectionFactory.conector();

        //Esilização da tabela
        setBackground(new Color(255, 255, 255));
        tblAnuncios.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tblAnuncios.getTableHeader().setOpaque(false);
        tblAnuncios.getTableHeader().setBackground(new Color(0, 0, 0));
        tblAnuncios.getTableHeader().setForeground(new Color(255, 255, 255));

        AnuncioDAO.procurarDados();

        //Conexão com a classe e validar entrada do investimento
        txtInvestimentoDia.setDocument(new ValidarEntrada());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCadastroAnuncio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnuncios = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFim = new javax.swing.JFormattedTextField();
        txtInvestimentoDia = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblMensagemErro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarIntervalo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Anúncio");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCadastroAnuncio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCadastroAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroAnuncio.setText("Cadastro de Anúncios");

        tblAnuncios.setFont(new java.awt.Font("Tahoma", 0, 18));
        tblAnuncios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAnuncios.setGridColor(new java.awt.Color(255, 255, 255));
        tblAnuncios.setOpaque(false);
        tblAnuncios.setRowHeight(25);
        tblAnuncios.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblAnuncios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAnuncios);

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDataInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDataFim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtInvestimentoDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtInvestimentoDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setFocusable(false);
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblMensagemErro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMensagemErro.setForeground(new java.awt.Color(255, 0, 51));
        lblMensagemErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome *");

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCliente.setText("Cliente *");

        lblInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInicio.setText("Data de início *");

        lblFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFim.setText("Data de fim *");

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor.setText("Valor por dia *");

        btnBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N
        btnBuscarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBuscarCliente.setFocusPainted(false);
        btnBuscarCliente.setFocusable(false);
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseExited(evt);
            }
        });
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnBuscarIntervalo.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarIntervalo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBuscarIntervalo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIntervalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N
        btnBuscarIntervalo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBuscarIntervalo.setFocusPainted(false);
        btnBuscarIntervalo.setFocusable(false);
        btnBuscarIntervalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarIntervaloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarIntervaloMouseExited(evt);
            }
        });
        btnBuscarIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIntervaloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(lblCadastroAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(234, 234, 234))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(348, 348, 348)
                        .addComponent(lblCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblInicio)
                                .addGap(37, 37, 37)
                                .addComponent(lblFim))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblValor))
                            .addComponent(txtInvestimentoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblMensagemErro, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(477, 477, 477))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblCadastroAnuncio)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCliente))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValor)
                        .addGap(9, 9, 9)
                        .addComponent(txtInvestimentoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFim)
                            .addComponent(lblInicio))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99)
                .addComponent(lblMensagemErro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//-------------------------------Btn cadastrar----------------------------------
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Boolean verificaData = false;

        if (txtNome.getText().isEmpty()) {
            lblNome.setText("Nome *");
            lblNome.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Digite o nome");
            lblMensagemErro.setText("Campos não informados corretamente. Digite novamente !");
        } else {
            lblNome.setText("Nome *");
            lblNome.setForeground(Color.black);
            anuncio.setNome(txtNome.getText());
            lblMensagemErro.setText("");
        }

        if (txtCliente.getText().isEmpty()) {
            lblCliente.setText("Cliente *");
            lblCliente.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Digite o cliente");
            lblMensagemErro.setText("Campos não informados corretamente. Digite novamente !");
        } else {
            lblCliente.setText("Cliente *");
            lblCliente.setForeground(Color.black);
            anuncio.setCliente(txtCliente.getText());
            lblMensagemErro.setText("");
        }
        
        if (txtInvestimentoDia.getText().trim().isEmpty()) {
            lblValor.setText("Valor por dia *");
            lblValor.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Digite o investimento");
            lblMensagemErro.setText("Campos não informados corretamente. Digite novamente !");
        } else {
            try {
                double investimentoDia = Double.parseDouble(txtInvestimentoDia.getText());
                anuncio.setInvestimentoDia(investimentoDia);
                lblValor.setText("Valor por dia *");
                lblValor.setForeground(Color.black);
                lblMensagemErro.setText("");

                //Total investido, Cálculos quantidade máxima de visualizações, quantidade máxima de cliques; quantidade máxima de compartilhamentos
                Double numPessoas = 0.0; //Número de pessoas que visualizaram o anúncio

                final Double valorPessoa = 0.03 * 1000;//Percentual de pessoas que visualizam o anuncio por valor investido
                //(30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.)

                //Converter dias do inicio em segundos
                double segDiasInicio = diaInicio * 86400;
                double segMesesInicio = mesInicio * 2629743;
                double segAnoInicio = anoInicio * 31556926;
                double totalSegDataInicio = (segDiasInicio + segMesesInicio) + segAnoInicio;

                //Converter dias do fim em segundos
                double segDiasFim = diaFim * 86400;
                double segMesesFim = mesFim * 2629743;
                double segAnoFim = anoFim * 31556926;
                double totalSegDataFim = (segDiasFim + segMesesFim) + segAnoFim;

                //Cálculo do total de dias
                double qtdDias = (totalSegDataFim - totalSegDataInicio) / 86400;

                //Valor do investimento total
                double totValor = investimentoDia * qtdDias;
                anuncio.setTotal_investido(totValor);

                numPessoas = totValor * valorPessoa; // Número máximo de pessoas que visualizaram conforme o valor investido
                //System.out.println(Math.round(numPessoas));

                Double numCliques = 0.12 * numPessoas; //Cálculo de número de cliques coonforme o número de pessoas que visualizaram (a cada 100 pessoas que visualizam o anúncio 12 clicam nele.)
                anuncio.setMaxCliques(numCliques);
                //System.out.println(Math.round(numCliques));

                Double numComp = (0.15 * numCliques) * 4; //Cálculo do número de compartilhamentos com base no número de cliques (a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.)
                //(o mesmo anúncio é compartilhado no máximo 4 vezes em sequência)
                anuncio.setMaxComp(numComp);

                //System.out.println(Math.round(numComp));
                Double novasVisu = numComp * 40; //Cálculo de novas visualizações conforme o número de compartilhamentos
                //System.out.println(Math.round(novasVisu));

                Double totalVisu = numPessoas + novasVisu; // Cálculo total de visualizações (considerando o anúncio original + os compartilhamentos)
                //System.out.println(Math.round(totalVisu));
                anuncio.setMaxVisu(totalVisu);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Informações inválidas, digite novamente.");
                lblMensagemErro.setText("Campos não informados corretamente. Digite novamente !");
            }
        }

        if (validarData(txtDataInicio.getText(), txtDataFim.getText()) == true) {
            verificaData = true;
        }else{
            JOptionPane.showMessageDialog(null, "Digite as datas corretamente");
        }

        

        if (txtNome.getText().isEmpty() || txtCliente.getText().isEmpty() || verificaData == false || txtInvestimentoDia.getText().isEmpty()) {
        } else {
            AnuncioDAO.inserirDados(anuncio);
            AnuncioDAO.procurarDados();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setBackground(Color.black);
        btnCadastrar.setForeground(Color.white);
        btnCadastrar.setFont(new java.awt.Font("Calibri", 0, 19));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(Color.white);
        btnCadastrar.setFont(new java.awt.Font("Calibri", 0, 18));
        btnCadastrar.setForeground(Color.black);
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    //-------------------------------Btn buscar por cliente----------------------------------
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        if (txtCliente.getText().trim().isEmpty()) {
            lblCliente.setText("Cliente *");
            lblCliente.setForeground(Color.red);
        } else {
            anuncio.setCliente(txtCliente.getText());
            AnuncioDAO.pesquisarCliente(anuncio);
            lblCliente.setText("Cliente *");
            lblCliente.setForeground(Color.black);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    /**
     *
     * <h1>Validar data informada.</h1>
     *
     * <p>
     * Valida a data de início e a data de fim informada {@link Anuncios} </p>
     *
     * @author Henrique
     *
     * @see Anuncios
     */
    public static boolean validarData(String dataInicio, String dataFim) {
        dataInicio = dataInicio.replace("/", "");
        dataInicio = dataInicio.replace(" ", "");
        dataInicio = dataInicio.trim();
        boolean verifica = false;

        dataFim = dataFim.replace("/", "");
        dataFim = dataFim.replace(" ", "");
        dataFim = dataFim.trim();

        Integer dataCompletaInicio = Integer.parseInt(dataInicio);
        Integer dataCompletaFim = Integer.parseInt(dataFim);

        diaInicio = Integer.parseInt(dataInicio.substring(0, 2));
        mesInicio = Integer.parseInt(dataInicio.substring(2, 4));
        anoInicio = Integer.parseInt(dataInicio.substring(4, 8));

        diaFim = Integer.parseInt(dataFim.substring(0, 2));
        mesFim = Integer.parseInt(dataFim.substring(2, 4));
        anoFim = Integer.parseInt(dataFim.substring(4, 8));
      

        //Se  a data de inicio for menor que a data de fim
        if (dataCompletaInicio < dataCompletaFim) {

                 //-------------------------------Validação da data de início----------------------------------
            
            //Se  a data de incicio for maior ou igual a 2021 e menor ou igual a 2050 
            if (anoInicio >= 2021 && anoInicio <= 2050) {

                //Se o mes informado for maior ou igual a  1 e menor ou igual a 12
                if (mesInicio >= 1 && mesInicio <= 12) {

                    //Para meses com 31 dias
                    if (mesInicio == 1 || mesInicio == 3 || mesInicio == 5 || mesInicio == 7 || mesInicio == 8 || mesInicio == 10 || mesInicio == 12) {
                        if (diaInicio >= 1 && diaInicio <= 31) {
                            anuncio.setDataInicio(LocalDate.of(anoInicio, mesInicio, diaInicio));
                            verifica = true;

                        } else {
                            JOptionPane.showMessageDialog(null, "Dia inválido.");
                            verifica = false;
                        }
                    } //Para meses com 30 dias
                    else if (mesInicio == 4 || mesInicio == 6 || mesInicio == 9 || mesInicio == 11) {
                        if (diaInicio >= 1 && diaInicio <= 30) {
                            anuncio.setDataInicio(LocalDate.of(anoInicio, mesInicio, diaInicio));
                            verifica = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Dia inválido.");
                            verifica = false;
                        }
                    } //Para fevereiro
                    else if (mesInicio == 2) {
                        if (diaInicio >= 1 && diaInicio <= 28) {
                            anuncio.setDataInicio(LocalDate.of(anoInicio, mesInicio, diaInicio));
                            verifica = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Dia inválido.");
                            verifica = false;
                        }
                    }

                    //Caso o mês informado seja menor que  1 ou  maior que 12
                } else {
                    JOptionPane.showMessageDialog(null, "Mês inválido.");
                    verifica = false;
                }

            } //Caso o ano informado for menor que 2021 ou maior que 2050
            else {
                verifica = false;
                JOptionPane.showMessageDialog(null, "Ano inválido.");
            }

                //-------------------------------Validação da data de fim----------------------------------
            
            //Se  a data de fim for maior ou igual a 2021 e menor ou igual a 2050 
            if (anoFim >= 2021 && anoFim <= 2050) {
                
                //Se o mes informado for maior ou igual a  1 e menor ou igual a 12
                if (mesFim >= 1 && mesFim <= 12) {
                    
                    //Para meses com 31 dias
                    if (mesFim == 1 || mesFim == 3 || mesFim == 5 || mesFim == 7 || mesFim == 8 || mesFim == 10 || mesFim == 12) {
                        if (diaFim >= 1 && diaFim <= 31) {
                            anuncio.setDataFim(LocalDate.of(anoFim, mesFim, diaFim));
                            verifica = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Dia inválido.");
                            verifica = false;
                        }
                    } else if (mesFim == 4 || mesFim == 6 || mesFim == 9 || mesFim == 11) {
                        if (diaFim >= 1 && diaFim <= 30) {
                            anuncio.setDataFim(LocalDate.of(anoFim, mesFim, diaFim));
                            verifica = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Dia inválido.");
                            verifica = false;
                        }
                    } else if (mesFim == 2) {
                        if (diaFim >= 1 && diaFim <= 28) {
                            anuncio.setDataFim(LocalDate.of(anoFim, mesFim, diaFim));
                            verifica = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Dia inválido.");
                            verifica = false;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mês inválido.");
                    verifica = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ano inválido.");
                verifica = false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "A data de fim não pode ser menor que a de início.");
            verifica = false;
        }
        return verifica;
    }


    private void btnBuscarIntervaloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIntervaloMouseEntered

    }//GEN-LAST:event_btnBuscarIntervaloMouseEntered

    private void btnBuscarIntervaloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarIntervaloMouseExited

    }//GEN-LAST:event_btnBuscarIntervaloMouseExited

    //-------------------------------Btn buscar por intervalo de tempo ----------------------------------
    private void btnBuscarIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIntervaloActionPerformed
        
        if (validarData(txtDataInicio.getText(), txtDataFim.getText())) {
            AnuncioDAO.pesquisarIntervaloEntreDatas(anuncio);
        }

    }//GEN-LAST:event_btnBuscarIntervaloActionPerformed
    //--------------------------------------------------------------------------

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroAnuncio().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarIntervalo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastroAnuncio;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMensagemErro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValor;
    public static javax.swing.JTable tblAnuncios;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtInvestimentoDia;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
