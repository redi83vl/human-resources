/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.hr.admin;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameMain extends javax.swing.JFrame {

	/**
	 * Creates new form FrameMain
	 */
	public FrameMain() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jComboBox1 = new javax.swing.JComboBox<>();
          jSplitPane1 = new javax.swing.JSplitPane();
          jPanel2 = new javax.swing.JPanel();
          jToolBar1 = new javax.swing.JToolBar();
          filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
          filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jScrollPane1 = new javax.swing.JScrollPane();
          jXTable1 = new org.jdesktop.swingx.JXTable();
          jPanel1 = new javax.swing.JPanel();
          jScrollPane2 = new javax.swing.JScrollPane();
          jXList1 = new org.jdesktop.swingx.JXList();
          jToolBar2 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          jButton2 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();
          jMenuBar1 = new javax.swing.JMenuBar();
          jMenu1 = new javax.swing.JMenu();
          jMenu2 = new javax.swing.JMenu();

          jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

          jSplitPane1.setDividerLocation(250);

          jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PUNONJESIT"));
          jPanel2.setLayout(new java.awt.BorderLayout());

          jToolBar1.setFloatable(false);
          jToolBar1.setRollover(true);
          jToolBar1.add(filler1);

          jXSearchField1.setColumns(25);
          jXSearchField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
          jXSearchField1.setToolTipText("Kerko ...");
          jXSearchField1.setMaximumSize(new java.awt.Dimension(232, 24));
          jXSearchField1.setMinimumSize(new java.awt.Dimension(232, 24));
          jXSearchField1.setPrompt("Kerko ...");
          jToolBar1.add(jXSearchField1);
          jToolBar1.add(filler2);

          jPanel2.add(jToolBar1, java.awt.BorderLayout.PAGE_END);

          jXTable1.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
               },
               new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
               }
          ));
          jXTable1.setSearchable(null);
          jScrollPane1.setViewportView(jXTable1);

          jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

          jSplitPane1.setRightComponent(jPanel2);

          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SEKTORET"));
          jPanel1.setLayout(new java.awt.BorderLayout());

          jXList1.setModel(new javax.swing.AbstractListModel() {
               String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
               public int getSize() { return strings.length; }
               public Object getElementAt(int i) { return strings[i]; }
          });
          jScrollPane2.setViewportView(jXList1);

          jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

          jSplitPane1.setLeftComponent(jPanel1);

          getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

          jToolBar2.setFloatable(false);
          jToolBar2.setRollover(true);

          jButton1.setText("jButton1");
          jButton1.setFocusable(false);
          jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jButton1);

          jButton2.setText("jButton2");
          jButton2.setFocusable(false);
          jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jButton2);

          jButton3.setText("jButton3");
          jButton3.setFocusable(false);
          jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jButton3);

          getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_START);

          jMenu1.setText("File");
          jMenuBar1.add(jMenu1);

          jMenu2.setText("Edit");
          jMenuBar1.add(jMenu2);

          setJMenuBar(jMenuBar1);

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
			java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameMain().setVisible(true);
			}
		});
	}

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.Box.Filler filler1;
     private javax.swing.Box.Filler filler2;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JComboBox<String> jComboBox1;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenu jMenu2;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JSplitPane jSplitPane1;
     private javax.swing.JToolBar jToolBar1;
     private javax.swing.JToolBar jToolBar2;
     private org.jdesktop.swingx.JXList jXList1;
     private org.jdesktop.swingx.JXSearchField jXSearchField1;
     private org.jdesktop.swingx.JXTable jXTable1;
     // End of variables declaration//GEN-END:variables
}