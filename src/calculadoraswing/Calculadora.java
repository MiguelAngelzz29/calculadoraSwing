/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoraswing;

import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author migue
 */
public class Calculadora extends javax.swing.JFrame {

    public JPanel jpanel;
    public double numero;
    public char operador;
    public char signo;
    public boolean pulsarOperador = false;
    public boolean operacion = false;
    public boolean primeraOperacion = true;
    public boolean hayDecimal = false;
    Modelo modelo = new Modelo();

    /**
     * Creates new form Calculadora
     */

    public Calculadora() {

        initComponents();
        keyBidings();
        jTextField1.setEditable(false);

    }
    ComponentAdapter resizeListener = new ComponentAdapter() {
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButtonSumar = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(22, 29, 0, 43);
        jPanel1.add(jTextField1, gridBagConstraints);

        jButtonSumar.setText("+");
        jButtonSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSumar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 29, 43);
        jPanel1.add(jButtonSumar, gridBagConstraints);

        jButtonDecimal.setText(",");
        jButtonDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDecimal(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 29, 0);
        jPanel1.add(jButtonDecimal, gridBagConstraints);

        jButton0.setText("0");
        jButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton0(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 29, 29, 0);
        jPanel1.add(jButton0, gridBagConstraints);

        jButtonRestar.setText("-");
        jButtonRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRestar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 43);
        jPanel1.add(jButtonRestar, gridBagConstraints);

        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(jButton3, gridBagConstraints);

        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(jButton2, gridBagConstraints);

        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 29, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jButtonMultiplicar.setText("x");
        jButtonMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMultiplicar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 43);
        jPanel1.add(jButtonMultiplicar, gridBagConstraints);

        jButton6.setText("6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton6(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(jButton6, gridBagConstraints);

        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel1.add(jButton5, gridBagConstraints);

        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 29, 0, 0);
        jPanel1.add(jButton4, gridBagConstraints);

        jButtonDividir.setText("/");
        jButtonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDividir(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 43);
        jPanel1.add(jButtonDividir, gridBagConstraints);

        jButton9.setText("9");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton9(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        jPanel1.add(jButton9, gridBagConstraints);

        jButton8.setText("8");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton8(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        jPanel1.add(jButton8, gridBagConstraints);

        jButton7.setText("7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton7(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 29, 0, 0);
        jPanel1.add(jButton7, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonDecimal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDecimal
        if (!hayDecimal) {
            if (jTextField1.getText().isEmpty()) {
                insertarNumero("0.");
                hayDecimal = true;
            } else {
                insertarNumero(".");
                hayDecimal = true;
            }
        }
    }//GEN-LAST:event_botonDecimal

    private void botonSumar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumar
        pulsarOperador = true;
        signo = '+';
        hacerOperacion();
        this.operador = '+';
    }//GEN-LAST:event_botonSumar

    private void boton0(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton0
        insertarNumero("0");

    }//GEN-LAST:event_boton0

    private void botonRestar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestar
        pulsarOperador = true;
        this.signo = '-';
        hacerOperacion();
        this.operador = '-';
    }//GEN-LAST:event_botonRestar

    private void boton3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3
        insertarNumero("3");
    }//GEN-LAST:event_boton3

    private void boton2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2
        insertarNumero("2");

    }//GEN-LAST:event_boton2

    private void boton1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1
        insertarNumero("1");
    }//GEN-LAST:event_boton1

    private void botonMultiplicar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMultiplicar
        pulsarOperador = true;
        signo = '*';
        hacerOperacion();
        this.operador = '*';
    }//GEN-LAST:event_botonMultiplicar

    private void boton6(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6
        insertarNumero("6");
    }//GEN-LAST:event_boton6

    private void boton5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5
        insertarNumero("5");
    }//GEN-LAST:event_boton5

    private void boton4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4
        insertarNumero("4");
    }//GEN-LAST:event_boton4

    private void botonDividir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDividir
        pulsarOperador = true;
        signo = '/';
        hacerOperacion();
        operador = '/';
    }//GEN-LAST:event_botonDividir

    private void boton9(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9
        insertarNumero("9");
    }//GEN-LAST:event_boton9

    private void boton8(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8
        insertarNumero("8");
    }//GEN-LAST:event_boton8

    private void boton7(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7
        insertarNumero("7");
    }//GEN-LAST:event_boton7

    private void insertarNumero(String numeros) {

        if (pulsarOperador) {
            jTextField1.setText("");
            pulsarOperador = false;
        }

        jTextField1.setText(jTextField1.getText() + numeros);
        numero = Double.parseDouble(jTextField1.getText());

    }

    private void hacerOperacion() {

        if (primeraOperacion) {
            modelo.setResultado(Double.parseDouble(this.jTextField1.getText()));
            primeraOperacion = false;
            numero = 0;
        } else {
            switch (this.operador) {

                case '+':
                    this.jTextField1.setText(Double.toString(modelo.sumar(numero)));
                    operacion = true;
                    pulsarOperador = true;
                    hayDecimal = false;
                    break;
                case '-':
                    this.jTextField1.setText(Double.toString(modelo.restar(numero)));
                    operacion = true;
                    pulsarOperador = true;
                    hayDecimal = false;
                    break;
                case '*':
                    this.jTextField1.setText(Double.toString(modelo.multiplicar(numero)));
                    operacion = true;
                    pulsarOperador = true;
                    hayDecimal = false;
                    break;
                case '/':
                    this.jTextField1.setText(Double.toString(modelo.dividir(numero)));
                    operacion = true;
                    pulsarOperador = true;
                    hayDecimal = false;
                    break;
                default:
                    if (this.signo == '+') {
                        this.jTextField1.setText(Double.toString(modelo.sumar(numero)));
                        modelo.setResultado(Double.parseDouble(this.jTextField1.getText()));
                        hayDecimal = false;
                    } else if (this.signo == '-') {
                        this.jTextField1.setText(Double.toString(modelo.restar(numero)));
                        modelo.setResultado(Double.parseDouble(this.jTextField1.getText()));
                        hayDecimal = false;
                    } else if (this.signo == '*') {
                        this.jTextField1.setText(Double.toString(modelo.multiplicar(numero)));
                        modelo.setResultado(Double.parseDouble(this.jTextField1.getText()));
                        hayDecimal = false;
                    } else if (this.signo == '/') {
                        this.jTextField1.setText(Double.toString(modelo.dividir(numero)));
                        modelo.setResultado(Double.parseDouble(this.jTextField1.getText()));
                        hayDecimal = false;
                    }
            }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);

            }
        });
    }

    //KEYBIDINGS
    public void keyBidings() {
        this.jButton0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("0"), "0");
        this.jButton0.getActionMap().put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton0.doClick();
                insertarNumero("0");
            }
        });
        this.jButton0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0), "0");
        this.jButton0.getActionMap().put(numero, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton0.doClick();
                insertarNumero("0");
            }
        });

        this.jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("1"), "1");
        this.jButton1.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton1.doClick();
                insertarNumero("1");
            }
        });
        this.jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0), "1");
        this.jButton1.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton1.doClick();
                insertarNumero("1");
            }
        });

        this.jButton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("2"), "2");
        this.jButton2.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton2.doClick();
                insertarNumero("2");
            }
        });
        this.jButton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0), "2");
        this.jButton2.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton2.doClick();
                insertarNumero("2");
            }
        });

        this.jButton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("3"), "3");
        this.jButton3.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton3.doClick();
                insertarNumero("3");
            }
        });
        this.jButton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0), "3");
        this.jButton3.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton3.doClick();
                insertarNumero("3");
            }
        });

        this.jButton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("4"), "4");
        this.jButton4.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton4.doClick();
                insertarNumero("4");
            }
        });
        this.jButton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0), "4");
        this.jButton4.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton4.doClick();
                insertarNumero("4");
            }
        });

        this.jButton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("5"), "5");
        this.jButton5.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton5.doClick();
                insertarNumero("5");
            }
        });
        this.jButton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0), "5");
        this.jButton5.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton5.doClick();
                insertarNumero("5");
            }
        });

        this.jButton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("6"), "6");
        this.jButton6.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton6.doClick();
                insertarNumero("6");;
            }
        });
        this.jButton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0), "6");
        this.jButton6.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton6.doClick();
                insertarNumero("6");
            }
        });
        this.jButton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("7"), "7");
        this.jButton7.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton7.doClick();
                insertarNumero("7");
            }
        });
        this.jButton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0), "7");
        this.jButton7.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton7.doClick();
                insertarNumero("7");
            }
        });
        this.jButton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("8"), "8");
        this.jButton8.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton8.doClick();
                insertarNumero("8");
            }
        });
        this.jButton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0), "8");
        this.jButton0.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton8.doClick();
                insertarNumero("8");
            }
        });

        this.jButton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("9"), "9");
        this.jButton9.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton9.doClick();
                insertarNumero("9");
            }
        });
        this.jButton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0), "9");
        this.jButton9.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton9.doClick();
                insertarNumero("9");
            }
        });

        this.jButtonSumar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "+");
        this.jButtonSumar.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonSumar.doClick();
                pulsarOperador = true;
                signo = '+';
                hacerOperacion();
                operador = '+';

            }
        });
        this.jButtonSumar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "+");
        this.jButtonSumar.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonSumar.doClick();
                pulsarOperador = true;
                signo = '+';
                hacerOperacion();
                operador = '+';
            }
        });
        this.jButtonRestar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "-");
        this.jButtonRestar.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonRestar.doClick();
                pulsarOperador = true;
                signo = '-';
                hacerOperacion();
                operador = '-';
            }
        });
        this.jButtonRestar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "-");
        this.jButtonRestar.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonRestar.doClick();
                pulsarOperador = true;
                signo = '-';
                hacerOperacion();
                operador = '-';
            }
        });
        this.jButtonMultiplicar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "*");
        this.jButtonMultiplicar.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonMultiplicar.doClick();
                pulsarOperador = true;
                signo = '*';
                hacerOperacion();
                operador = '*';
            }
        });
        this.jButtonMultiplicar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, InputEvent.SHIFT_DOWN_MASK), "*");
        this.jButtonMultiplicar.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonMultiplicar.doClick();
                pulsarOperador = true;
                signo = '*';
                hacerOperacion();
                operador = '*';
            }
        });
        this.jButtonDividir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "/");
        this.jButtonDividir.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonDividir.doClick();
                pulsarOperador = true;
                signo = '/';
                hacerOperacion();
                operador = '/';
            }
        });
        this.jButtonDividir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_7, InputEvent.SHIFT_DOWN_MASK), "/");
        this.jButtonDividir.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonDividir.doClick();
                pulsarOperador = true;
                signo = '/';
                hacerOperacion();
                operador = '/';
            }
        });
        this.jButtonDecimal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), ".");
        this.jButtonDecimal.getActionMap().put(".", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonDecimal.doClick();
                if (!hayDecimal) {
                    if (jTextField1.getText().isEmpty()) {
                        insertarNumero("0.");
                        hayDecimal = true;
                    } else {
                        insertarNumero(".");
                        hayDecimal = true;
                    }
                }

            }
        });
        this.jButtonDecimal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, 0), ".");
        this.jButtonDecimal.getActionMap().put(".", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonDecimal.doClick();
                if (!hayDecimal) {
                    if (jTextField1.getText().isEmpty()) {
                        insertarNumero("0.");
                        hayDecimal = true;
                    } else {
                        insertarNumero(".");
                        hayDecimal = true;
                    }
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
