package igu;
public class Pantalla4 extends javax.swing.JFrame {
    public Pantalla4() {
        initComponents();
        asignarCeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bancos", null, null, null, null, null, null, null, null, null, null},
                {"Terrenos", null, null, null, null, null, null, null, null, null, null},
                {"Edificios", null, null, null, null, null, null, null, null, null, null},
                {"Capital Social", null, null, null, null, null, null, null, null, null, null},
                {"Almacen ", null, null, null, null, null, null, null, null, null, null},
                {"Proveedores", null, null, null, null, null, null, null, null, null, null},
                {"Mob. y Equipo", null, null, null, null, null, null, null, null, null, null},
                {"Acreedores", null, null, null, null, null, null, null, null, null, null},
                {"Clientes", null, null, null, null, null, null, null, null, null, null},
                {"Ventas", null, null, null, null, null, null, null, null, null, null},
                {"Costo de Ventas", null, null, null, null, null, null, null, null, null, null},
                {"Gastos de Ventas", null, null, null, null, null, null, null, null, null, null},
                {"Gastos Admin", null, null, null, null, null, null, null, null, null, null},
                {"Perdidas y Ganancias", null, null, null, null, null, null, null, null, null, null},
                {"Utilidad del Ejercicio", null, null, null, null, null, null, null, null, null, null},
                {"Saldos iguales", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Concepto", "Cargo", "Abono", "Cargo", "Abono ", "Cargo ", "Abono", "Cargo", "Abono", "Cargo", "Abono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("=SALDOS  FINALES=");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=RECLASIFICACIONES=");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=AJUSTE=");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=MOVIMIENTOS=");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("=SALDOS INICIALES=");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("HOJA DE TRABAJO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ajustarMovimientos();    
        calcularSumasAjuste();
        calcularGanancia();
        calcularSaldos();
        calcularRestasSaldos();
        calcularSumas();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void asignarCeros(){
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 15; j++) {
                jTable1.setValueAt(0,j,i);
            }
        }
    }
    
    private void ajustarMovimientos(){
        for (int i = 9; i < 13; i++) {           
                jTable1.setValueAt(jTable1.getValueAt(i,4), i,5);         
        }
        for (int i = 9; i < 13; i++) {           
                jTable1.setValueAt(jTable1.getValueAt(i,3), i,6);         
        }
    }
    
    public void calcularSumasAjuste(){
        int suma = 0;
        for (int i = 9; i < 13; i++) {
            suma = suma + (int)jTable1.getValueAt(i,5);
        }
        jTable1.setValueAt(suma, 13, 6);
        suma = 0;
        for (int i = 9; i < 13; i++) {
            suma = suma + (int)jTable1.getValueAt(i,6);
        }
        jTable1.setValueAt(suma, 13, 5);
    }
    
    public void calcularGanancia(){
        int resta = (int)jTable1.getValueAt(13,6) - (int)jTable1.getValueAt(13,5);
        jTable1.setValueAt(resta, 13, 7);
        jTable1.setValueAt(resta, 14, 8); 
    }
    
    public void calcularSumas(){
        int suma = 0;
        for (int j = 1; j < 11; j++) {
            for (int i = 0; i < 15; i++) {
                suma = suma + (int)jTable1.getValueAt(i,j);
            }
            jTable1.setValueAt(suma, 15, j);
            suma = 0;
        }  
    }
    
    public void calcularSaldos(){
        int suma = 0;
        for (int j = 0; j < 15; j++) {
            for (int i = 1; i < 9; i++) {
                suma = suma + (int)jTable1.getValueAt(j,i);
                i++;
            }
            jTable1.setValueAt(suma, j, 9);
            suma = 0;
        } 
        
        for (int j = 0; j < 15; j++) {
            for (int i = 2; i < 9; i++) {
                suma = suma + (int)jTable1.getValueAt(j,i);
                i++;
            }
            jTable1.setValueAt(suma, j, 10);
            suma = 0;
        }    
    }
    
    public void calcularRestasSaldos(){
        int resta;
        for (int j = 0; j < 15; j++) {
                if ((int)jTable1.getValueAt(j,9) > (int)jTable1.getValueAt(j,10)){
                    resta = (int)jTable1.getValueAt(j,9) - (int)jTable1.getValueAt(j,10);
                    jTable1.setValueAt(resta, j, 9);
                    jTable1.setValueAt(0, j, 10);
                }
                if ((int)jTable1.getValueAt(j,9) < (int)jTable1.getValueAt(j,10)){
                    resta = (int)jTable1.getValueAt(j,10) - (int)jTable1.getValueAt(j,9);
                    jTable1.setValueAt(resta, j, 10);
                    jTable1.setValueAt(0, j, 9);
                }
                if ((int)jTable1.getValueAt(j,9) == (int)jTable1.getValueAt(j,10)){
                    jTable1.setValueAt(0, j, 9);
                    jTable1.setValueAt(0, j, 10);
                }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
