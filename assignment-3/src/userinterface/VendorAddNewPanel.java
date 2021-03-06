/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import bean.Product;
import bean.ProductCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zack
 */
public class VendorAddNewPanel extends javax.swing.JPanel {

    /**
     * Creates new form VendorAddNewPanel
     */
    private JPanel userProcessContainer;
    private ProductCatalog productCatalog;
    public VendorAddNewPanel(JPanel userProcessContainer, ProductCatalog productCatalog,String sign) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalog = productCatalog;
        txtVendorName.setText(sign);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblAddNew = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblModelNumber = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        lblVendorName = new javax.swing.JLabel();
        txtVendorName = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblBasicPrice = new javax.swing.JLabel();
        txtBasicPrice = new javax.swing.JTextField();
        lblCeilingPrice = new javax.swing.JLabel();
        txtCeilingPrice = new javax.swing.JTextField();
        lblFloorPrice = new javax.swing.JLabel();
        txtFloorPrice = new javax.swing.JTextField();
        lblFeatures = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFeatures = new javax.swing.JTextArea();
        btnConfirm = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblAddNew.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblAddNew.setText("Add New Product");

        lblName.setText("Name:");

        lblModelNumber.setText("Model Number:");

        lblVendorName.setText("Vendor Name:");

        txtVendorName.setEnabled(false);
        txtVendorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendorNameActionPerformed(evt);
            }
        });

        lblDescription.setText("Description:");

        lblBasicPrice.setText("Basic Price:");

        lblCeilingPrice.setText("Ceiling Price:");

        lblFloorPrice.setText("Floor Price:");

        lblFeatures.setText("Features and Benifits:");

        txtFeatures.setColumns(20);
        txtFeatures.setRows(5);
        jScrollPane1.setViewportView(txtFeatures);

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblCategory.setText("Category:");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Printer", "Hardware", "Software" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(lblAddNew))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblModelNumber)
                                    .addComponent(lblVendorName)
                                    .addComponent(lblDescription)
                                    .addComponent(lblBasicPrice)
                                    .addComponent(lblCeilingPrice)
                                    .addComponent(lblFloorPrice)
                                    .addComponent(lblCategory))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFloorPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtCeilingPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtBasicPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtVendorName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFeatures)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddNew)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendorName)
                    .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBasicPrice)
                    .addComponent(txtBasicPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCeilingPrice)
                    .addComponent(txtCeilingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFloorPrice)
                    .addComponent(txtFloorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFeatures))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtModelNumber.setText("");
        //txtVendorName.setText("");
        txtDescription.setText("");
        txtBasicPrice.setText("");
        txtCeilingPrice.setText("");
        txtFloorPrice.setText("");
        txtFeatures.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String modelNumber = txtModelNumber.getText();
        String vendorName = txtVendorName.getText();
        String description = txtDescription.getText();
        String basicPrice = txtBasicPrice.getText();
        String floorPrice = txtFloorPrice.getText();
        String ceilingPrice = txtCeilingPrice.getText();
        String features = txtFeatures.getText();
        String category = (String) cmbCategory.getSelectedItem();
        
        Product product = productCatalog.addProduct();
        product.setName(name);
        product.setModelNumber(modelNumber);
        product.setVendorName(vendorName);
        product.setBasePrice(basicPrice);
        product.setFloorPrice(floorPrice);
        product.setCeilingPrice(ceilingPrice);
        product.setDescription(description);
        product.setFeatures(features);
        product.setCategory(category);
        
        JOptionPane.showMessageDialog(null, "Product successfully created!");
        
        txtName.setText("");
        txtModelNumber.setText("");
        //txtVendorName.setText("");
        txtDescription.setText("");
        txtBasicPrice.setText("");
        txtCeilingPrice.setText("");
        txtFloorPrice.setText("");
        txtFeatures.setText("");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtVendorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendorNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddNew;
    private javax.swing.JLabel lblBasicPrice;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCeilingPrice;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFeatures;
    private javax.swing.JLabel lblFloorPrice;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblVendorName;
    private javax.swing.JTextField txtBasicPrice;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextArea txtFeatures;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtVendorName;
    // End of variables declaration//GEN-END:variables
}
