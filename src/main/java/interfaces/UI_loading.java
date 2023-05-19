package interfaces;

import javax.swing.JOptionPane;

public class UI_loading extends javax.swing.JFrame {

    public UI_loading() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barra_progresso = new javax.swing.JProgressBar();
        contador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_progresso.setBackground(new java.awt.Color(255, 204, 51));
        barra_progresso.setForeground(new java.awt.Color(0, 0, 0));
        barra_progresso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra_progresso.setDoubleBuffered(true);
        jPanel1.add(barra_progresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 730, 10));

        contador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contador.setForeground(new java.awt.Color(255, 255, 0));
        contador.setText("%");
        jPanel1.add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Djep_AdobeExpress.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 590, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        UI_loading loading = new UI_loading ();
        loading.setVisible(true);
         try {
            for(int i = 0; i <= 100; i += 2){
               Thread.sleep(40);
               loading.barra_progresso.setValue(i);
               loading.contador.setText(Integer.toString (i) + "%");
            }
            loading.dispose();
            UI_login login1 = new UI_login();
            login1.setVisible(true);
            
        } catch (InterruptedException e){
          JOptionPane.showConfirmDialog(null, "Algum tubarão mordeu o cabo...");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra_progresso;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
