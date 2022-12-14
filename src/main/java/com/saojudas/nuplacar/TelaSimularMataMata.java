package com.saojudas.nuplacar;;

import com.saojudas.nuplacar.DAO.PartidaDAO;
import com.saojudas.nuplacar.DAO.GrupoDAO;
import java.util.ArrayList;
import java.util.Collections;
import com.saojudas.nuplacar.CRUDTime.Time;
import com.saojudas.nuplacar.DAO.CampeonatoDAO;
import com.saojudas.nuplacar.DAO.PartidaDAO;
import com.saojudas.nuplacar.DAO.GrupoDAO;
import java.util.ArrayList;
import java.util.Collections;
import com.saojudas.nuplacar.CRUDTime.Time;

public class TelaSimularMataMata extends javax.swing.JFrame {
    
    public Campeonato campeonato;
    public Campeonato campeonatoFaseGrupo;
    
    public TelaSimularMataMata(Campeonato campeonato) {
        super("Simulação Mata-mata");
        
        initComponents();
        setLocationRelativeTo(null);
        
        this.campeonato = campeonato;
        try {
            campeonatoFaseGrupo = (Campeonato) campeonato.clone();
        }
        catch (Exception e){
        }
        setJogosIniciais();
        simularFaseMataMata();
        getCampeao();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        FaseGruposLabel = new javax.swing.JLabel();
        refazerSimulacaoButton = new javax.swing.JButton();
        avancarButton = new javax.swing.JButton();
        SimularButton = new javax.swing.JButton();
        Time2Jogo1Label = new javax.swing.JLabel();
        Time1Jogo1GolsLabel = new javax.swing.JLabel();
        Time1Jogo1Label = new javax.swing.JLabel();
        Time1Jogo16Label = new javax.swing.JLabel();
        Time1Jogo9Label = new javax.swing.JLabel();
        Time1Jogo2GolsLabel = new javax.swing.JLabel();
        Time2Jogo9Label = new javax.swing.JLabel();
        Time2Jogo3Label = new javax.swing.JLabel();
        Time1Jogo2Label = new javax.swing.JLabel();
        Time2Jogo2Label = new javax.swing.JLabel();
        Time1Jogo3Label = new javax.swing.JLabel();
        Time2Jogo4Label = new javax.swing.JLabel();
        Time2Jogo10Label = new javax.swing.JLabel();
        Time1Jogo4Label = new javax.swing.JLabel();
        Time1Jogo10Label = new javax.swing.JLabel();
        Time2Jogo1GolsLabel = new javax.swing.JLabel();
        Time2Jogo3GolsLabel = new javax.swing.JLabel();
        Time2Jogo2GolsLabel = new javax.swing.JLabel();
        Time1Jogo3GolsLabel = new javax.swing.JLabel();
        Time2Jogo4GolsLabel = new javax.swing.JLabel();
        Time1Jogo4GolsLabel = new javax.swing.JLabel();
        Time2Jogo9GolsLabel = new javax.swing.JLabel();
        Time1Jogo9GolsLabel = new javax.swing.JLabel();
        Time1Jogo13Label = new javax.swing.JLabel();
        Time2Jogo13Label = new javax.swing.JLabel();
        Time1Jogo13GolsLabel = new javax.swing.JLabel();
        Time2Jogo16Label = new javax.swing.JLabel();
        Time1Jogo15Label = new javax.swing.JLabel();
        Time2Jogo15Label = new javax.swing.JLabel();
        Time1Jogo16GolsLabel = new javax.swing.JLabel();
        Time2Jogo16GolsLabel = new javax.swing.JLabel();
        Time1Jogo11Label = new javax.swing.JLabel();
        Time2Jogo5Label = new javax.swing.JLabel();
        Time1Jogo5Label = new javax.swing.JLabel();
        Time1Jogo5GolsLabel = new javax.swing.JLabel();
        Time1Jogo11GolsLabel = new javax.swing.JLabel();
        Time1Jogo6Label = new javax.swing.JLabel();
        Time1Jogo14GolsLabel = new javax.swing.JLabel();
        Time2Jogo5GolsLabel = new javax.swing.JLabel();
        Time2Jogo11Label = new javax.swing.JLabel();
        Time2Jogo11GolsLabel = new javax.swing.JLabel();
        Time1Jogo14Label = new javax.swing.JLabel();
        Time2Jogo6Label = new javax.swing.JLabel();
        Time2Jogo7Label = new javax.swing.JLabel();
        Time1Jogo6GolsLabel = new javax.swing.JLabel();
        Time2Jogo6GolsLabel = new javax.swing.JLabel();
        Time1Jogo7Label = new javax.swing.JLabel();
        Time1Jogo7GolsLabel = new javax.swing.JLabel();
        Time2Jogo7GolsLabel = new javax.swing.JLabel();
        Time1Jogo8Label = new javax.swing.JLabel();
        Time2Jogo8Label = new javax.swing.JLabel();
        Time1Jogo8GolsLabel = new javax.swing.JLabel();
        Time2Jogo8GolsLabel = new javax.swing.JLabel();
        Time1Jogo12Label = new javax.swing.JLabel();
        Time2Jogo12Label = new javax.swing.JLabel();
        Time1Jogo12GolsLabel = new javax.swing.JLabel();
        Time2Jogo12GolsLabel = new javax.swing.JLabel();
        Time2Jogo14Label = new javax.swing.JLabel();
        Time2Jogo14GolsLabel = new javax.swing.JLabel();
        Time2Jogo13GolsLabel = new javax.swing.JLabel();
        Time2Jogo15GolsLabel = new javax.swing.JLabel();
        Time1Jogo15GolsLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel24 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        Time2Jogo10GolsLabel = new javax.swing.JLabel();
        Time1Jogo10GolsLabel = new javax.swing.JLabel();
        campeaoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(141, 27, 61));

        FaseGruposLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        FaseGruposLabel.setForeground(new java.awt.Color(255, 255, 255));
        FaseGruposLabel.setText("Mata-Mata");
        FaseGruposLabel.setMaximumSize(new java.awt.Dimension(142, 48));
        FaseGruposLabel.setMinimumSize(new java.awt.Dimension(142, 48));

        refazerSimulacaoButton.setText("Refazer simulação");
        refazerSimulacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refazerSimulacaoButtonActionPerformed(evt);
            }
        });

        avancarButton.setText("Finalizar");
        avancarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarButtonActionPerformed(evt);
            }
        });

        SimularButton.setText("Voltar para a fase de grupos");
        SimularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularButtonActionPerformed(evt);
            }
        });

        Time2Jogo1Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo1Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo1Label.setText(" ");
        Time2Jogo1Label.setAlignmentX(1.0F);
        Time2Jogo1Label.setOpaque(true);

        Time1Jogo1GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo1GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo1GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo1GolsLabel.setText("0");
        Time1Jogo1GolsLabel.setAlignmentX(1.0F);
        Time1Jogo1GolsLabel.setOpaque(true);

        Time1Jogo1Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo1Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo1Label.setText(" ");
        Time1Jogo1Label.setAlignmentX(1.0F);
        Time1Jogo1Label.setOpaque(true);

        Time1Jogo16Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo16Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo16Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo16Label.setText(" ");
        Time1Jogo16Label.setAlignmentX(1.0F);
        Time1Jogo16Label.setOpaque(true);

        Time1Jogo9Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo9Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo9Label.setText(" ");
        Time1Jogo9Label.setAlignmentX(1.0F);
        Time1Jogo9Label.setOpaque(true);

        Time1Jogo2GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo2GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo2GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo2GolsLabel.setText("0");
        Time1Jogo2GolsLabel.setAlignmentX(1.0F);
        Time1Jogo2GolsLabel.setOpaque(true);

        Time2Jogo9Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo9Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo9Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo9Label.setText(" ");
        Time2Jogo9Label.setAlignmentX(1.0F);
        Time2Jogo9Label.setOpaque(true);

        Time2Jogo3Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo3Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo3Label.setText(" ");
        Time2Jogo3Label.setAlignmentX(1.0F);
        Time2Jogo3Label.setOpaque(true);

        Time1Jogo2Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo2Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo2Label.setText(" ");
        Time1Jogo2Label.setAlignmentX(1.0F);
        Time1Jogo2Label.setOpaque(true);

        Time2Jogo2Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo2Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo2Label.setText(" ");
        Time2Jogo2Label.setAlignmentX(1.0F);
        Time2Jogo2Label.setOpaque(true);

        Time1Jogo3Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo3Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo3Label.setText(" ");
        Time1Jogo3Label.setAlignmentX(1.0F);
        Time1Jogo3Label.setOpaque(true);

        Time2Jogo4Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo4Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo4Label.setText(" ");
        Time2Jogo4Label.setAlignmentX(1.0F);
        Time2Jogo4Label.setOpaque(true);

        Time2Jogo10Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo10Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo10Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo10Label.setText(" ");
        Time2Jogo10Label.setAlignmentX(1.0F);
        Time2Jogo10Label.setOpaque(true);

        Time1Jogo4Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo4Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo4Label.setText(" ");
        Time1Jogo4Label.setAlignmentX(1.0F);
        Time1Jogo4Label.setOpaque(true);

        Time1Jogo10Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo10Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo10Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo10Label.setText(" ");
        Time1Jogo10Label.setAlignmentX(1.0F);
        Time1Jogo10Label.setOpaque(true);

        Time2Jogo1GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo1GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo1GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo1GolsLabel.setText("0");
        Time2Jogo1GolsLabel.setAlignmentX(1.0F);
        Time2Jogo1GolsLabel.setOpaque(true);

        Time2Jogo3GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo3GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo3GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo3GolsLabel.setText("0");
        Time2Jogo3GolsLabel.setAlignmentX(1.0F);
        Time2Jogo3GolsLabel.setOpaque(true);

        Time2Jogo2GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo2GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo2GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo2GolsLabel.setText("0");
        Time2Jogo2GolsLabel.setAlignmentX(1.0F);
        Time2Jogo2GolsLabel.setOpaque(true);

        Time1Jogo3GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo3GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo3GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo3GolsLabel.setText("0");
        Time1Jogo3GolsLabel.setAlignmentX(1.0F);
        Time1Jogo3GolsLabel.setOpaque(true);

        Time2Jogo4GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo4GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo4GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo4GolsLabel.setText("0");
        Time2Jogo4GolsLabel.setAlignmentX(1.0F);
        Time2Jogo4GolsLabel.setOpaque(true);

        Time1Jogo4GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo4GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo4GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo4GolsLabel.setText("0");
        Time1Jogo4GolsLabel.setAlignmentX(1.0F);
        Time1Jogo4GolsLabel.setOpaque(true);

        Time2Jogo9GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo9GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo9GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo9GolsLabel.setText("0");
        Time2Jogo9GolsLabel.setAlignmentX(1.0F);
        Time2Jogo9GolsLabel.setOpaque(true);

        Time1Jogo9GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo9GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo9GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo9GolsLabel.setText("0");
        Time1Jogo9GolsLabel.setAlignmentX(1.0F);
        Time1Jogo9GolsLabel.setOpaque(true);

        Time1Jogo13Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo13Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo13Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo13Label.setText(" ");
        Time1Jogo13Label.setAlignmentX(1.0F);
        Time1Jogo13Label.setOpaque(true);

        Time2Jogo13Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo13Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo13Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo13Label.setText(" ");
        Time2Jogo13Label.setAlignmentX(1.0F);
        Time2Jogo13Label.setOpaque(true);

        Time1Jogo13GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo13GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo13GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo13GolsLabel.setText("0");
        Time1Jogo13GolsLabel.setAlignmentX(1.0F);
        Time1Jogo13GolsLabel.setOpaque(true);

        Time2Jogo16Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo16Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo16Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo16Label.setText(" ");
        Time2Jogo16Label.setAlignmentX(1.0F);
        Time2Jogo16Label.setOpaque(true);

        Time1Jogo15Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo15Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo15Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo15Label.setText(" ");
        Time1Jogo15Label.setAlignmentX(1.0F);
        Time1Jogo15Label.setOpaque(true);

        Time2Jogo15Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo15Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo15Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo15Label.setText(" ");
        Time2Jogo15Label.setAlignmentX(1.0F);
        Time2Jogo15Label.setOpaque(true);

        Time1Jogo16GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo16GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo16GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo16GolsLabel.setText("0");
        Time1Jogo16GolsLabel.setAlignmentX(1.0F);
        Time1Jogo16GolsLabel.setOpaque(true);

        Time2Jogo16GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo16GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo16GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo16GolsLabel.setText("0");
        Time2Jogo16GolsLabel.setAlignmentX(1.0F);
        Time2Jogo16GolsLabel.setOpaque(true);

        Time1Jogo11Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo11Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo11Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo11Label.setText(" ");
        Time1Jogo11Label.setAlignmentX(1.0F);
        Time1Jogo11Label.setOpaque(true);

        Time2Jogo5Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo5Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo5Label.setText(" ");
        Time2Jogo5Label.setAlignmentX(1.0F);
        Time2Jogo5Label.setOpaque(true);

        Time1Jogo5Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo5Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo5Label.setText(" ");
        Time1Jogo5Label.setAlignmentX(1.0F);
        Time1Jogo5Label.setOpaque(true);

        Time1Jogo5GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo5GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo5GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo5GolsLabel.setText("0");
        Time1Jogo5GolsLabel.setAlignmentX(1.0F);
        Time1Jogo5GolsLabel.setOpaque(true);

        Time1Jogo11GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo11GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo11GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo11GolsLabel.setText("0");
        Time1Jogo11GolsLabel.setAlignmentX(1.0F);
        Time1Jogo11GolsLabel.setOpaque(true);

        Time1Jogo6Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo6Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo6Label.setText(" ");
        Time1Jogo6Label.setAlignmentX(1.0F);
        Time1Jogo6Label.setOpaque(true);

        Time1Jogo14GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo14GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo14GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo14GolsLabel.setText("0");
        Time1Jogo14GolsLabel.setAlignmentX(1.0F);
        Time1Jogo14GolsLabel.setOpaque(true);

        Time2Jogo5GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo5GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo5GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo5GolsLabel.setText("0");
        Time2Jogo5GolsLabel.setAlignmentX(1.0F);
        Time2Jogo5GolsLabel.setOpaque(true);

        Time2Jogo11Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo11Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo11Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo11Label.setText(" ");
        Time2Jogo11Label.setAlignmentX(1.0F);
        Time2Jogo11Label.setOpaque(true);

        Time2Jogo11GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo11GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo11GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo11GolsLabel.setText("0");
        Time2Jogo11GolsLabel.setAlignmentX(1.0F);
        Time2Jogo11GolsLabel.setOpaque(true);

        Time1Jogo14Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo14Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo14Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo14Label.setText(" ");
        Time1Jogo14Label.setAlignmentX(1.0F);
        Time1Jogo14Label.setOpaque(true);

        Time2Jogo6Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo6Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo6Label.setText(" ");
        Time2Jogo6Label.setAlignmentX(1.0F);
        Time2Jogo6Label.setOpaque(true);

        Time2Jogo7Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo7Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo7Label.setText(" ");
        Time2Jogo7Label.setAlignmentX(1.0F);
        Time2Jogo7Label.setOpaque(true);

        Time1Jogo6GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo6GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo6GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo6GolsLabel.setText("0");
        Time1Jogo6GolsLabel.setAlignmentX(1.0F);
        Time1Jogo6GolsLabel.setOpaque(true);

        Time2Jogo6GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo6GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo6GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo6GolsLabel.setText("0");
        Time2Jogo6GolsLabel.setAlignmentX(1.0F);
        Time2Jogo6GolsLabel.setOpaque(true);

        Time1Jogo7Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo7Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo7Label.setText(" ");
        Time1Jogo7Label.setAlignmentX(1.0F);
        Time1Jogo7Label.setOpaque(true);

        Time1Jogo7GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo7GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo7GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo7GolsLabel.setText("0");
        Time1Jogo7GolsLabel.setAlignmentX(1.0F);
        Time1Jogo7GolsLabel.setOpaque(true);

        Time2Jogo7GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo7GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo7GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo7GolsLabel.setText("0");
        Time2Jogo7GolsLabel.setAlignmentX(1.0F);
        Time2Jogo7GolsLabel.setOpaque(true);

        Time1Jogo8Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo8Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo8Label.setText(" ");
        Time1Jogo8Label.setAlignmentX(1.0F);
        Time1Jogo8Label.setOpaque(true);

        Time2Jogo8Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo8Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo8Label.setText(" ");
        Time2Jogo8Label.setAlignmentX(1.0F);
        Time2Jogo8Label.setOpaque(true);

        Time1Jogo8GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo8GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo8GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo8GolsLabel.setText("0");
        Time1Jogo8GolsLabel.setAlignmentX(1.0F);
        Time1Jogo8GolsLabel.setOpaque(true);

        Time2Jogo8GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo8GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo8GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo8GolsLabel.setText("0");
        Time2Jogo8GolsLabel.setAlignmentX(1.0F);
        Time2Jogo8GolsLabel.setOpaque(true);

        Time1Jogo12Label.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo12Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo12Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo12Label.setText(" ");
        Time1Jogo12Label.setAlignmentX(1.0F);
        Time1Jogo12Label.setOpaque(true);

        Time2Jogo12Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo12Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo12Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo12Label.setText(" ");
        Time2Jogo12Label.setAlignmentX(1.0F);
        Time2Jogo12Label.setOpaque(true);

        Time1Jogo12GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo12GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo12GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo12GolsLabel.setText("0");
        Time1Jogo12GolsLabel.setAlignmentX(1.0F);
        Time1Jogo12GolsLabel.setOpaque(true);

        Time2Jogo12GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo12GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo12GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo12GolsLabel.setText("0");
        Time2Jogo12GolsLabel.setAlignmentX(1.0F);
        Time2Jogo12GolsLabel.setOpaque(true);

        Time2Jogo14Label.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo14Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo14Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo14Label.setText(" ");
        Time2Jogo14Label.setAlignmentX(1.0F);
        Time2Jogo14Label.setOpaque(true);

        Time2Jogo14GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo14GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo14GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo14GolsLabel.setText("0");
        Time2Jogo14GolsLabel.setAlignmentX(1.0F);
        Time2Jogo14GolsLabel.setOpaque(true);

        Time2Jogo13GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo13GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo13GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo13GolsLabel.setText("0");
        Time2Jogo13GolsLabel.setAlignmentX(1.0F);
        Time2Jogo13GolsLabel.setOpaque(true);

        Time2Jogo15GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo15GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo15GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo15GolsLabel.setText("0");
        Time2Jogo15GolsLabel.setAlignmentX(1.0F);
        Time2Jogo15GolsLabel.setOpaque(true);

        Time1Jogo15GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo15GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo15GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo15GolsLabel.setText("0");
        Time1Jogo15GolsLabel.setAlignmentX(1.0F);
        Time1Jogo15GolsLabel.setOpaque(true);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Oitavas de final");

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Quartas de final");

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Quartas de final");

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Oitavas de final");

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Semi final");

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Semi final");

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Final");

        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("3° Lugar");

        Time2Jogo10GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time2Jogo10GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time2Jogo10GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2Jogo10GolsLabel.setText("0");
        Time2Jogo10GolsLabel.setAlignmentX(1.0F);
        Time2Jogo10GolsLabel.setOpaque(true);

        Time1Jogo10GolsLabel.setBackground(new java.awt.Color(255, 255, 255));
        Time1Jogo10GolsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Time1Jogo10GolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1Jogo10GolsLabel.setText("0");
        Time1Jogo10GolsLabel.setAlignmentX(1.0F);
        Time1Jogo10GolsLabel.setOpaque(true);

        campeaoLabel.setBackground(new java.awt.Color(255, 255, 255));
        campeaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campeaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campeaoLabel.setText(" ");
        campeaoLabel.setAlignmentX(1.0F);
        campeaoLabel.setOpaque(true);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Campeão");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Time1Jogo1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Time2Jogo2GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(Time1Jogo9Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Time1Jogo9GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGap(272, 272, 272)
                                                        .addComponent(jLabel70)
                                                        .addGap(278, 278, 278)
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(Time1Jogo11GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Time2Jogo11GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Time1Jogo12GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Time2Jogo12GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel1)
                                                        .addGap(310, 310, 310)))
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Time2Jogo11Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Time1Jogo11Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGap(16, 16, 16)
                                                        .addComponent(jLabel65)
                                                        .addGap(49, 49, 49)
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(Time2Jogo5GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Time2Jogo5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(Time1Jogo6GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Time1Jogo6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(Time2Jogo6GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                                        .addGap(3, 3, 3)
                                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(Time2Jogo7GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(Time1Jogo7GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(Time1Jogo7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(Time2Jogo6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(Time2Jogo7Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(Time1Jogo5GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Time1Jogo5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addComponent(Time1Jogo12Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Time2Jogo12Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(208, 208, 208)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addComponent(Time2Jogo15Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Time2Jogo15GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addComponent(Time1Jogo15Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Time1Jogo15GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(580, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(220, 220, 220))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(226, 226, 226))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(Time1Jogo8GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Time1Jogo8Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(Time2Jogo8GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Time2Jogo8Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addContainerGap())))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Time2Jogo10Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Time2Jogo9Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Time1Jogo10Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Time2Jogo10GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Time1Jogo10GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(Time2Jogo9GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(277, 277, 277)
                                                .addComponent(jLabel69)))
                                        .addContainerGap())))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Time1Jogo1GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jLabel67)
                        .addGap(360, 360, 360)
                        .addComponent(jLabel68)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Time2Jogo1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Time2Jogo1GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel64))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Time1Jogo4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Time1Jogo4GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Time2Jogo4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Time2Jogo4GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Time2Jogo3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Time2Jogo3GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Time1Jogo2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Time1Jogo2GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(378, 378, 378)
                                            .addComponent(Time1Jogo13Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(Time2Jogo2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(378, 378, 378))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(Time1Jogo3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Time1Jogo3GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Time2Jogo13Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addComponent(Time2Jogo16Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Time2Jogo16GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                            .addComponent(Time1Jogo16Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(Time1Jogo16GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(campeaoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(FaseGruposLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Time1Jogo13GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Time2Jogo13GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(215, 215, 215)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(Time2Jogo14GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Time2Jogo14Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(Time1Jogo14GolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Time1Jogo14Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel66)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addGap(44, 44, 44))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(SimularButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refazerSimulacaoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time1Jogo11Label)
                            .addComponent(Time1Jogo11GolsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time2Jogo11Label)
                            .addComponent(Time2Jogo11GolsLabel))
                        .addGap(18, 18, 18)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time1Jogo14Label)
                            .addComponent(Time1Jogo14GolsLabel)
                            .addComponent(Time1Jogo13Label)
                            .addComponent(Time1Jogo13GolsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time2Jogo14Label)
                            .addComponent(Time2Jogo14GolsLabel)
                            .addComponent(Time2Jogo13Label)
                            .addComponent(Time2Jogo13GolsLabel))
                        .addComponent(jLabel70))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(FaseGruposLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campeaoLabel)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time1Jogo9Label)
                                    .addComponent(Time1Jogo9GolsLabel)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time1Jogo1Label)
                                    .addComponent(Time1Jogo1GolsLabel)
                                    .addComponent(Time1Jogo5Label)
                                    .addComponent(Time1Jogo5GolsLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Time2Jogo1Label)
                                        .addComponent(Time2Jogo1GolsLabel)
                                        .addComponent(jLabel64))
                                    .addComponent(Time2Jogo5GolsLabel)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Time2Jogo5Label)
                                        .addComponent(jLabel65)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time2Jogo9Label)
                            .addComponent(Time2Jogo9GolsLabel)
                            .addComponent(jLabel69))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time1Jogo16Label)
                                    .addComponent(Time1Jogo16GolsLabel)
                                    .addComponent(Time1Jogo6Label)
                                    .addComponent(Time1Jogo6GolsLabel))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Time2Jogo16Label)
                                            .addComponent(Time2Jogo16GolsLabel)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Time2Jogo6GolsLabel)
                                            .addComponent(Time2Jogo6Label)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time1Jogo2GolsLabel)
                                    .addComponent(Time1Jogo2Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time2Jogo2GolsLabel)
                                    .addComponent(Time2Jogo2Label))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Time1Jogo7GolsLabel)
                                .addComponent(Time1Jogo7Label))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Time1Jogo3Label)
                                .addComponent(Time1Jogo3GolsLabel)))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time2Jogo3Label)
                                    .addComponent(Time2Jogo3GolsLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time1Jogo10Label)
                                    .addComponent(Time1Jogo12Label)
                                    .addComponent(Time1Jogo12GolsLabel)
                                    .addComponent(Time1Jogo10GolsLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time2Jogo10Label)
                                    .addComponent(Time2Jogo12Label)
                                    .addComponent(Time2Jogo12GolsLabel)
                                    .addComponent(Time2Jogo10GolsLabel))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time1Jogo4Label)
                                    .addComponent(Time1Jogo4GolsLabel)
                                    .addComponent(Time1Jogo8Label)
                                    .addComponent(Time1Jogo8GolsLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time2Jogo4Label)
                                    .addComponent(Time2Jogo4GolsLabel)
                                    .addComponent(Time2Jogo8Label)
                                    .addComponent(Time2Jogo8GolsLabel))
                                .addGap(110, 110, 110))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Time2Jogo7Label)
                                    .addComponent(Time2Jogo7GolsLabel))
                                .addContainerGap(296, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time1Jogo15Label)
                            .addComponent(Time1Jogo15GolsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time2Jogo15Label)
                            .addComponent(Time2Jogo15GolsLabel))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avancarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refazerSimulacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SimularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularButtonActionPerformed
        new TelaSimularFaseGrupos(campeonatoFaseGrupo.getGrupos(), true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SimularButtonActionPerformed

    private void refazerSimulacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refazerSimulacaoButtonActionPerformed
        try {
            campeonato.zerarJogosFaseMataMata();
            simularFaseMataMata();
            getCampeao();
        }
        catch (Exception e) {}
    }//GEN-LAST:event_refazerSimulacaoButtonActionPerformed

    private void avancarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarButtonActionPerformed
        salvarDadosCampeonato();
        new TelaInicialAdm(campeonato).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avancarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {;
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaSimularMataMata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaSimularMataMata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaSimularMataMata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaSimularMataMata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {;
//            public void run() {
//                String conjuntoGrupos = null;
//                new TelaSimularMataMata(new Campeonato(GrupoDAO.listarGruposCompletos(conjuntoGrupos))).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FaseGruposLabel;
    private javax.swing.JButton SimularButton;
    private javax.swing.JLabel Time1Jogo10GolsLabel;
    private javax.swing.JLabel Time1Jogo10Label;
    private javax.swing.JLabel Time1Jogo11GolsLabel;
    private javax.swing.JLabel Time1Jogo11Label;
    private javax.swing.JLabel Time1Jogo12GolsLabel;
    private javax.swing.JLabel Time1Jogo12Label;
    private javax.swing.JLabel Time1Jogo13GolsLabel;
    private javax.swing.JLabel Time1Jogo13Label;
    private javax.swing.JLabel Time1Jogo14GolsLabel;
    private javax.swing.JLabel Time1Jogo14Label;
    private javax.swing.JLabel Time1Jogo15GolsLabel;
    private javax.swing.JLabel Time1Jogo15Label;
    public javax.swing.JLabel Time1Jogo16GolsLabel;
    public javax.swing.JLabel Time1Jogo16Label;
    private javax.swing.JLabel Time1Jogo1GolsLabel;
    private javax.swing.JLabel Time1Jogo1Label;
    private javax.swing.JLabel Time1Jogo2GolsLabel;
    private javax.swing.JLabel Time1Jogo2Label;
    private javax.swing.JLabel Time1Jogo3GolsLabel;
    private javax.swing.JLabel Time1Jogo3Label;
    private javax.swing.JLabel Time1Jogo4GolsLabel;
    private javax.swing.JLabel Time1Jogo4Label;
    private javax.swing.JLabel Time1Jogo5GolsLabel;
    private javax.swing.JLabel Time1Jogo5Label;
    private javax.swing.JLabel Time1Jogo6GolsLabel;
    private javax.swing.JLabel Time1Jogo6Label;
    private javax.swing.JLabel Time1Jogo7GolsLabel;
    private javax.swing.JLabel Time1Jogo7Label;
    private javax.swing.JLabel Time1Jogo8GolsLabel;
    private javax.swing.JLabel Time1Jogo8Label;
    private javax.swing.JLabel Time1Jogo9GolsLabel;
    private javax.swing.JLabel Time1Jogo9Label;
    private javax.swing.JLabel Time2Jogo10GolsLabel;
    private javax.swing.JLabel Time2Jogo10Label;
    private javax.swing.JLabel Time2Jogo11GolsLabel;
    private javax.swing.JLabel Time2Jogo11Label;
    private javax.swing.JLabel Time2Jogo12GolsLabel;
    private javax.swing.JLabel Time2Jogo12Label;
    private javax.swing.JLabel Time2Jogo13GolsLabel;
    private javax.swing.JLabel Time2Jogo13Label;
    private javax.swing.JLabel Time2Jogo14GolsLabel;
    private javax.swing.JLabel Time2Jogo14Label;
    private javax.swing.JLabel Time2Jogo15GolsLabel;
    private javax.swing.JLabel Time2Jogo15Label;
    public javax.swing.JLabel Time2Jogo16GolsLabel;
    public javax.swing.JLabel Time2Jogo16Label;
    private javax.swing.JLabel Time2Jogo1GolsLabel;
    private javax.swing.JLabel Time2Jogo1Label;
    private javax.swing.JLabel Time2Jogo2GolsLabel;
    private javax.swing.JLabel Time2Jogo2Label;
    private javax.swing.JLabel Time2Jogo3GolsLabel;
    private javax.swing.JLabel Time2Jogo3Label;
    private javax.swing.JLabel Time2Jogo4GolsLabel;
    private javax.swing.JLabel Time2Jogo4Label;
    private javax.swing.JLabel Time2Jogo5GolsLabel;
    private javax.swing.JLabel Time2Jogo5Label;
    private javax.swing.JLabel Time2Jogo6GolsLabel;
    private javax.swing.JLabel Time2Jogo6Label;
    private javax.swing.JLabel Time2Jogo7GolsLabel;
    private javax.swing.JLabel Time2Jogo7Label;
    private javax.swing.JLabel Time2Jogo8GolsLabel;
    private javax.swing.JLabel Time2Jogo8Label;
    private javax.swing.JLabel Time2Jogo9GolsLabel;
    private javax.swing.JLabel Time2Jogo9Label;
    private javax.swing.JButton avancarButton;
    public javax.swing.JLabel campeaoLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton refazerSimulacaoButton;
    // End of variables declaration//GEN-END:variables

    private void simularFaseMataMata() {
        campeonato.simularPartidasFaseMataMata();
        setResultadosOitavasDeFinal();
        setJogosQuartasDeFinal();
        setResultadosQuartasDeFinal();
        setJogosSemiFinal();
        setResultadosSemifinal();
        setJogosFinal();
        setResultadosFinal();
    }
    
    private void ordenarTimes() {
        campeonato.getGrupos().forEach((grupo) -> {
            ArrayList<Time> times = grupo.getTimes();
            Collections.sort(times, new ClassificacaoComparator());
            grupo.setTimes(times);
        });
    }
    
    private void setJogosIniciais() {
        ordenarTimes();
        
        ArrayList<Grupo> grupos = campeonato.getGrupos();
        // Lado esquerdo
        Time1Jogo1Label.setText(grupos.get(0).getTimes().get(0).getNome());
        Time2Jogo1Label.setText(grupos.get(1).getTimes().get(1).getNome());
        
        Time1Jogo2Label.setText(grupos.get(2).getTimes().get(0).getNome());
        Time2Jogo2Label.setText(grupos.get(3).getTimes().get(1).getNome());
        
        Time1Jogo3Label.setText(grupos.get(4).getTimes().get(0).getNome());
        Time2Jogo3Label.setText(grupos.get(5).getTimes().get(1).getNome());
        
        Time1Jogo4Label.setText(grupos.get(6).getTimes().get(0).getNome());
        Time2Jogo4Label.setText(grupos.get(7).getTimes().get(1).getNome());
        
        // Lado direito
        Time1Jogo5Label.setText(grupos.get(0).getTimes().get(1).getNome());
        Time2Jogo5Label.setText(grupos.get(1).getTimes().get(0).getNome());
        
        Time1Jogo6Label.setText(grupos.get(2).getTimes().get(1).getNome());
        Time2Jogo6Label.setText(grupos.get(3).getTimes().get(0).getNome());
        
        Time1Jogo7Label.setText(grupos.get(4).getTimes().get(1).getNome());
        Time2Jogo7Label.setText(grupos.get(5).getTimes().get(0).getNome());
        
        Time1Jogo8Label.setText(grupos.get(6).getTimes().get(1).getNome());
        Time2Jogo8Label.setText(grupos.get(7).getTimes().get(0).getNome());
    }

    private void setResultadosOitavasDeFinal() {
        Time1Jogo1GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(0).getGolsTime1()));
        Time2Jogo1GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(0).getGolsTime2()));
        Time1Jogo2GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(1).getGolsTime1()));
        Time2Jogo2GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(1).getGolsTime2()));
        Time1Jogo3GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(2).getGolsTime1()));
        Time2Jogo3GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(2).getGolsTime2()));
        Time1Jogo4GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(3).getGolsTime1()));
        Time2Jogo4GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(3).getGolsTime2()));
        
        Time1Jogo5GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(4).getGolsTime1()));
        Time2Jogo5GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(4).getGolsTime2()));
        Time1Jogo6GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(5).getGolsTime1()));
        Time2Jogo6GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(5).getGolsTime2()));
        Time1Jogo7GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(6).getGolsTime1()));
        Time2Jogo7GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(6).getGolsTime2()));
        Time1Jogo8GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(7).getGolsTime1()));
        Time2Jogo8GolsLabel.setText(Integer.toString(campeonato.getPartidasOitavasDeFinal().get(7).getGolsTime2()));
    }
    
    private void setJogosQuartasDeFinal() {
        Time1Jogo9Label.setText(campeonato.getPartidasQuartasDeFinal().get(0).getTime1().getNome());
        Time2Jogo9Label.setText(campeonato.getPartidasQuartasDeFinal().get(0).getTime2().getNome());
        Time1Jogo10Label.setText(campeonato.getPartidasQuartasDeFinal().get(1).getTime1().getNome());
        Time2Jogo10Label.setText(campeonato.getPartidasQuartasDeFinal().get(1).getTime2().getNome());
        
        Time1Jogo11Label.setText(campeonato.getPartidasQuartasDeFinal().get(2).getTime1().getNome());
        Time2Jogo11Label.setText(campeonato.getPartidasQuartasDeFinal().get(2).getTime2().getNome());
        Time1Jogo12Label.setText(campeonato.getPartidasQuartasDeFinal().get(3).getTime1().getNome());
        Time2Jogo12Label.setText(campeonato.getPartidasQuartasDeFinal().get(3).getTime2().getNome());
    }
    
    private void setResultadosQuartasDeFinal() {
        Time1Jogo9GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(0).getGolsTime1()));
        Time2Jogo9GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(0).getGolsTime2()));
        Time1Jogo10GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(1).getGolsTime1()));
        Time2Jogo10GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(1).getGolsTime2()));
        
        Time1Jogo11GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(2).getGolsTime1()));
        Time2Jogo11GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(2).getGolsTime2()));
        Time1Jogo12GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(3).getGolsTime1()));
        Time2Jogo12GolsLabel.setText(Integer.toString(campeonato.getPartidasQuartasDeFinal().get(3).getGolsTime2()));
    }
    
    private void setJogosSemiFinal() {
        Time1Jogo13Label.setText(campeonato.getPartidasSemifinal().get(0).getTime1().getNome());
        Time2Jogo13Label.setText(campeonato.getPartidasSemifinal().get(0).getTime2().getNome());
        
        Time1Jogo14Label.setText(campeonato.getPartidasSemifinal().get(1).getTime1().getNome());
        Time2Jogo14Label.setText(campeonato.getPartidasSemifinal().get(1).getTime2().getNome());
    }

    private void setResultadosSemifinal() {
        Time1Jogo13GolsLabel.setText(Integer.toString(campeonato.getPartidasSemifinal().get(0).getGolsTime1()));
        Time2Jogo13GolsLabel.setText(Integer.toString(campeonato.getPartidasSemifinal().get(0).getGolsTime2()));
        
        Time1Jogo14GolsLabel.setText(Integer.toString(campeonato.getPartidasSemifinal().get(1).getGolsTime1()));
        Time2Jogo14GolsLabel.setText(Integer.toString(campeonato.getPartidasSemifinal().get(1).getGolsTime2()));
    }
    
    private void setJogosFinal() {
        Time1Jogo15Label.setText(campeonato.getPartidasFinal().get(0).getTime1().getNome());
        Time2Jogo15Label.setText(campeonato.getPartidasFinal().get(0).getTime2().getNome());
        
        Time1Jogo16Label.setText(campeonato.getPartidasFinal().get(1).getTime1().getNome());
        Time2Jogo16Label.setText(campeonato.getPartidasFinal().get(1).getTime2().getNome());
    }

    private void setResultadosFinal() {
        Time1Jogo15GolsLabel.setText(Integer.toString(campeonato.getPartidasFinal().get(0).getGolsTime1()));
        Time2Jogo15GolsLabel.setText(Integer.toString(campeonato.getPartidasFinal().get(0).getGolsTime2()));
        
        Time1Jogo16GolsLabel.setText(Integer.toString(campeonato.getPartidasFinal().get(1).getGolsTime1()));
        Time2Jogo16GolsLabel.setText(Integer.toString(campeonato.getPartidasFinal().get(1).getGolsTime2()));
    }
    
    public void getCampeao() {
        if (Integer.parseInt(Time1Jogo16GolsLabel.getText()) >  Integer.parseInt(Time2Jogo16GolsLabel.getText())) {
            campeaoLabel.setText(Time1Jogo16Label.getText());
        } else {
            campeaoLabel.setText(Time2Jogo16Label.getText());
        }
    }
    
    private void salvarDadosCampeonato() {
        PartidaDAO.salvar(campeonato.getTodasPartidas(), campeonato.getId());
        campeonato.finalizar();
    }
}
