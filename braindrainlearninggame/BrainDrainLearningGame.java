/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package braindrainlearninggame;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author luisp
 */
public class BrainDrainLearningGame extends javax.swing.JFrame implements Dice{
    GameDynamics.PlayerMovement playerMovement;
    public static PlayerNames pn1;
    public int player1Score = 0;
    public int player2Score = 0;
    
    
    QuestionAnswerChecker[] questionAnswerInitializer = QuestionAnswerInitializer.initializePairs();
    //PlayerMovement1 playerMovement;
    JLabel[] tiles = new JLabel[100];

    /**
     * Creates new form BrainDrainLearningGame
     */
    public BrainDrainLearningGame(PlayerNames pn1) {
        initComponents();
        this.pn1 = pn1;
        String Player1Name = pn1.getP1Name();
        String Player2Name = pn1.getP2Name();
        
        txtP1Name.setBackground(new java.awt.Color (0,0,0,1));
        txtP2Name.setBackground(new java.awt.Color (0,0,0,1));
        txtP1Moves.setBackground(new java.awt.Color (0,0,0,1));
        txtP2Moves.setBackground(new java.awt.Color (0,0,0,1));
        txtPlayerTurn.setBackground(new java.awt.Color (0,0,0,1));
        
        Collections.shuffle(Arrays.asList(questionAnswerInitializer));
        
        tiles[0] = lblTile1;
        tiles[1] = lblTile2;
        tiles[2] = lblTile3;
        tiles[3] = lblTile4;
        tiles[4] = lblTile5;
        tiles[5] = lblTile6;
        tiles[6] = lblTile7;
        tiles[7] = lblTile8;
        tiles[8] = lblTile9;
        tiles[9] = lblTile10;
        tiles[10] = lblTile11;
        tiles[11] = lblTile12;
        tiles[12] = lblTile13;
        tiles[13] = lblTile14;
        tiles[14] = lblTile15;
        tiles[15] = lblTile16;
        tiles[16] = lblTile17;
        tiles[17] = lblTile18;
        tiles[18] = lblTile19;
        tiles[19] = lblTile20;
        tiles[20] = lblTile21;
        tiles[21] = lblTile22;
        tiles[22] = lblTile23;
        tiles[23] = lblTile24;
        tiles[24] = lblTile25;
        tiles[25] = lblTile26;
        tiles[26] = lblTile27;
        tiles[27] = lblTile28;
        tiles[28] = lblTile29;
        tiles[29] = lblTile30;
        tiles[30] = lblTile31;
        tiles[31] = lblTile32;
        tiles[32] = lblTile33;
        tiles[33] = lblTile34;
        tiles[34] = lblTile35;
        tiles[35] = lblTile36;
        tiles[36] = lblTile37;
        tiles[37] = lblTile38;
        tiles[38] = lblTile39;
        tiles[39] = lblTile40;
        tiles[40] = lblTile41;
        tiles[41] = lblTile42;
        tiles[42] = lblTile43;
        tiles[43] = lblTile44;
        tiles[44] = lblTile45;
        tiles[45] = lblTile46;
        tiles[46] = lblTile47;
        tiles[47] = lblTile48;
        tiles[48] = lblTile49;
        tiles[49] = lblTile50;
        tiles[50] = lblTile51;
        tiles[51] = lblTile52;
        tiles[52] = lblTile53;
        tiles[53] = lblTile54;
        tiles[54] = lblTile55;
        tiles[55] = lblTile56;
        tiles[56] = lblTile57;
        tiles[57] = lblTile58;
        tiles[58] = lblTile59;
        tiles[59] = lblTile60;
        tiles[60] = lblTile61;
        tiles[61] = lblTile62;
        tiles[62] = lblTile63;
        tiles[63] = lblTile64;
        tiles[64] = lblTile65;
        tiles[65] = lblTile66;
        tiles[66] = lblTile67;
        tiles[67] = lblTile68;
        tiles[68] = lblTile69;
        tiles[69] = lblTile70;
        tiles[70] = lblTile71;
        tiles[71] = lblTile72;
        tiles[72] = lblTile73;
        tiles[73] = lblTile74;
        tiles[74] = lblTile75;
        tiles[75] = lblTile76;
        tiles[76] = lblTile77;
        tiles[77] = lblTile78;
        tiles[78] = lblTile79;
        tiles[79] = lblTile80;
        tiles[80] = lblTile81;
        tiles[81] = lblTile82;
        tiles[82] = lblTile83;
        tiles[83] = lblTile84;
        tiles[84] = lblTile85;
        tiles[85] = lblTile86;
        tiles[86] = lblTile87;
        tiles[87] = lblTile88;
        tiles[88] = lblTile89;
        tiles[89] = lblTile90;
        tiles[90] = lblTile99;
        tiles[91] = lblTile91;
        tiles[92] = lblTile92;
        tiles[93] = lblTile93;
        tiles[94] = lblTile94;
        tiles[95] = lblTile95;
        tiles[96] = lblTile96;
        tiles[97] = lblTile97;
        tiles[98] = lblTile98;
        tiles[99] = lblTile100;

        //playerMovement = new PlayerMovement1(lblP1, lblP2, tiles);
        playerMovement = new GameDynamics(lblP1, lblP2).new PlayerMovement(tiles);
        
        setSize(765, 408);
        txtPlayerTurn.setForeground(Color.WHITE);
        txtPlayerTurn.setText(pn1.getP1Name() + "'s Turn");
        
        txtP1Name.setText(pn1.getP1Name());
        txtP2Name.setText(pn1.getP2Name());
 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTile100 = new javax.swing.JLabel();
        lblTile98 = new javax.swing.JLabel();
        lblTile97 = new javax.swing.JLabel();
        lblTile96 = new javax.swing.JLabel();
        lblTile95 = new javax.swing.JLabel();
        lblTile94 = new javax.swing.JLabel();
        lblTile93 = new javax.swing.JLabel();
        lblTile92 = new javax.swing.JLabel();
        lblTile91 = new javax.swing.JLabel();
        lblTile99 = new javax.swing.JLabel();
        lblTile90 = new javax.swing.JLabel();
        lblTile89 = new javax.swing.JLabel();
        lblTile88 = new javax.swing.JLabel();
        lblTile87 = new javax.swing.JLabel();
        lblTile86 = new javax.swing.JLabel();
        lblTile85 = new javax.swing.JLabel();
        lblTile84 = new javax.swing.JLabel();
        lblTile83 = new javax.swing.JLabel();
        lblTile82 = new javax.swing.JLabel();
        lblTile81 = new javax.swing.JLabel();
        lblTile80 = new javax.swing.JLabel();
        lblTile79 = new javax.swing.JLabel();
        lblTile78 = new javax.swing.JLabel();
        lblTile77 = new javax.swing.JLabel();
        lblTile76 = new javax.swing.JLabel();
        lblTile75 = new javax.swing.JLabel();
        lblTile74 = new javax.swing.JLabel();
        lblTile73 = new javax.swing.JLabel();
        lblTile72 = new javax.swing.JLabel();
        lblTile71 = new javax.swing.JLabel();
        lblTile70 = new javax.swing.JLabel();
        lblTile69 = new javax.swing.JLabel();
        lblTile68 = new javax.swing.JLabel();
        lblTile67 = new javax.swing.JLabel();
        lblTile66 = new javax.swing.JLabel();
        lblTile65 = new javax.swing.JLabel();
        lblTile64 = new javax.swing.JLabel();
        lblTile63 = new javax.swing.JLabel();
        lblTile62 = new javax.swing.JLabel();
        lblTile61 = new javax.swing.JLabel();
        lblTile60 = new javax.swing.JLabel();
        lblTile59 = new javax.swing.JLabel();
        lblTile58 = new javax.swing.JLabel();
        lblTile57 = new javax.swing.JLabel();
        lblTile56 = new javax.swing.JLabel();
        lblTile55 = new javax.swing.JLabel();
        lblTile54 = new javax.swing.JLabel();
        lblTile53 = new javax.swing.JLabel();
        lblTile52 = new javax.swing.JLabel();
        lblTile51 = new javax.swing.JLabel();
        lblTile50 = new javax.swing.JLabel();
        lblTile49 = new javax.swing.JLabel();
        lblTile48 = new javax.swing.JLabel();
        lblTile47 = new javax.swing.JLabel();
        lblTile46 = new javax.swing.JLabel();
        lblTile45 = new javax.swing.JLabel();
        lblTile44 = new javax.swing.JLabel();
        lblTile43 = new javax.swing.JLabel();
        lblTile42 = new javax.swing.JLabel();
        lblTile41 = new javax.swing.JLabel();
        lblTile40 = new javax.swing.JLabel();
        lblTile39 = new javax.swing.JLabel();
        lblTile38 = new javax.swing.JLabel();
        lblTile37 = new javax.swing.JLabel();
        lblTile36 = new javax.swing.JLabel();
        lblTile35 = new javax.swing.JLabel();
        lblTile34 = new javax.swing.JLabel();
        lblTile33 = new javax.swing.JLabel();
        lblTile32 = new javax.swing.JLabel();
        lblTile31 = new javax.swing.JLabel();
        lblTile30 = new javax.swing.JLabel();
        lblTile29 = new javax.swing.JLabel();
        lblTile28 = new javax.swing.JLabel();
        lblTile27 = new javax.swing.JLabel();
        lblTile26 = new javax.swing.JLabel();
        lblTile25 = new javax.swing.JLabel();
        lblTile24 = new javax.swing.JLabel();
        lblTile23 = new javax.swing.JLabel();
        lblTile22 = new javax.swing.JLabel();
        lblTile21 = new javax.swing.JLabel();
        lblTile20 = new javax.swing.JLabel();
        lblTile19 = new javax.swing.JLabel();
        lblTile18 = new javax.swing.JLabel();
        lblTile17 = new javax.swing.JLabel();
        lblTile16 = new javax.swing.JLabel();
        lblTile15 = new javax.swing.JLabel();
        lblTile14 = new javax.swing.JLabel();
        lblTile13 = new javax.swing.JLabel();
        lblTile12 = new javax.swing.JLabel();
        lblTile11 = new javax.swing.JLabel();
        lblTile10 = new javax.swing.JLabel();
        lblTile9 = new javax.swing.JLabel();
        lblTile8 = new javax.swing.JLabel();
        lblTile7 = new javax.swing.JLabel();
        lblTile6 = new javax.swing.JLabel();
        lblTile5 = new javax.swing.JLabel();
        lblTile4 = new javax.swing.JLabel();
        lblTile3 = new javax.swing.JLabel();
        lblTile2 = new javax.swing.JLabel();
        lblTile1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblP1 = new javax.swing.JLabel();
        lblDiceResult = new javax.swing.JLabel();
        btnDice = new javax.swing.JButton();
        txtPlayerTurn = new javax.swing.JTextField();
        lblPlayerTurn = new javax.swing.JLabel();
        txtP2Name = new javax.swing.JTextField();
        txtP1Name = new javax.swing.JTextField();
        txtP2Moves = new javax.swing.JTextField();
        txtP1Moves = new javax.swing.JTextField();
        lblDisplayScore1 = new javax.swing.JLabel();
        lblDisplayScoreP1 = new javax.swing.JLabel();
        lblDisplayScore2 = new javax.swing.JLabel();
        lblDisplayScoreP2 = new javax.swing.JLabel();
        lblBoard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brain Drain Learning Game");
        getContentPane().setLayout(null);
        getContentPane().add(lblTile100);
        lblTile100.setBounds(182, 10, 29, 29);
        getContentPane().add(lblTile98);
        lblTile98.setBounds(250, 10, 30, 30);
        getContentPane().add(lblTile97);
        lblTile97.setBounds(288, 15, 29, 29);
        getContentPane().add(lblTile96);
        lblTile96.setBounds(322, 10, 30, 30);
        getContentPane().add(lblTile95);
        lblTile95.setBounds(358, 15, 29, 29);
        getContentPane().add(lblTile94);
        lblTile94.setBounds(392, 10, 30, 30);
        getContentPane().add(lblTile93);
        lblTile93.setBounds(428, 15, 29, 29);
        getContentPane().add(lblTile92);
        lblTile92.setBounds(462, 10, 30, 30);
        getContentPane().add(lblTile91);
        lblTile91.setBounds(493, 15, 29, 29);
        getContentPane().add(lblTile99);
        lblTile99.setBounds(218, 15, 29, 29);
        getContentPane().add(lblTile90);
        lblTile90.setBounds(496, 50, 30, 30);
        getContentPane().add(lblTile89);
        lblTile89.setBounds(460, 50, 29, 29);
        getContentPane().add(lblTile88);
        lblTile88.setBounds(427, 50, 30, 30);
        getContentPane().add(lblTile87);
        lblTile87.setBounds(392, 50, 29, 29);
        getContentPane().add(lblTile86);
        lblTile86.setBounds(357, 50, 30, 30);
        getContentPane().add(lblTile85);
        lblTile85.setBounds(322, 50, 29, 29);
        getContentPane().add(lblTile84);
        lblTile84.setBounds(287, 50, 30, 30);
        getContentPane().add(lblTile83);
        lblTile83.setBounds(250, 50, 29, 29);
        getContentPane().add(lblTile82);
        lblTile82.setBounds(217, 50, 30, 30);
        getContentPane().add(lblTile81);
        lblTile81.setBounds(183, 50, 29, 29);
        getContentPane().add(lblTile80);
        lblTile80.setBounds(182, 80, 30, 30);
        getContentPane().add(lblTile79);
        lblTile79.setBounds(218, 80, 29, 29);
        getContentPane().add(lblTile78);
        lblTile78.setBounds(250, 80, 30, 30);
        getContentPane().add(lblTile77);
        lblTile77.setBounds(288, 80, 29, 29);
        getContentPane().add(lblTile76);
        lblTile76.setBounds(322, 80, 30, 30);
        getContentPane().add(lblTile75);
        lblTile75.setBounds(358, 80, 29, 29);
        getContentPane().add(lblTile74);
        lblTile74.setBounds(392, 80, 30, 30);
        getContentPane().add(lblTile73);
        lblTile73.setBounds(428, 80, 29, 29);
        getContentPane().add(lblTile72);
        lblTile72.setBounds(462, 80, 30, 30);
        getContentPane().add(lblTile71);
        lblTile71.setBounds(490, 80, 29, 29);
        getContentPane().add(lblTile70);
        lblTile70.setBounds(496, 116, 30, 30);
        getContentPane().add(lblTile69);
        lblTile69.setBounds(460, 117, 29, 29);
        getContentPane().add(lblTile68);
        lblTile68.setBounds(427, 116, 30, 30);
        getContentPane().add(lblTile67);
        lblTile67.setBounds(392, 117, 29, 29);
        getContentPane().add(lblTile66);
        lblTile66.setBounds(357, 116, 30, 30);
        getContentPane().add(lblTile65);
        lblTile65.setBounds(322, 117, 29, 29);
        getContentPane().add(lblTile64);
        lblTile64.setBounds(287, 116, 30, 30);
        getContentPane().add(lblTile63);
        lblTile63.setBounds(253, 117, 29, 29);
        getContentPane().add(lblTile62);
        lblTile62.setBounds(217, 116, 30, 30);
        getContentPane().add(lblTile61);
        lblTile61.setBounds(183, 117, 29, 29);
        getContentPane().add(lblTile60);
        lblTile60.setBounds(182, 151, 30, 30);
        getContentPane().add(lblTile59);
        lblTile59.setBounds(218, 150, 29, 29);
        getContentPane().add(lblTile58);
        lblTile58.setBounds(252, 151, 30, 30);
        getContentPane().add(lblTile57);
        lblTile57.setBounds(288, 150, 29, 29);
        getContentPane().add(lblTile56);
        lblTile56.setBounds(322, 151, 30, 30);
        getContentPane().add(lblTile55);
        lblTile55.setBounds(358, 150, 29, 29);
        getContentPane().add(lblTile54);
        lblTile54.setBounds(392, 151, 30, 30);
        getContentPane().add(lblTile53);
        lblTile53.setBounds(428, 150, 29, 29);
        getContentPane().add(lblTile52);
        lblTile52.setBounds(462, 151, 30, 30);
        getContentPane().add(lblTile51);
        lblTile51.setBounds(493, 150, 29, 29);
        getContentPane().add(lblTile50);
        lblTile50.setBounds(496, 186, 30, 30);
        getContentPane().add(lblTile49);
        lblTile49.setBounds(460, 187, 29, 29);
        getContentPane().add(lblTile48);
        lblTile48.setBounds(427, 186, 30, 30);
        getContentPane().add(lblTile47);
        lblTile47.setBounds(392, 187, 29, 29);
        getContentPane().add(lblTile46);
        lblTile46.setBounds(357, 186, 30, 30);
        getContentPane().add(lblTile45);
        lblTile45.setBounds(322, 187, 29, 29);
        getContentPane().add(lblTile44);
        lblTile44.setBounds(287, 186, 30, 30);
        getContentPane().add(lblTile43);
        lblTile43.setBounds(250, 187, 29, 29);
        getContentPane().add(lblTile42);
        lblTile42.setBounds(217, 186, 30, 30);
        getContentPane().add(lblTile41);
        lblTile41.setBounds(183, 187, 29, 29);
        getContentPane().add(lblTile40);
        lblTile40.setBounds(182, 220, 30, 30);
        getContentPane().add(lblTile39);
        lblTile39.setBounds(218, 220, 29, 29);
        getContentPane().add(lblTile38);
        lblTile38.setBounds(252, 221, 30, 30);
        getContentPane().add(lblTile37);
        lblTile37.setBounds(288, 220, 29, 29);
        getContentPane().add(lblTile36);
        lblTile36.setBounds(322, 221, 30, 30);
        getContentPane().add(lblTile35);
        lblTile35.setBounds(358, 220, 29, 29);
        getContentPane().add(lblTile34);
        lblTile34.setBounds(392, 221, 30, 30);
        getContentPane().add(lblTile33);
        lblTile33.setBounds(428, 220, 29, 29);
        getContentPane().add(lblTile32);
        lblTile32.setBounds(462, 221, 30, 30);
        getContentPane().add(lblTile31);
        lblTile31.setBounds(493, 220, 29, 29);
        getContentPane().add(lblTile30);
        lblTile30.setBounds(496, 256, 30, 30);
        getContentPane().add(lblTile29);
        lblTile29.setBounds(460, 257, 29, 29);
        getContentPane().add(lblTile28);
        lblTile28.setBounds(427, 256, 30, 30);
        getContentPane().add(lblTile27);
        lblTile27.setBounds(392, 257, 29, 29);
        getContentPane().add(lblTile26);
        lblTile26.setBounds(357, 256, 30, 30);
        getContentPane().add(lblTile25);
        lblTile25.setBounds(322, 257, 29, 29);
        getContentPane().add(lblTile24);
        lblTile24.setBounds(287, 256, 30, 30);
        getContentPane().add(lblTile23);
        lblTile23.setBounds(250, 257, 29, 29);
        getContentPane().add(lblTile22);
        lblTile22.setBounds(217, 256, 30, 30);
        getContentPane().add(lblTile21);
        lblTile21.setBounds(183, 257, 29, 29);
        getContentPane().add(lblTile20);
        lblTile20.setBounds(182, 290, 30, 30);
        getContentPane().add(lblTile19);
        lblTile19.setBounds(218, 290, 29, 29);
        getContentPane().add(lblTile18);
        lblTile18.setBounds(252, 290, 30, 30);
        getContentPane().add(lblTile17);
        lblTile17.setBounds(288, 290, 29, 29);
        getContentPane().add(lblTile16);
        lblTile16.setBounds(322, 290, 30, 30);
        getContentPane().add(lblTile15);
        lblTile15.setBounds(358, 290, 29, 29);
        getContentPane().add(lblTile14);
        lblTile14.setBounds(392, 290, 30, 30);
        getContentPane().add(lblTile13);
        lblTile13.setBounds(428, 290, 29, 29);
        getContentPane().add(lblTile12);
        lblTile12.setBounds(462, 290, 30, 30);
        getContentPane().add(lblTile11);
        lblTile11.setBounds(498, 290, 29, 29);
        getContentPane().add(lblTile10);
        lblTile10.setBounds(496, 325, 30, 30);
        getContentPane().add(lblTile9);
        lblTile9.setBounds(460, 324, 29, 29);
        getContentPane().add(lblTile8);
        lblTile8.setBounds(427, 325, 30, 30);
        getContentPane().add(lblTile7);
        lblTile7.setBounds(392, 324, 29, 29);
        getContentPane().add(lblTile6);
        lblTile6.setBounds(357, 325, 30, 30);
        getContentPane().add(lblTile5);
        lblTile5.setBounds(322, 324, 29, 29);
        getContentPane().add(lblTile4);
        lblTile4.setBounds(287, 325, 30, 30);
        getContentPane().add(lblTile3);
        lblTile3.setBounds(250, 324, 29, 29);
        getContentPane().add(lblTile2);
        lblTile2.setBounds(217, 325, 30, 30);
        getContentPane().add(lblTile1);
        lblTile1.setBounds(184, 324, 30, 30);

        lblP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Player 2.png"))); // NOI18N
        getContentPane().add(lblP2);
        lblP2.setBounds(150, 320, 28, 28);

        lblP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Player 1.png"))); // NOI18N
        getContentPane().add(lblP1);
        lblP1.setBounds(110, 310, 28, 28);
        getContentPane().add(lblDiceResult);
        lblDiceResult.setBounds(570, 260, 70, 50);

        btnDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/roll (1).png"))); // NOI18N
        btnDice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDice.setBorderPainted(false);
        btnDice.setContentAreaFilled(false);
        btnDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiceActionPerformed(evt);
            }
        });
        getContentPane().add(btnDice);
        btnDice.setBounds(560, 320, 92, 40);

        txtPlayerTurn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        txtPlayerTurn.setForeground(new java.awt.Color(0, 0, 0));
        txtPlayerTurn.setBorder(null);
        getContentPane().add(txtPlayerTurn);
        txtPlayerTurn.setBounds(570, 225, 70, 20);

        lblPlayerTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/turn_2 (1).png"))); // NOI18N
        getContentPane().add(lblPlayerTurn);
        lblPlayerTurn.setBounds(560, 220, 90, 30);

        txtP2Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtP2Name.setForeground(new java.awt.Color(0, 0, 0));
        txtP2Name.setBorder(null);
        getContentPane().add(txtP2Name);
        txtP2Name.setBounds(80, 208, 70, 20);

        txtP1Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtP1Name.setForeground(new java.awt.Color(255, 255, 255));
        txtP1Name.setBorder(null);
        getContentPane().add(txtP1Name);
        txtP1Name.setBounds(80, 113, 70, 20);

        txtP2Moves.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtP2Moves.setText("0");
        txtP2Moves.setBorder(null);
        getContentPane().add(txtP2Moves);
        txtP2Moves.setBounds(78, 237, 30, 20);

        txtP1Moves.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtP1Moves.setText("0");
        txtP1Moves.setBorder(null);
        getContentPane().add(txtP1Moves);
        txtP1Moves.setBounds(78, 144, 30, 20);
        getContentPane().add(lblDisplayScore1);
        lblDisplayScore1.setBounds(630, 40, 80, 30);

        lblDisplayScoreP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/inside.png"))); // NOI18N
        getContentPane().add(lblDisplayScoreP1);
        lblDisplayScoreP1.setBounds(540, 30, 210, 50);
        getContentPane().add(lblDisplayScore2);
        lblDisplayScore2.setBounds(630, 90, 90, 30);

        lblDisplayScoreP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/display_player.png"))); // NOI18N
        getContentPane().add(lblDisplayScoreP2);
        lblDisplayScoreP2.setBounds(540, 80, 200, 50);

        lblBoard.setDisplayedMnemonic('B');
        lblBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Game Play (2).png"))); // NOI18N
        lblBoard.setMaximumSize(new java.awt.Dimension(749, 369));
        lblBoard.setMinimumSize(new java.awt.Dimension(749, 369));
        lblBoard.setPreferredSize(new java.awt.Dimension(749, 369));
        getContentPane().add(lblBoard);
        lblBoard.setBounds(0, 0, 750, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int turn=1;
    int player1Pos = 0;
    int player2Pos = 0;
    int p1Turn =0;
    int p2Turn =0;
    
    
    
    private void btnDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiceActionPerformed
         //DiceManager diceManager = new DiceManager(lblDiceResult);
         GameDynamics.DiceManager diceManager = new GameDynamics.DiceManager(lblDiceResult);
        
        if(turn % 2 == 1){
            int diceResult = roll();
            diceManager.updateDiceImage(diceResult);
            player1Pos += diceResult;
            //lblDiceResult.setText(""+diceResult);
            txtPlayerTurn.setForeground(Color.WHITE);
            txtPlayerTurn.setText(pn1.getP1Name() + "'s Turn");
            String question = questionAnswerInitializer[player1Pos].getQuestion();
            String answer = JOptionPane.showInputDialog(null, question);
                if (answer == null || !questionAnswerInitializer[player1Pos].checkAnswer(answer)) {
                    player1Pos -= diceResult;
                    JOptionPane.showMessageDialog(null, "Incorrect answer! You cannot move.", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    lblPlayerTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/turn_1 (1).png")));
                    txtPlayerTurn.setForeground(Color.BLACK);
                    if(player1Score <= 0)
                    {
                        player1Score = 0;
                    }
                     else
                    {
                        player1Score -= 5;
                    }
                    txtPlayerTurn.setText(pn1.getP2Name() + "'s Turn");
                } else {
                    playerMovement.movePlayer(player1Pos-1, true);
                    lblPlayerTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/turn_1 (1).png")));
                    txtPlayerTurn.setForeground(Color.BLACK);
                    txtPlayerTurn.setText(pn1.getP2Name() + "'s Turn");
                    if(player1Score > 20)
                    {
                        player1Score += 20;
                    }
                    else
                    {
                        player1Score += 10;
                    }
                    
                    Leaderboard.addEntry(pn1.getP1Name(), player1Score); 
                }
                p1Turn++;
                txtP1Moves.setText(""+p1Turn);
                turn++;
            
         }else{
            int diceResult2 = roll();
            diceManager.updateDiceImage(diceResult2);
            player2Pos += diceResult2;
            //lblDiceResult.setText(""+diceResult2);
            lblPlayerTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/turn_1 (1).png")));
            txtPlayerTurn.setForeground(Color.BLACK);
            txtPlayerTurn.setText(pn1.getP2Name() + "'s Turn");
            String question = questionAnswerInitializer[player2Pos].getQuestion();
            String answer = JOptionPane.showInputDialog(null, question);
                if (answer == null || !questionAnswerInitializer[player2Pos].checkAnswer(answer)) {
                    player2Pos -= diceResult2;
                    JOptionPane.showMessageDialog(null, "Incorrect answer! You cannot move.", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    lblPlayerTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/turn_2 (1).png")));
                    txtPlayerTurn.setForeground(Color.WHITE);
                    if(player2Score <= 0)
                    {
                        player2Score = 0;
                    }
                     else
                    {
                        player2Score -= 5;
                    }
                    txtPlayerTurn.setText(pn1.getP1Name() + "'s Turn");
                } else {
                    playerMovement.movePlayer(player2Pos-1, false);
                    lblPlayerTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/braindrainlearninggame/Images/turn_2 (1).png")));
                    txtPlayerTurn.setForeground(Color.WHITE);
                    txtPlayerTurn.setText(pn1.getP1Name() + "'s Turn");
                    if(player2Score > 20)
                    {
                        player2Score += 20;
                    }
                    else
                    {
                        player2Score += 10;
                    }
                    Leaderboard.addEntry(pn1.getP2Name(), player2Score); 
                }
                p2Turn++;
                txtP2Moves.setText(""+p2Turn);
                turn++;
            
        }
        lblDisplayScore1.setText(" " + player1Score);
        lblDisplayScore2.setText(" " + player2Score);
    }//GEN-LAST:event_btnDiceActionPerformed
    
    

    @Override
    public int roll(){
        Random random = new Random();
        int diceResult = random.nextInt(6) + 1; 
        
        return diceResult;
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
            java.util.logging.Logger.getLogger(BrainDrainLearningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrainDrainLearningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrainDrainLearningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrainDrainLearningGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                //new BrainDrainLearningGame(pn1).setVisible(true);
                new Home().setVisible(true);
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDice;
    private javax.swing.JLabel lblBoard;
    private javax.swing.JLabel lblDiceResult;
    private javax.swing.JLabel lblDisplayScore1;
    private javax.swing.JLabel lblDisplayScore2;
    private javax.swing.JLabel lblDisplayScoreP1;
    private javax.swing.JLabel lblDisplayScoreP2;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblPlayerTurn;
    private javax.swing.JLabel lblTile1;
    private javax.swing.JLabel lblTile10;
    private javax.swing.JLabel lblTile100;
    private javax.swing.JLabel lblTile11;
    private javax.swing.JLabel lblTile12;
    private javax.swing.JLabel lblTile13;
    private javax.swing.JLabel lblTile14;
    private javax.swing.JLabel lblTile15;
    private javax.swing.JLabel lblTile16;
    private javax.swing.JLabel lblTile17;
    private javax.swing.JLabel lblTile18;
    private javax.swing.JLabel lblTile19;
    private javax.swing.JLabel lblTile2;
    private javax.swing.JLabel lblTile20;
    private javax.swing.JLabel lblTile21;
    private javax.swing.JLabel lblTile22;
    private javax.swing.JLabel lblTile23;
    private javax.swing.JLabel lblTile24;
    private javax.swing.JLabel lblTile25;
    private javax.swing.JLabel lblTile26;
    private javax.swing.JLabel lblTile27;
    private javax.swing.JLabel lblTile28;
    private javax.swing.JLabel lblTile29;
    private javax.swing.JLabel lblTile3;
    private javax.swing.JLabel lblTile30;
    private javax.swing.JLabel lblTile31;
    private javax.swing.JLabel lblTile32;
    private javax.swing.JLabel lblTile33;
    private javax.swing.JLabel lblTile34;
    private javax.swing.JLabel lblTile35;
    private javax.swing.JLabel lblTile36;
    private javax.swing.JLabel lblTile37;
    private javax.swing.JLabel lblTile38;
    private javax.swing.JLabel lblTile39;
    private javax.swing.JLabel lblTile4;
    private javax.swing.JLabel lblTile40;
    private javax.swing.JLabel lblTile41;
    private javax.swing.JLabel lblTile42;
    private javax.swing.JLabel lblTile43;
    private javax.swing.JLabel lblTile44;
    private javax.swing.JLabel lblTile45;
    private javax.swing.JLabel lblTile46;
    private javax.swing.JLabel lblTile47;
    private javax.swing.JLabel lblTile48;
    private javax.swing.JLabel lblTile49;
    private javax.swing.JLabel lblTile5;
    private javax.swing.JLabel lblTile50;
    private javax.swing.JLabel lblTile51;
    private javax.swing.JLabel lblTile52;
    private javax.swing.JLabel lblTile53;
    private javax.swing.JLabel lblTile54;
    private javax.swing.JLabel lblTile55;
    private javax.swing.JLabel lblTile56;
    private javax.swing.JLabel lblTile57;
    private javax.swing.JLabel lblTile58;
    private javax.swing.JLabel lblTile59;
    private javax.swing.JLabel lblTile6;
    private javax.swing.JLabel lblTile60;
    private javax.swing.JLabel lblTile61;
    private javax.swing.JLabel lblTile62;
    private javax.swing.JLabel lblTile63;
    private javax.swing.JLabel lblTile64;
    private javax.swing.JLabel lblTile65;
    private javax.swing.JLabel lblTile66;
    private javax.swing.JLabel lblTile67;
    private javax.swing.JLabel lblTile68;
    private javax.swing.JLabel lblTile69;
    private javax.swing.JLabel lblTile7;
    private javax.swing.JLabel lblTile70;
    private javax.swing.JLabel lblTile71;
    private javax.swing.JLabel lblTile72;
    private javax.swing.JLabel lblTile73;
    private javax.swing.JLabel lblTile74;
    private javax.swing.JLabel lblTile75;
    private javax.swing.JLabel lblTile76;
    private javax.swing.JLabel lblTile77;
    private javax.swing.JLabel lblTile78;
    private javax.swing.JLabel lblTile79;
    private javax.swing.JLabel lblTile8;
    private javax.swing.JLabel lblTile80;
    private javax.swing.JLabel lblTile81;
    private javax.swing.JLabel lblTile82;
    private javax.swing.JLabel lblTile83;
    private javax.swing.JLabel lblTile84;
    private javax.swing.JLabel lblTile85;
    private javax.swing.JLabel lblTile86;
    private javax.swing.JLabel lblTile87;
    private javax.swing.JLabel lblTile88;
    private javax.swing.JLabel lblTile89;
    private javax.swing.JLabel lblTile9;
    private javax.swing.JLabel lblTile90;
    private javax.swing.JLabel lblTile91;
    private javax.swing.JLabel lblTile92;
    private javax.swing.JLabel lblTile93;
    private javax.swing.JLabel lblTile94;
    private javax.swing.JLabel lblTile95;
    private javax.swing.JLabel lblTile96;
    private javax.swing.JLabel lblTile97;
    private javax.swing.JLabel lblTile98;
    private javax.swing.JLabel lblTile99;
    private javax.swing.JTextField txtP1Moves;
    private javax.swing.JTextField txtP1Name;
    private javax.swing.JTextField txtP2Moves;
    private javax.swing.JTextField txtP2Name;
    private javax.swing.JTextField txtPlayerTurn;
    // End of variables declaration//GEN-END:variables
}
