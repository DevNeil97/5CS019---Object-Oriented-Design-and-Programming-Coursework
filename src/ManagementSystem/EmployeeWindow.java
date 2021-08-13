/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementSystem;

/**
 *
 * @author Nirmal
 */
public class EmployeeWindow extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeWindow
     */
    public EmployeeWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        /**
         * Gui Component declaration
         * */
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        Top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        searchReceptionist = new javax.swing.JButton();
        searchLifeGuards = new javax.swing.JButton();
        lifetext = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        LifeGuardsTextfilde = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Recesearch = new javax.swing.JTextArea();
        CloseButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        /**
         * Jlabel Color Declaration and position
         * */
        Top.setBackground(new java.awt.Color(0, 51, 102));
        Top.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Employees");

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopLayout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addContainerGap())
        );

        main.setBackground(new java.awt.Color(0, 102, 102));

        /**
         * Schedule text area
         * */
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jTextArea1.setText("______________________Schedule________________________\nDay ___________ Receptionist__________Lifeguard");
        jScrollPane1.setViewportView(jTextArea1);

        /**
         * Receptionist text area and lifeguard
         * */
        ReceptionistList rlist = new ReceptionistList();
        rlist.ReadCSV();
        LifeguardList llist = new LifeguardList();
        llist.ReadCSV();
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setEditable(false);
        jTextArea2.setText("Lifeguards\n________________________________________\nID\n________________________________________\n"+llist.listDetails()+"");

        jScrollPane2.setViewportView(jTextArea2);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setEditable(false);
        jTextArea3.setText("Receptionist\n_______________________________________\nID\n_______________________________________\n"+rlist.listDetails());
        jScrollPane3.setViewportView(jTextArea3);

        /**
         * Search text area
         */
        searchReceptionist.setText("search");
        searchReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReceptionistActionPerformed(evt);
            }
        });
        searchLifeGuards.setText("search");
        searchLifeGuards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLifeGuardsActionPerformed(evt);
            }
        });

        lifetext.setText("Enter ID");
        jTextField3.setText("Enter ID");
        LifeGuardsTextfilde.setColumns(20);
        LifeGuardsTextfilde.setRows(3);
        LifeGuardsTextfilde.setEditable(false);
        jScrollPane4.setViewportView(LifeGuardsTextfilde);

        Recesearch.setColumns(5);
        Recesearch.setRows(3);
        Recesearch.setEditable(false);
        jScrollPane6.setViewportView(Recesearch);

        /**
         * Button settings
         * */
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CreateButton.setText(" create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.setEnabled(false);
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }

        });
        /**
         * frame layout settings
         * */
        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(CreateButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(lifetext, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchLifeGuards))
                                        .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6)
                                        .addGroup(mainLayout.createSequentialGroup()
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchReceptionist)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane3))
                                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchLifeGuards)
                                        .addComponent(lifetext, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchReceptionist)
                                        .addComponent(CreateButton)
                                        .addComponent(BackButton)
                                        .addComponent(CloseButton)
                                        .addComponent(EditButton))
                                .addGap(18, 18, 18)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>


    /**
     * Search the recods to find given receptionist
     * @param evt
     * */
    private void searchReceptionistActionPerformed(java.awt.event.ActionEvent evt) {
        ReceptionistList rList = new ReceptionistList();
        rList.ReadCSV();

        String ID = jTextField3.getText();
        Receptionist findReceptionist=rList.findById(ID);

        if (findReceptionist != null){
            Recesearch.setText(findReceptionist.getName().getFullName()+ " Has the phone Number " + findReceptionist.getPhone());
        }else{
            Recesearch.setText("Receptionist not found please check the ID");
        }
    }

    /**
     * Search the recods to find given receptionist
     * @param evt
     * */
    private void searchLifeGuardsActionPerformed(java.awt.event.ActionEvent evt) {

        LifeguardList lList = new LifeguardList();
        lList.ReadCSV();

        String ID = lifetext.getText();
        Lifeguards findLifeGuard = lList.findById(ID);

        if(findLifeGuard!= null){
            LifeGuardsTextfilde.setText(findLifeGuard.getName().getFullName()+" Has the phone Number "+findLifeGuard.getPhone());
        }else{
            LifeGuardsTextfilde.setText("Lifeguard not found please check the ID");
        }
    }


    /**
     * Close
     * @param evt
     */
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * go back to main window
     * @param evt
     * */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Mainwindow m = new Mainwindow();
        m.setVisible(true);
        this.hide();
    }

    /**
     * Edit the schedule
     * @param evt
     * */
    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        EditShiftsWindow es=new EditShiftsWindow();
        es.setLocationRelativeTo(null);
        es.setVisible(true);
    }


    /**
     * Create Shedule
     * @param evt
     * */
    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Schedule mySchedule = new Schedule();
        CreateButton.setToolTipText("Create a Model Schedule");
        jTextArea1.setText("______________________Schedule________________________\nDay ___________ Lifeguard__________Receptionist"+mySchedule.DispaySchedule());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeWindow().setVisible(true);
            }
        });
    }
    /**
     * Variable declaration
     * */
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextArea LifeGuardsTextfilde;
    private javax.swing.JTextArea Recesearch;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lifetext;
    private javax.swing.JPanel main;
    private javax.swing.JButton searchLifeGuards;
    private javax.swing.JButton searchReceptionist;

}