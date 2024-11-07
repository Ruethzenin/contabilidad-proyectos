package igu;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Pantalla2 extends javax.swing.JFrame {

    public Pantalla2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPantalla2 = new javax.swing.JPanel();
        BRegresar = new javax.swing.JButton();
        txtInstrucciones = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JLabel();
        txtVentas = new javax.swing.JLabel();
        txtCostoVentas = new javax.swing.JLabel();
        txtGastosVentas = new javax.swing.JLabel();
        txtGastosAlma = new javax.swing.JLabel();
        txtGastosFin = new javax.swing.JLabel();
        txtProFin = new javax.swing.JLabel();
        txtOtrosGastos = new javax.swing.JLabel();
        txtOtrosPro = new javax.swing.JLabel();
        txtFirmaElab = new javax.swing.JLabel();
        txtFirmaAuto = new javax.swing.JLabel();
        jtfNombreEmpresa = new javax.swing.JTextField();
        jtfPeriodoConta = new javax.swing.JTextField();
        jtfVentas = new javax.swing.JTextField();
        jtfFirmaAuto = new javax.swing.JTextField();
        jtfGastosFin = new javax.swing.JTextField();
        jtfGastosAdmo = new javax.swing.JTextField();
        jtfCostoVentas = new javax.swing.JTextField();
        jtfGastosVentas = new javax.swing.JTextField();
        jtfFirmaElab = new javax.swing.JTextField();
        jtfOtrosPro = new javax.swing.JTextField();
        jtfProFin = new javax.swing.JTextField();
        jtfOtrosGastos = new javax.swing.JTextField();
        BGenerarEstado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 515));

        panelPantalla2.setBackground(new java.awt.Color(51, 51, 51));
        panelPantalla2.setMinimumSize(new java.awt.Dimension(600, 515));

        BRegresar.setBackground(new java.awt.Color(255, 51, 51));
        BRegresar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        BRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BRegresar.setText("Regresar");
        BRegresar.setBorder(null);
        BRegresar.setFocusable(false);
        BRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegresarActionPerformed(evt);
            }
        });

        txtInstrucciones.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        txtInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        txtInstrucciones.setText("Ingresa la información solicitada");

        txtNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre de la empresa:");

        txtPeriodo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        txtPeriodo.setText("Periodo contable del: ");

        txtVentas.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtVentas.setForeground(new java.awt.Color(255, 255, 255));
        txtVentas.setText("Ventas:");

        txtCostoVentas.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtCostoVentas.setForeground(new java.awt.Color(255, 255, 255));
        txtCostoVentas.setText("Costo de ventas:");

        txtGastosVentas.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtGastosVentas.setForeground(new java.awt.Color(255, 255, 255));
        txtGastosVentas.setText("Gastos de ventas:");

        txtGastosAlma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtGastosAlma.setForeground(new java.awt.Color(255, 255, 255));
        txtGastosAlma.setText("Gastos de alministración:");

        txtGastosFin.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtGastosFin.setForeground(new java.awt.Color(255, 255, 255));
        txtGastosFin.setText("Gastos financieros:");

        txtProFin.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtProFin.setForeground(new java.awt.Color(255, 255, 255));
        txtProFin.setText("Productos financieros:");

        txtOtrosGastos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtOtrosGastos.setForeground(new java.awt.Color(255, 255, 255));
        txtOtrosGastos.setText("Otros gastos:");

        txtOtrosPro.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtOtrosPro.setForeground(new java.awt.Color(255, 255, 255));
        txtOtrosPro.setText("Otros productos:");

        txtFirmaElab.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtFirmaElab.setForeground(new java.awt.Color(255, 255, 255));
        txtFirmaElab.setText("Firma de elaboración:");

        txtFirmaAuto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtFirmaAuto.setForeground(new java.awt.Color(255, 255, 255));
        txtFirmaAuto.setText("Firma de autorización:");

        jtfVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfVentasKeyTyped(evt);
            }
        });

        jtfGastosFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGastosFinKeyTyped(evt);
            }
        });

        jtfGastosAdmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGastosAdmoKeyTyped(evt);
            }
        });

        jtfCostoVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCostoVentasKeyTyped(evt);
            }
        });

        jtfGastosVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGastosVentasKeyTyped(evt);
            }
        });

        jtfOtrosPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfOtrosProKeyTyped(evt);
            }
        });

        jtfProFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfProFinKeyTyped(evt);
            }
        });

        jtfOtrosGastos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfOtrosGastosKeyTyped(evt);
            }
        });

        BGenerarEstado.setBackground(new java.awt.Color(255, 51, 51));
        BGenerarEstado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        BGenerarEstado.setForeground(new java.awt.Color(255, 255, 255));
        BGenerarEstado.setText("Generar Estado de Resultados");
        BGenerarEstado.setBorder(null);
        BGenerarEstado.setFocusable(false);
        BGenerarEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGenerarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGenerarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPantalla2Layout = new javax.swing.GroupLayout(panelPantalla2);
        panelPantalla2.setLayout(panelPantalla2Layout);
        panelPantalla2Layout.setHorizontalGroup(
            panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPantalla2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstrucciones)
                    .addGroup(panelPantalla2Layout.createSequentialGroup()
                        .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtPeriodo))
                        .addGap(37, 37, 37)
                        .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeriodoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtVentas)
                    .addComponent(txtCostoVentas)
                    .addComponent(txtGastosVentas)
                    .addGroup(panelPantalla2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCostoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfGastosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelPantalla2Layout.createSequentialGroup()
                            .addComponent(txtFirmaAuto)
                            .addGap(44, 44, 44)
                            .addComponent(jtfFirmaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPantalla2Layout.createSequentialGroup()
                            .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGastosAlma)
                                .addComponent(txtGastosFin)
                                .addComponent(txtProFin)
                                .addComponent(txtOtrosGastos)
                                .addComponent(txtOtrosPro)
                                .addComponent(txtFirmaElab))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfGastosFin)
                                .addComponent(jtfGastosAdmo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfProFin)
                                .addComponent(jtfOtrosGastos)
                                .addComponent(jtfOtrosPro)
                                .addComponent(jtfFirmaElab, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPantalla2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BGenerarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        panelPantalla2Layout.setVerticalGroup(
            panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPantalla2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BRegresar)
                .addGap(18, 18, 18)
                .addComponent(txtInstrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(jtfNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeriodo)
                    .addComponent(jtfPeriodoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVentas)
                    .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostoVentas)
                    .addComponent(jtfCostoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfGastosVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGastosVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGastosAlma)
                    .addComponent(jtfGastosAdmo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGastosFin)
                    .addComponent(jtfGastosFin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProFin)
                    .addComponent(jtfProFin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOtrosGastos)
                    .addComponent(jtfOtrosGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOtrosPro)
                    .addComponent(jtfOtrosPro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirmaElab)
                    .addComponent(jtfFirmaElab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirmaAuto)
                    .addComponent(jtfFirmaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BGenerarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegresarActionPerformed
        Pantalla p = new Pantalla();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BRegresarActionPerformed

    private void BGenerarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGenerarEstadoActionPerformed
        if(jtfFirmaElab.getText().isEmpty() || jtfVentas.getText().isEmpty() || jtfGastosFin.getText().isEmpty() || jtfPeriodoConta.getText().isEmpty() || jtfProFin.getText().isEmpty() || jtfOtrosPro.getText().isEmpty() || jtfOtrosGastos.getText().isEmpty() || jtfGastosVentas.getText().isEmpty() || jtfVentas.getText().isEmpty() || jtfGastosAdmo.getText().isEmpty() || jtfCostoVentas.getText().isEmpty() || jtfFirmaAuto.getText().isEmpty() ){   
            JOptionPane.showMessageDialog(this,"Por favor no dejes campos vacios");
        }
        else{ 
            setResultados();
        }
    }//GEN-LAST:event_BGenerarEstadoActionPerformed

    private void jtfVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfVentasKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
    }//GEN-LAST:event_jtfVentasKeyTyped

    private void jtfCostoVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCostoVentasKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
    }//GEN-LAST:event_jtfCostoVentasKeyTyped

    private void jtfGastosVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGastosVentasKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
    }//GEN-LAST:event_jtfGastosVentasKeyTyped

    private void jtfGastosAdmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGastosAdmoKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
    }//GEN-LAST:event_jtfGastosAdmoKeyTyped

    private void jtfGastosFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGastosFinKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
            }//GEN-LAST:event_jtfGastosFinKeyTyped

    private void jtfProFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfProFinKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
            }//GEN-LAST:event_jtfProFinKeyTyped

    private void jtfOtrosGastosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfOtrosGastosKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
            }//GEN-LAST:event_jtfOtrosGastosKeyTyped

    private void jtfOtrosProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfOtrosProKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if (!numero){
            evt.consume();
        }
            }//GEN-LAST:event_jtfOtrosProKeyTyped
    
    private void setResultados(){
        Pantalla3 p = new Pantalla3();
        p.setTitulo(jtfNombreEmpresa.getText());
        p.setFecha(jtfPeriodoConta.getText());
        p.setVentas(jtfVentas.getText());
        p.setCdv(jtfCostoVentas.getText());
        p.setUtilidadBruta(Double.toString(getUtilidadBruta()));
        p.setGv(jtfGastosVentas.getText());
        p.setGa(jtfGastosAdmo.getText());
        p.setUtilidadOp(Double.toString(getUtilidadOp()));
        p.setGF(jtfGastosFin.getText());
        p.setPF(jtfProFin.getText());
        p.setOG(jtfOtrosGastos.getText());
        p.setOP(jtfOtrosPro.getText());
        p.setUtilidadAI(Double.toString(getUtilidadAI()));
        p.setISR(Double.toString(getISR()));
        p.setPTU(Double.toString(getPTU()));
        p.setUtilidadE(Double.toString(getUtilidadE()));
        p.setFA(jtfFirmaAuto.getText());
        p.setFE(jtfFirmaElab.getText());
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    this.dispose();
    }
    
    private double getUtilidadBruta(){
    return obt(jtfVentas)-obt(jtfCostoVentas);}
   
    private double getUtilidadOp(){
    return getUtilidadBruta()- obt(jtfGastosVentas)-obt(jtfGastosAdmo);}
    
    private double getUtilidadAI(){
    return getUtilidadOp()-obt(jtfGastosFin)-obt(jtfOtrosGastos)+obt(jtfProFin)+obt(jtfOtrosPro);}
    
    private double getUtilidadE(){
    return getUtilidadAI()-getISR()-getPTU();}
    
    private double getISR(){
    return getUtilidadAI()*.3;}
    
    private double getPTU(){
    return getUtilidadAI()*.1;}
    
    private double obt(JTextField jtf){
    return Double.parseDouble(jtf.getText());}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BGenerarEstado;
    private javax.swing.JButton BRegresar;
    private javax.swing.JTextField jtfCostoVentas;
    private javax.swing.JTextField jtfFirmaAuto;
    private javax.swing.JTextField jtfFirmaElab;
    private javax.swing.JTextField jtfGastosAdmo;
    private javax.swing.JTextField jtfGastosFin;
    private javax.swing.JTextField jtfGastosVentas;
    private javax.swing.JTextField jtfNombreEmpresa;
    private javax.swing.JTextField jtfOtrosGastos;
    private javax.swing.JTextField jtfOtrosPro;
    private javax.swing.JTextField jtfPeriodoConta;
    private javax.swing.JTextField jtfProFin;
    private javax.swing.JTextField jtfVentas;
    private javax.swing.JPanel panelPantalla2;
    private javax.swing.JLabel txtCostoVentas;
    private javax.swing.JLabel txtFirmaAuto;
    private javax.swing.JLabel txtFirmaElab;
    private javax.swing.JLabel txtGastosAlma;
    private javax.swing.JLabel txtGastosFin;
    private javax.swing.JLabel txtGastosVentas;
    private javax.swing.JLabel txtInstrucciones;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtOtrosGastos;
    private javax.swing.JLabel txtOtrosPro;
    private javax.swing.JLabel txtPeriodo;
    private javax.swing.JLabel txtProFin;
    private javax.swing.JLabel txtVentas;
    // End of variables declaration//GEN-END:variables
}
