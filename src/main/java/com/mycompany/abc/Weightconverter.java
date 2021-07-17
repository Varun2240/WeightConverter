/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abc;

/**
 *
 * @author G.Varun
 */
public class Weightconverter extends javax.swing.JFrame {
    
    double v1=0,v2=0;
    String w1="",w2="";
    


    /**
     * Creates new form Weightconverter
     */
    public Weightconverter() {
        
        initComponents();
    }

   double Converter(double val1,String weightFrom,String weightTo) {
   double val2=0.0;
   
   if(weightFrom.equals(weightTo)) {
       val2=val1;
   }
   
   if(weightFrom.equals("Kilogram")) {
       if(weightTo.equals("Gram")){
       
       val2= val1*1000;
   }
   }
     if(weightFrom.equals("Kilogram")) {
       if(weightTo.equals("Centigram")){
           val2=val1*100000;
       }
       
     }
     if(weightFrom.equals("Kilogram")) {
       if(weightTo.equals("Milligram")){
           val2=val1*1000000;
       }
       
     }
     if(weightFrom.equals("Kilogram")) {
       if(weightTo.equals("Microgram")){
           val2= val1*1000000000;
       }
       
     }
     if(weightFrom.equals("Kilogram")) {
       if(weightTo.equals("Pound")){
           val2 =val1*2.205 ;
       }
       
     }
     if(weightFrom.equals("Gram")) {
       if(weightTo.equals("Kilogram")){
           val2 =val1*0.001;
       }
       
     }
     if(weightFrom.equals("Gram")) {
       if(weightTo.equals("Centigram")){
           val2 =val1*100;
       }
     }
     if(weightFrom.equals("Gram")) {
       if(weightTo.equals("Milligram")){
           val2 =val1*1000;
       }
     }
if(weightFrom.equals("Gram")) {
       if(weightTo.equals("Microgram")){
           val2 =val1*1000000;
       }
}
if(weightFrom.equals("Gram")) {
       if(weightTo.equals("Pound")){
           val2 =val1*0.0022;
       }
}
if(weightFrom.equals("Centigram")) {
       if(weightTo.equals("Kilogram")){
           val2 =val1*0.00001;
       }
}
if(weightFrom.equals("Centigram")) {
       if(weightTo.equals("Gram")){
           val2 =val1*0.01;
       }
}
if(weightFrom.equals("Centigram")) {
       if(weightTo.equals("Milligram")){
           val2 =val1*10;
       }
}
if(weightFrom.equals("Centigram")) {
       if(weightTo.equals("Microgram")){
           
           val2 =val1*10000;
       }
}
if(weightFrom.equals("Centigram")) {
       if(weightTo.equals("Pound")){
           val2 =val1/45359;
       }
}
if(weightFrom.equals("Milligram")) {
       if(weightTo.equals("Kilogram")){
           val2 =val1/1000000;
       }
}
if(weightFrom.equals("Milligram")) {
       if(weightTo.equals("Gram")){
           val2 =val1*0.001;
       }
}
if(weightFrom.equals("Milligram")) {
       if(weightTo.equals("Centigram")){
           val2 =val1*0.1;
       }
}
if(weightFrom.equals("Milligram")) {
       if(weightTo.equals("Microgram")){
           val2 =val1*1000;
       }
}
if(weightFrom.equals("Milligram")) {
       if(weightTo.equals("Pound")){
           val2 =val1/453592;
       }
}
if(weightFrom.equals("Microgram")) {
       if(weightTo.equals("Kilogram")){
           val2 =val1/1000000000;
       }
}
if(weightFrom.equals("Microgram")) {
       if(weightTo.equals("Gram")){
           val2 =val1/1000000;
       }
}
if(weightFrom.equals("Microgram")) {
       if(weightTo.equals("centigram")){
           val2 =val1*0.0001;
       }
}
if(weightFrom.equals("Microgram")) {
       if(weightTo.equals("Milligram")){
           val2 =val1*0.001;
       }
}
if(weightFrom.equals("Microgram")) {
       if(weightTo.equals("Pound")){
           val2 =val1/4.536;
       }
}
if(weightFrom.equals("Pound")) {
       if(weightTo.equals("Kilogram")){
           val2 =val1*0.454;
       }
}
if(weightFrom.equals("Pound")) {
       if(weightTo.equals("Gram")){
           val2 =val1*453;
       }
}
if(weightFrom.equals("Pound")) {
       if(weightTo.equals("Centigram")){
           val2 =val1*45359;
       }
}
if(weightFrom.equals("Pound")) {
       if(weightTo.equals("Microgram")){
           val2 =val1/4.536;
       }
}
if(weightFrom.equals("Pound")) {
       if(weightTo.equals("Milligram")){
           val2 =val1*4536;
       }
}

















   return val2;
   }
       
   
   
   
   
     
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("<html>\n<body>\n<h2>\nWeight Converter\n<h2>\n</body>\n</html>");

        txt1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt1.setText("1");

        txt2.setEditable(false);
        txt2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt2.setText("1");

        List1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Kilogram", "Gram", "Centigram", "Milligram", "Microgram", "Pound" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List1.setSelectedIndex(0);
        jScrollPane1.setViewportView(List1);

        List2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Kilogram", "Gram", "Centigram", "Milligram", "Microgram", "Pound" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List2.setSelectedIndex(0);
        List2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txt2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void List2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List2ValueChanged
        // TODO add your handling code here:
    v1=Double.valueOf(txt1.getText());
    w1=List1.getSelectedValue();
    w2=List2.getSelectedValue();
    
    v2=Converter(v1,w1,w2);
     txt2.setText(v2+"");
    
    
    
    
    }//GEN-LAST:event_List2ValueChanged

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
            java.util.logging.Logger.getLogger(Weightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Weightconverter().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List1;
    private javax.swing.JList<String> List2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
