/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ajconfeccoes.sistemaGerenciadorVendas.apresentacao;

import br.com.ajconfeccoes.sistemaGerenciadorVendas.apresentacao.classesUtil.CursorUtil;
import br.com.ajconfeccoes.sistemaGerenciadorVendas.apresentacao.classesUtil.MensagemTela;
import br.com.ajconfeccoes.sistemaGerenciadorVendas.apresentacao.excessoes.ArgumentInvalidExeception;
import br.com.ajconfeccoes.sistemaGerenciadorVendas.entidade.CaixaDiario;
import br.com.ajconfeccoes.sistemaGerenciadorVendas.entidade.Produto;
import br.com.ajconfeccoes.sistemaGerenciadorVendas.negocio.CaixaDiarioBO;
import br.com.ajconfeccoes.sistemaGerenciadorVendas.negocio.ProdutoBO;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author arley
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private TelaCadCliente telaCadCliente = null;
    private TelaCadUsuario telaCadUsuario = null;
    private TelaConsultaUsuario telaConsultaUsuario = null;
    private TelaConsultaCliente telaConsultaCliente = null;
    private TelaCadProduto telaCadProduto = null;
    private TelaConsultaProduto telaConsultaProduto = null;
    private TelaConsultaContas telaConsultaContas = null;
    private TelaIniciarCaixa telaIniciarCaixa = null;
    private TelaExibirRelatorioDiario telaExibirRelatorioDiario = null;

    private TelaOperacoesVenda telaOperacoesVenda = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        Color suacor = new Color(60, 59, 55);
        initComponents();
        this.barraMenu.setBackground(suacor);
        this.abrirTelaOperacoesVenda();
    }

    void abrirTelaOperacoesVenda() {
        if (this.telaOperacoesVenda == null || this.telaOperacoesVenda.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaOperacoesVenda = new TelaOperacoesVenda();
                jdpAreaDeTrabalho.add(telaOperacoesVenda);
                telaOperacoesVenda.setMaximum(true);
                telaOperacoesVenda.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            telaOperacoesVenda.setVisible(true);
            telaOperacoesVenda.moveToFront();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void addComponenteTela(Tela tela) {
        jdpAreaDeTrabalho.add(tela);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenu();
        mnuNovoUsuario = new javax.swing.JMenuItem();
        mnuConsultarUsuario = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenu();
        mnuCadastrarCliente = new javax.swing.JMenuItem();
        mnuConsultarCliente = new javax.swing.JMenuItem();
        mnuEditar = new javax.swing.JMenu();
        mnuEstoque = new javax.swing.JMenu();
        mnuProduto = new javax.swing.JMenu();
        mnuNovoProduto = new javax.swing.JMenuItem();
        mnuAtualizarProduto = new javax.swing.JMenuItem();
        mnuConsultarProduto = new javax.swing.JMenuItem();
        mnuGerenciador = new javax.swing.JMenu();
        mnuCaixa = new javax.swing.JMenu();
        mnuInciarCaixa = new javax.swing.JMenuItem();
        mnuFinalizarCaixa = new javax.swing.JMenuItem();
        btnContas = new javax.swing.JMenuItem();
        mnuOperacaoVenda = new javax.swing.JMenuItem();
        mnuRelatorio = new javax.swing.JMenu();
        mnuRelatorioDiario = new javax.swing.JMenuItem();
        mnuRelatorioMensal = new javax.swing.JMenuItem();
        mnuRelatorioEstoqueAtual = new javax.swing.JMenuItem();
        mnuGrafico = new javax.swing.JMenu();
        mnuGraficoCaixaMensal = new javax.swing.JMenuItem();
        mnuGraficoVendasMensal = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Geren. Vendas");
        setExtendedState(6);

        barraMenu.setPreferredSize(new java.awt.Dimension(359, 35));

        mnuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/application_form_add.png"))); // NOI18N
        mnuCadastro.setText("Cadastro");
        mnuCadastro.setPreferredSize(new java.awt.Dimension(100, 20));

        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/group_add.png"))); // NOI18N
        mnuUsuario.setText("Usuário");
        mnuUsuario.setToolTipText("Cadastro de Usuário");

        mnuNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/add.png"))); // NOI18N
        mnuNovoUsuario.setText("Novo");
        mnuNovoUsuario.setToolTipText("");
        mnuNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNovoUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuNovoUsuario);

        mnuConsultarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/zoom.png"))); // NOI18N
        mnuConsultarUsuario.setText("Consultar");
        mnuConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuConsultarUsuario);

        mnuCadastro.add(mnuUsuario);

        mnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/drive_user.png"))); // NOI18N
        mnuCliente.setText("Cliente");

        mnuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/add.png"))); // NOI18N
        mnuCadastrarCliente.setText("Cadastrar Cliente");
        mnuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(mnuCadastrarCliente);

        mnuConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/zoom.png"))); // NOI18N
        mnuConsultarCliente.setText("Consultar");
        mnuConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(mnuConsultarCliente);

        mnuCadastro.add(mnuCliente);

        barraMenu.add(mnuCadastro);

        mnuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/application_edit.png"))); // NOI18N
        mnuEditar.setText("Editar");
        mnuEditar.setPreferredSize(new java.awt.Dimension(80, 20));
        barraMenu.add(mnuEditar);

        mnuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/database_lightning.png"))); // NOI18N
        mnuEstoque.setText("Estoque");
        mnuEstoque.setPreferredSize(new java.awt.Dimension(95, 20));

        mnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/package.png"))); // NOI18N
        mnuProduto.setText("Produto");

        mnuNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/database_add.png"))); // NOI18N
        mnuNovoProduto.setText("Novo");
        mnuNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNovoProdutoActionPerformed(evt);
            }
        });
        mnuProduto.add(mnuNovoProduto);

        mnuAtualizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/arrow_refresh.png"))); // NOI18N
        mnuAtualizarProduto.setText("Atualizar");
        mnuAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAtualizarProdutoActionPerformed(evt);
            }
        });
        mnuProduto.add(mnuAtualizarProduto);

        mnuConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/zoom.png"))); // NOI18N
        mnuConsultarProduto.setText("Consultar");
        mnuConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarProdutoActionPerformed(evt);
            }
        });
        mnuProduto.add(mnuConsultarProduto);

        mnuEstoque.add(mnuProduto);

        barraMenu.add(mnuEstoque);

        mnuGerenciador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/computer.png"))); // NOI18N
        mnuGerenciador.setText("Gerenciador");
        mnuGerenciador.setPreferredSize(new java.awt.Dimension(120, 20));

        mnuCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/coins.png"))); // NOI18N
        mnuCaixa.setText("Caixa");

        mnuInciarCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/monitor_go.png"))); // NOI18N
        mnuInciarCaixa.setText("Iniciar caixa");
        mnuInciarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInciarCaixaActionPerformed(evt);
            }
        });
        mnuCaixa.add(mnuInciarCaixa);

        mnuFinalizarCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/monitor_delete.png"))); // NOI18N
        mnuFinalizarCaixa.setText("Finalizar caixa");
        mnuCaixa.add(mnuFinalizarCaixa);

        mnuGerenciador.add(mnuCaixa);

        btnContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/contas16x16.png"))); // NOI18N
        btnContas.setText("Contas");
        btnContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasActionPerformed(evt);
            }
        });
        mnuGerenciador.add(btnContas);

        mnuOperacaoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/cart.png"))); // NOI18N
        mnuOperacaoVenda.setText("Operações Venda");
        mnuOperacaoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacaoVendaActionPerformed(evt);
            }
        });
        mnuGerenciador.add(mnuOperacaoVenda);

        barraMenu.add(mnuGerenciador);

        mnuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/page_white_acrobat.png"))); // NOI18N
        mnuRelatorio.setText("Relatórios");
        mnuRelatorio.setPreferredSize(new java.awt.Dimension(105, 10));

        mnuRelatorioDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/page_white_text.png"))); // NOI18N
        mnuRelatorioDiario.setText("Vendas Diário");
        mnuRelatorioDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioDiarioActionPerformed(evt);
            }
        });
        mnuRelatorio.add(mnuRelatorioDiario);

        mnuRelatorioMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/page_white_text.png"))); // NOI18N
        mnuRelatorioMensal.setText("Vendas Mensal");
        mnuRelatorioMensal.setAutoscrolls(true);
        mnuRelatorio.add(mnuRelatorioMensal);

        mnuRelatorioEstoqueAtual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/paste_plain.png"))); // NOI18N
        mnuRelatorioEstoqueAtual.setText("Estoque atual");
        mnuRelatorioEstoqueAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioEstoqueAtualActionPerformed(evt);
            }
        });
        mnuRelatorio.add(mnuRelatorioEstoqueAtual);

        barraMenu.add(mnuRelatorio);

        mnuGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/chart_bar.png"))); // NOI18N
        mnuGrafico.setText("Gráficos");
        mnuGrafico.setPreferredSize(new java.awt.Dimension(100, 10));

        mnuGraficoCaixaMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/chart_bar_add.png"))); // NOI18N
        mnuGraficoCaixaMensal.setText("Caixa Mensal");
        mnuGraficoCaixaMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraficoCaixaMensalActionPerformed(evt);
            }
        });
        mnuGrafico.add(mnuGraficoCaixaMensal);

        mnuGraficoVendasMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/chart_line_add.png"))); // NOI18N
        mnuGraficoVendasMensal.setText("Vendas Mensal");
        mnuGrafico.add(mnuGraficoVendasMensal);

        barraMenu.add(mnuGrafico);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/help.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");
        mnuAjuda.setAutoscrolls(true);
        mnuAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mnuAjuda.setPreferredSize(new java.awt.Dimension(80, 30));

        mnuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ajconfeccoes/sistemaGerenciadorVendas/apresentacao/imagens/information.png"))); // NOI18N
        mnuSobre.setText("Sobre");
        mnuAjuda.add(mnuSobre);

        barraMenu.add(mnuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(962, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarClienteActionPerformed
        // TODO add your handling code here:
        if (this.telaConsultaCliente == null || this.telaConsultaCliente.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaConsultaCliente = new TelaConsultaCliente(this);
                jdpAreaDeTrabalho.add(telaConsultaCliente);
                telaConsultaCliente.setMaximum(true);
                telaConsultaCliente.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaConsultaCliente.setVisible(true);
            telaConsultaCliente.moveToFront();
        }
    }//GEN-LAST:event_mnuConsultarClienteActionPerformed

    private void mnuAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAtualizarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAtualizarProdutoActionPerformed

    private void mnuGraficoCaixaMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraficoCaixaMensalActionPerformed
        // TODO add your handling code here:
        List<CaixaDiario> caixas = null;
        try{
            CaixaDiarioBO caixaDiarioBO = new CaixaDiarioBO();
            caixas = caixaDiarioBO.buscarCaixasByMes();
            this.gerarGraficoDeCaixaMensal(caixas);
        } catch (ArgumentInvalidExeception aie) {
            JOptionPane.showMessageDialog(this, aie.getMessage(), "Consultar caixas", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro desconhecido. Contate com adminstrador", "Consultar caixas", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_mnuGraficoCaixaMensalActionPerformed

    private void gerarGraficoDeCaixaMensal(List<CaixaDiario> caixas){
        try{
            this.setCursor(CursorUtil.getCursor(3));  
            String arquivoRelatorio = System.getProperty("user.dir")
                   + "/relatorios/GraficoCaixaMensal.jasper";
            
            Map<String, Object> paramentros = new HashMap<String, Object>();
            
            JRBeanCollectionDataSource fonteDados 
                      = new JRBeanCollectionDataSource(caixas);
            
            JasperPrint relatorioGerado = JasperFillManager.fillReport(arquivoRelatorio, paramentros, fonteDados);
            
            JasperViewer telaExibicaoRelatorio 
                       = new JasperViewer(relatorioGerado, false);
            telaExibicaoRelatorio.setTitle("Gráfico de caixa mensal");
            telaExibicaoRelatorio.setVisible(true);
        } catch(JRException ex){            
            JOptionPane.showMessageDialog(this, "Erro ao exibir gráfico.", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally{
            this.setCursor(CursorUtil.getCursor(0));
        }
    }
    private void mnuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarClienteActionPerformed
        if (this.telaCadCliente == null || this.telaCadCliente.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaCadCliente = new TelaCadCliente();
                jdpAreaDeTrabalho.add(telaCadCliente);
                telaCadCliente.setMaximum(true);
                telaCadCliente.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            telaCadCliente.setVisible(true);
            telaCadCliente.moveToFront();
        }
    }//GEN-LAST:event_mnuCadastrarClienteActionPerformed

    private void mnuNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNovoUsuarioActionPerformed
        // TODO add your handling code here:
        if (this.telaCadUsuario == null || this.telaCadUsuario.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaCadUsuario = new TelaCadUsuario(this);
                jdpAreaDeTrabalho.add(telaCadUsuario);
                telaCadUsuario.setMaximum(true);
                telaCadUsuario.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaCadUsuario.setVisible(true);
            telaCadUsuario.moveToFront();
        }
    }//GEN-LAST:event_mnuNovoUsuarioActionPerformed

    private void mnuConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarUsuarioActionPerformed
        // TODO add your handling code here:
        if (this.telaConsultaUsuario == null || this.telaConsultaUsuario.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaConsultaUsuario = new TelaConsultaUsuario(this);
                jdpAreaDeTrabalho.add(telaConsultaUsuario);
                telaConsultaUsuario.setMaximum(true);
                telaConsultaUsuario.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaConsultaUsuario.setVisible(true);
            telaConsultaUsuario.moveToFront();
        }
    }//GEN-LAST:event_mnuConsultarUsuarioActionPerformed

    private void mnuNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNovoProdutoActionPerformed
        // TODO add your handling code here:
        if (this.telaCadProduto == null || this.telaCadProduto.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaCadProduto = new TelaCadProduto();
                jdpAreaDeTrabalho.add(telaCadProduto);
                telaCadProduto.setMaximum(true);
                telaCadProduto.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaCadProduto.setVisible(true);
            telaCadProduto.moveToFront();
        }
    }//GEN-LAST:event_mnuNovoProdutoActionPerformed

    private void mnuConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarProdutoActionPerformed
        // TODO add your handling code here:

        if (this.telaConsultaProduto == null || this.telaConsultaProduto.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaConsultaProduto = new TelaConsultaProduto(this);
                jdpAreaDeTrabalho.add(telaConsultaProduto);
                telaConsultaProduto.setMaximum(true);
                telaConsultaProduto.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaConsultaProduto.setVisible(true);
            telaConsultaProduto.moveToFront();
        }
    }//GEN-LAST:event_mnuConsultarProdutoActionPerformed

    private void btnContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasActionPerformed
        // TODO add your handling code here:
        if (this.telaConsultaContas == null || this.telaConsultaContas.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaConsultaContas = new TelaConsultaContas(this);
                jdpAreaDeTrabalho.add(telaConsultaContas);
                telaConsultaContas.setMaximum(true);
                telaConsultaContas.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaConsultaContas.setVisible(true);
            telaConsultaContas.moveToFront();
        }
    }//GEN-LAST:event_btnContasActionPerformed

    private void mnuInciarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInciarCaixaActionPerformed
        // TODO add your handling code here:
        if (this.telaIniciarCaixa == null || this.telaIniciarCaixa.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaIniciarCaixa = new TelaIniciarCaixa();
                jdpAreaDeTrabalho.add(telaIniciarCaixa);
                telaIniciarCaixa.setMaximum(true);
                telaIniciarCaixa.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaIniciarCaixa.setVisible(true);
            telaIniciarCaixa.moveToFront();
        }
    }//GEN-LAST:event_mnuInciarCaixaActionPerformed

    private void mnuRelatorioDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioDiarioActionPerformed
        // TODO add your handling code here:
        if (this.telaExibirRelatorioDiario == null || this.telaExibirRelatorioDiario.isClosed()) {
            try {
                // TODO add your handling code her
                this.telaExibirRelatorioDiario = new TelaExibirRelatorioDiario();
                jdpAreaDeTrabalho.add(telaExibirRelatorioDiario);
                telaExibirRelatorioDiario.setMaximum(true);
                telaExibirRelatorioDiario.setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            telaExibirRelatorioDiario.setVisible(true);
            telaExibirRelatorioDiario.moveToFront();
        }
    }//GEN-LAST:event_mnuRelatorioDiarioActionPerformed

    private void mnuOperacaoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacaoVendaActionPerformed
        // TODO add your handling code here:
        abrirTelaOperacoesVenda();
    }//GEN-LAST:event_mnuOperacaoVendaActionPerformed

    private void mnuRelatorioEstoqueAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioEstoqueAtualActionPerformed
        // TODO add your handling code here:
        List<Produto> produtos = null;
        try {
            this.setCursor(CursorUtil.getCursor(3));
            ProdutoBO produtoBO = new ProdutoBO();
            produtos = produtoBO.buscarTodos();
            this.gerarPdfEstoque(produtos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro desconhecido. Contate com adminstrador", "Consultar produtos", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.setCursor(CursorUtil.getCursor(0));
        }
    }//GEN-LAST:event_mnuRelatorioEstoqueAtualActionPerformed

    public void gerarPdfEstoque(List<Produto> produtos){
         try{
            this.setCursor(CursorUtil.getCursor(3));  
            String arquivoRelatorio = System.getProperty("user.dir")
                   + "/relatorios/RelatorioEstoque.jasper";
            
            Map<String, Object> paramentros = new HashMap<String, Object>();
            
            JRBeanCollectionDataSource fonteDados 
                      = new JRBeanCollectionDataSource(produtos);
            
            JasperPrint relatorioGerado = JasperFillManager.fillReport(arquivoRelatorio, paramentros, fonteDados);
            
            JasperViewer telaExibicaoRelatorio 
                       = new JasperViewer(relatorioGerado, false);
            telaExibicaoRelatorio.setTitle("Relatório de Estoque");
            telaExibicaoRelatorio.setVisible(true);
        } catch(JRException ex){            
            JOptionPane.showMessageDialog(this, "Erro ao exibir relatório.", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally{
            this.setCursor(CursorUtil.getCursor(0));
        }
    }
/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem btnContas;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAtualizarProduto;
    private javax.swing.JMenuItem mnuCadastrarCliente;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenu mnuCaixa;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenuItem mnuConsultarCliente;
    private javax.swing.JMenuItem mnuConsultarProduto;
    private javax.swing.JMenuItem mnuConsultarUsuario;
    private javax.swing.JMenu mnuEditar;
    private javax.swing.JMenu mnuEstoque;
    private javax.swing.JMenuItem mnuFinalizarCaixa;
    private javax.swing.JMenu mnuGerenciador;
    private javax.swing.JMenu mnuGrafico;
    private javax.swing.JMenuItem mnuGraficoCaixaMensal;
    private javax.swing.JMenuItem mnuGraficoVendasMensal;
    private javax.swing.JMenuItem mnuInciarCaixa;
    private javax.swing.JMenuItem mnuNovoProduto;
    private javax.swing.JMenuItem mnuNovoUsuario;
    private javax.swing.JMenuItem mnuOperacaoVenda;
    private javax.swing.JMenu mnuProduto;
    private javax.swing.JMenu mnuRelatorio;
    private javax.swing.JMenuItem mnuRelatorioDiario;
    private javax.swing.JMenuItem mnuRelatorioEstoqueAtual;
    private javax.swing.JMenuItem mnuRelatorioMensal;
    private javax.swing.JMenuItem mnuSobre;
    private javax.swing.JMenu mnuUsuario;
    // End of variables declaration//GEN-END:variables
}