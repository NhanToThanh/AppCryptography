/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcryptography;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.BOMInputStream;

/**
 *
 * @author ThanhNhan
 */
public class md5Frm extends javax.swing.JFrame {

    /**
     * Creates new form md5Frm
     */
    public md5Frm() {
        initComponents();
        this.setTitle("Kiem tra tinh toan ven cua File");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfFile1 = new javax.swing.JTextField();
        tfFile2 = new javax.swing.JTextField();
        btFile2 = new javax.swing.JButton();
        btFile1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbFile1 = new javax.swing.JLabel();
        lbFile2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btFile2.setText("...");
        btFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFile2ActionPerformed(evt);
            }
        });

        btFile1.setText("...");
        btFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFile1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("File 2 :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("File 1 :");

        lbFile1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbFile1.setText("MD5 File 1:");

        lbFile2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbFile2.setText("MD5 File 2:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfFile2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFile1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btFile1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btFile2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFile1)
                            .addComponent(lbFile2))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFile2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFile2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbFile1)
                .addGap(18, 18, 18)
                .addComponent(lbFile2)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void checkIntegrity(String originalFileName, String decryptedFileName){
        try {
           
            
            String md5File1 = org.apache.commons.codec.digest.DigestUtils.md5Hex(readFileAsBytes(originalFileName));
            lbFile1.setText("MD5 File 1: " + md5File1);
          
            
            String md5File2 = org.apache.commons.codec.digest.DigestUtils.md5Hex(readFileAsBytes(decryptedFileName));
            lbFile2.setText("MD5 File 1: " + md5File2);
          
            if(md5File1.equals(md5File2)) JOptionPane.showMessageDialog(null, "File được đảm bảo toàn vẹn","Done",JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "File đã có thay đổi","Done",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){

            e.printStackTrace();
        }
    }
    
    
    private void btFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFile2ActionPerformed
        // TODO add your handling code here:
        File file2 = getFileDialogOpen("*.*");
        if(file2== null)
        return;
        tfFile2.setText(file2.getAbsolutePath());
    }//GEN-LAST:event_btFile2ActionPerformed

    private void btFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFile1ActionPerformed
        // TODO add your handling code here:
        File file1 = getFileDialogOpen("*.*");
        if(file1== null)
        return;
        tfFile1.setText(file1.getAbsolutePath());

    }//GEN-LAST:event_btFile1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(tfFile1.getText().equals("") || tfFile2.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Cần 2 File để kiểm tra","ERROR",JOptionPane.ERROR_MESSAGE);
        else checkIntegrity(tfFile1.getText(), tfFile2.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFile1;
    private javax.swing.JButton btFile2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbFile1;
    private javax.swing.JLabel lbFile2;
    private javax.swing.JTextField tfFile1;
    private javax.swing.JTextField tfFile2;
    // End of variables declaration//GEN-END:variables

private File getFileDialogOpen(String string) {
        FileDialog fd = new FileDialog(this, "Chọn file", FileDialog.LOAD);
        fd.setFile(string);
        fd.setVisible(true);
        if (fd.getFile()==null) {
            return null;
        }
        File file = new File(fd.getDirectory()+fd.getFile());
        if(!file.canRead()){
            JOptionPane.showMessageDialog(null, "File bạn chọn không thể đọc.",
                    "Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return file;
    }

 private static byte[] readFileAsBytes(String filePath)
            throws java.io.IOException {
        File file = new File(filePath);
        FileInputStream inputFile = new FileInputStream(file);
        BOMInputStream bomInputStream = new BOMInputStream(inputFile);
        byte[] inputData = IOUtils.toByteArray(bomInputStream);
        bomInputStream.read(inputData);
        inputFile.close();
        bomInputStream.close();
        return inputData;
    }

}
