/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import static frontEnd.scheduleInterface.*;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author RinaA
 */
public class viewBlocks extends javax.swing.JFrame {

	/**
	 * Creates new form viewBlocks
	 */
    public viewBlocks() {

        initComponents();
        setLocationRelativeTo(null);
        this.setSize(794, 710);
        //this.setResizable(false);

		switch (scheduleInterface.levelChosen) {
			case "5th level":
				blocksText.setText("Blocks of " + levelChosen);
				block1Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level5_b1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				block2Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level5_b2.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));


				break;
			case "6th level":
				blocksText.setText("Blocks of " + levelChosen);
				block1Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level6_b1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				block2Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level6_b1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				break;
			case "7th level":
				blocksText.setText("Blocks of " + levelChosen);
				block1Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level7Block1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				block2Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level7Block2.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				break;
			case "8th level":
				blocksText.setText("Blocks of " + levelChosen);
				block1Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level8Block1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				block2Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level8Block2.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				break;
			case "9th level":
				blocksText.setText("Blocks of " + levelChosen);
				block1Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level9_1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				block2Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level9_2.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				break;
			case "10th level":
				blocksText.setText("Blocks of " + levelChosen);
				block1Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level10_1.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				block2Img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/cpit305project/icons/blocks/level10_2.png")).getImage().getScaledInstance(438, 266, Image.SCALE_SMOOTH)));
				break;
			default:
				break;
		}

		
		
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        block2Img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        blocksText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        block1Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("blocks");
        setBackground(new java.awt.Color(51, 51, 77));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 77));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Block Two");

        blocksText.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        blocksText.setForeground(new java.awt.Color(255, 255, 102));
        blocksText.setText("Blocks");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Block One");

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(2, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(block2Img, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block1Img, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blocksText)
                        .addGap(364, 364, 364)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(blocksText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(block1Img, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(block2Img, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(viewBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(viewBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(viewBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(viewBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new viewBlocks().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel block1Img;
    private javax.swing.JLabel block2Img;
    private javax.swing.JLabel blocksText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
