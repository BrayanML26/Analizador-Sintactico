/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package analizador;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author braya
 */
public class Frm1 extends javax.swing.JFrame {

    /**
     * Creates new form Frm1
     */
    public Frm1() {
        initComponents();
        
        // Establece la ventana en el centro de la pantalla cuando se abre
        this.setLocationRelativeTo(null);
        
        // Hace que el área de texto de resultados ("txtResult") no sea editable
        txtResultL.setEditable(false);
        txtResultS.setEditable(false);
    }
    
    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtInput.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "   Linea " + cont + "\t\tToken\n\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtResultL.setText(resultado);
                return;
            }
            switch (token) {
                case Salto_Linea:
                    cont++;
                    resultado += "-Salto de Linea-\t " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  -Comillas-\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  -Tipo de dato-\t" + lexer.lexeme + "\n";
                    break;
                case Tipo_dato:
                    resultado += "  -Tipo de dato-\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  -Reservada if-\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  -Reservada else-\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  -Reservada do-\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  -Reservada while-\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  -Reservada while-\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  -Operador igual-\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  -Operador suma-\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  -Operador resta-\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  -Operador multiplicacion-\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  -Operador division-\t" + lexer.lexeme + "\n";
                    break;
                case Operador_logico:
                    resultado += "  -Operador logico-\t" + lexer.lexeme + "\n";
                    break;
                case Operador_incremento:
                    resultado += "  -Operador incremento-\t" + lexer.lexeme + "\n";
                    break;
                case Operador_relacional:
                    resultado += "  -Operador relacional-\t" + lexer.lexeme + "\n";
                    break;
                case Operador_atribucion:
                    resultado += "  -Operador atribucion-\t" + lexer.lexeme + "\n";
                    break;
                case Operador_booleano:
                    resultado += "  -Operador booleano-\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_abierto:
                    resultado += "  -Parentesis de apertura-\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_cerrado:
                    resultado += "  -Parentesis de cierre-\t" + lexer.lexeme + "\n";
                    break;
                case Llave_abierta:
                    resultado += "  -Llave de apertura-\t" + lexer.lexeme + "\n";
                    break;
                case Llave_cerrada:
                    resultado += "  -Llave de cierre-\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_abierto:
                    resultado += "  -Corchete de apertura-\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_cerrado:
                    resultado += "  -Corchete de cierre-\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  -Reservada main-\t" + lexer.lexeme + "\n";
                    break;
                case Punto_coma:
                    resultado += "  -Punto y coma-\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  -Identificador-\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  -Numero-\t\t" + lexer.lexeme + "\n";
                    break;
                case NumeroDecimal:
                    resultado += "  -NumeroDecimal-\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  -Simbolo no definido-\n";
                    break;
                default:
                    resultado += "   " + lexer.lexeme + " \n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAnalyzeL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultL = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        btnCleanL = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultS = new javax.swing.JTextArea();
        btnAnalyzeS = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnAnalyzeL.setBackground(new java.awt.Color(51, 51, 51));
        btnAnalyzeL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAnalyzeL.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalyzeL.setText("ANALYZE");
        btnAnalyzeL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnalyzeL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeLActionPerformed(evt);
            }
        });

        txtResultL.setBackground(new java.awt.Color(204, 204, 204));
        txtResultL.setColumns(20);
        txtResultL.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtResultL.setRows(5);
        jScrollPane1.setViewportView(txtResultL);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        jLabel1.setText("Lexical Analyzer");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Result Lexical:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BRAYAN MARTINEZ, 1-20-1136");

        txtInput.setColumns(20);
        txtInput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtInput.setRows(5);
        jScrollPane2.setViewportView(txtInput);

        btnCleanL.setBackground(new java.awt.Color(153, 153, 153));
        btnCleanL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCleanL.setForeground(new java.awt.Color(255, 255, 255));
        btnCleanL.setText("CLEAN");
        btnCleanL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCleanL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCleanL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanLActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("EXIT");
        btnClose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Input:");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        jLabel6.setText("Syntactic Analyzer");

        txtResultS.setBackground(new java.awt.Color(204, 204, 204));
        txtResultS.setColumns(20);
        txtResultS.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtResultS.setRows(5);
        jScrollPane3.setViewportView(txtResultS);

        btnAnalyzeS.setBackground(new java.awt.Color(51, 51, 51));
        btnAnalyzeS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAnalyzeS.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalyzeS.setText("ANALYZE");
        btnAnalyzeS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnalyzeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeSActionPerformed(evt);
            }
        });

        btnOpenFile.setBackground(new java.awt.Color(102, 102, 102));
        btnOpenFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOpenFile.setForeground(new java.awt.Color(255, 255, 255));
        btnOpenFile.setText("OPEN FILE");
        btnOpenFile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Result Syntactic:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnCleanL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(btnAnalyzeL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnalyzeS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnOpenFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCleanL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnalyzeL)
                            .addComponent(jLabel7)
                            .addComponent(btnAnalyzeS))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose)
                    .addComponent(jLabel4)))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalyzeLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeLActionPerformed
         try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Frm1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalyzeLActionPerformed

    private void btnCleanLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanLActionPerformed
        // Limpiar el campo de texto de entrada ("txtInput") y el área de resultados ("txtResult")
        txtInput.setText("");
        txtResultL.setText("");
        txtResultS.setText("");
    }//GEN-LAST:event_btnCleanLActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAnalyzeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeSActionPerformed
        // TODO add your handling code here:
        String ST = txtInput.getText();
        Sintax s = new Sintax(new analizador.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            txtResultS.setText("Analisis realizado correctamente");
            txtResultS.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtResultS.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtResultS.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalyzeSActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtInput.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frm1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frm1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

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
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyzeL;
    private javax.swing.JButton btnAnalyzeS;
    private javax.swing.JButton btnCleanL;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtResultL;
    private javax.swing.JTextArea txtResultS;
    // End of variables declaration//GEN-END:variables
}
