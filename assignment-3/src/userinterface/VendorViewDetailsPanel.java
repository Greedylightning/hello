/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import bean.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author zack
 */
public class VendorViewDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VendorViewDetailsPanel
     */
    private JPanel userProcessContainer;
    private Product product;
    
    public VendorViewDetailsPanel(JPanel userProcessContainer, Product product) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product = product;
        populateProductDetails();
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
        lblViewDetails = new javax.swing.JLabel();
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
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblFeatures = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFeatures = new javax.swing.JTextArea();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblViewDetails.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblViewDetails.setText("View Product Details");

        lblName.setText("Name:");

        txtName.setEnabled(false);

        lblModelNumber.setText("Model Number:");

        txtModelNumber.setEnabled(false);

        lblVendorName.setText("Vendor Name:");

        txtVendorName.setEnabled(false);

        lblDescription.setText("Description:");

        txtDescription.setEnabled(false);

        lblBasicPrice.setText("Basic Price:");

        txtBasicPrice.setEnabled(false);

        lblCeilingPrice.setText("Ceiling Price:");

        txtCeilingPrice.setEnabled(false);

        lblFloorPrice.setText("Floor Price:");

        txtFloorPrice.setEnabled(false);

        lblCategory.setText("Category:");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Printer", "Hardware", "Software" }));
        cmbCategory.setEnabled(false);

        lblFeatures.setText("Features and Benifits:");

        txtFeatures.setColumns(20);
        txtFeatures.setRows(5);
        txtFeatures.setEnabled(false);
        jScrollPane1.setViewportView(txtFeatures);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
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
                                    .addComponent(txtFloorPrice)
                                    .addComponent(txtCeilingPrice)
                                    .addComponent(txtBasicPrice)
                                    .addComponent(txtDescription)
                                    .addComponent(txtVendorName)
                                    .addComponent(txtModelNumber)
                                    .addComponent(txtName)
                                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFeatures)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblViewDetails)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewDetails)
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
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBasicPrice;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCeilingPrice;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFeatures;
    private javax.swing.JLabel lblFloorPrice;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblVendorName;
    private javax.swing.JLabel lblViewDetails;
    private javax.swing.JTextField txtBasicPrice;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextArea txtFeatures;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtVendorName;
    // End of variables declaration//GEN-END:variables

    private void populateProductDetails() {
        txtName.setText(product.getName());
        txtModelNumber.setText(product.getModelNumber());
        txtVendorName.setText(product.getVendorName());
        txtDescription.setText(product.getDescription());
        txtBasicPrice.setText(product.getBasePrice());
        txtCeilingPrice.setText(product.getFloorPrice());
        txtFloorPrice.setText(product.getFloorPrice());
        txtFeatures.setText(product.getFeatures());
        cmbCategory.setSelectedItem(product.getCategory());
    }
}
