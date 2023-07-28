package anony.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import anony.controller.DataController;
import anony.controller.DataControllerImp;
import anony.model.Registering;
import anony.model.Student;
import anony.model.Subject;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class HomeFrm extends javax.swing.JFrame implements ActionListener {
    
    private List<Subject> subjects;
    private List<Student> students;
    private List<Registering> registerings;
    
    private DefaultTableModel tableModelSubject;
    private DataController dataController;

    /**
     * Creates new form HomeFrm
     */
    public HomeFrm() {
        initComponents();
        setLocationRelativeTo(null);
        addButtonGroup();
        addActionListener();
        subjects = new ArrayList<>();
        tableModelSubject = (DefaultTableModel) tblSubject.getModel();
        dataController = new DataControllerImp();
        loadData();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSortSubject = new javax.swing.ButtonGroup();
        buttonGroupSearchSubject = new javax.swing.ButtonGroup();
        javax.swing.JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        rbSortSubjectNameASC = new javax.swing.JRadioButton();
        rbSortSubjectNameDESC = new javax.swing.JRadioButton();
        rbSortSubjectLessonASC = new javax.swing.JRadioButton();
        rbSortSubjectLessonDESC = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        rbSearchSubjectByName = new javax.swing.JRadioButton();
        rbSearchSubjectByNumOfLesson = new javax.swing.JRadioButton();
        txtSearchSubjectByName = new javax.swing.JTextField();
        btnSearchSubject = new javax.swing.JButton();
        txtSearchSubjectLessonFrom = new javax.swing.JTextField();
        txtSearchSubjectLessonTo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();
        btnRefreshSubject = new javax.swing.JButton();
        btnAddNewSubject = new javax.swing.JButton();
        btnEditSubject = new javax.swing.JButton();
        btnRemoveSubject = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ MÔN HỌC");

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp xếp danh sách môn học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        rbSortSubjectNameASC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortSubjectNameASC.setText("Theo tên a-z");

        rbSortSubjectNameDESC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortSubjectNameDESC.setText("Theo tên z-a");

        rbSortSubjectLessonASC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortSubjectLessonASC.setText("Theo số tiết tăng dần");

        rbSortSubjectLessonDESC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortSubjectLessonDESC.setText("Theo số tiết giảm dần");
        rbSortSubjectLessonDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSortSubjectLessonDESCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSortSubjectNameASC)
                    .addComponent(rbSortSubjectNameDESC))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSortSubjectLessonASC)
                    .addComponent(rbSortSubjectLessonDESC))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSortSubjectNameASC)
                    .addComponent(rbSortSubjectLessonASC))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSortSubjectNameDESC)
                    .addComponent(rbSortSubjectLessonDESC))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm môn học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        rbSearchSubjectByName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSearchSubjectByName.setText("Theo tên gần đúng");

        rbSearchSubjectByNumOfLesson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSearchSubjectByNumOfLesson.setText("Theo số tiết học");

        txtSearchSubjectByName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearchSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchSubject.setText("Tìm");
        btnSearchSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSubjectActionPerformed(evt);
            }
        });

        txtSearchSubjectLessonFrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSearchSubjectLessonTo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchSubjectLessonTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSubjectLessonToActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Đến: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Từ:  ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rbSearchSubjectByNumOfLesson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbSearchSubjectByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchSubjectLessonFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchSubjectLessonTo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearchSubjectByName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearchSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSearchSubjectByName)
                            .addComponent(txtSearchSubjectByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSearchSubjectByNumOfLesson)
                            .addComponent(txtSearchSubjectLessonFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchSubjectLessonTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnSearchSubject)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSubject.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tblSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn học", "Tên môn học", "Tổng số tiết học", "Loại môn học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSubject);

        btnRefreshSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefreshSubject.setText("Làm mới");
        btnRefreshSubject.setName(""); // NOI18N

        btnAddNewSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddNewSubject.setText("Thêm môn học");

        btnEditSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditSubject.setText("Sửa môn học");

        btnRemoveSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoveSubject.setText("Xóa môn học");
        btnRemoveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnRefreshSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnRemoveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefreshSubject)
                    .addComponent(btnAddNewSubject)
                    .addComponent(btnEditSubject)
                    .addComponent(btnRemoveSubject))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("QUẢN LÝ MÔN HỌC", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ SINH VIÊN", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ĐĂNG KÝ HỌC", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("BẢNG ĐIỂM", jPanel4);

        jMenu1.setText("File");

        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("...");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRemoveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveSubjectActionPerformed

    private void txtSearchSubjectLessonToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSubjectLessonToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSubjectLessonToActionPerformed

    private void btnSearchSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchSubjectActionPerformed

    private void rbSortSubjectLessonDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSortSubjectLessonDESCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSortSubjectLessonDESCActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSubject;
    private javax.swing.JButton btnEditSubject;
    private javax.swing.JButton btnRefreshSubject;
    private javax.swing.JButton btnRemoveSubject;
    private javax.swing.JButton btnSearchSubject;
    private javax.swing.ButtonGroup buttonGroupSearchSubject;
    private javax.swing.ButtonGroup buttonGroupSortSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbSearchSubjectByName;
    private javax.swing.JRadioButton rbSearchSubjectByNumOfLesson;
    private javax.swing.JRadioButton rbSortSubjectLessonASC;
    private javax.swing.JRadioButton rbSortSubjectLessonDESC;
    private javax.swing.JRadioButton rbSortSubjectNameASC;
    private javax.swing.JRadioButton rbSortSubjectNameDESC;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField txtSearchSubjectByName;
    private javax.swing.JTextField txtSearchSubjectLessonFrom;
    private javax.swing.JTextField txtSearchSubjectLessonTo;
    // End of variables declaration//GEN-END:variables

    private void addButtonGroup() {
        buttonGroupSearchSubject.add(rbSearchSubjectByName);
        buttonGroupSearchSubject.add(rbSearchSubjectByNumOfLesson);
        
        buttonGroupSortSubject.add(rbSortSubjectLessonASC);
        buttonGroupSortSubject.add(rbSortSubjectLessonDESC);
        buttonGroupSortSubject.add(rbSortSubjectNameASC);
        buttonGroupSortSubject.add(rbSortSubjectNameDESC);
    }
    
    private void addActionListener() {
        btnAddNewSubject.addActionListener(this);
        btnEditSubject.addActionListener(this);
        btnRemoveSubject.addActionListener(this);
        btnRefreshSubject.addActionListener(this);
        btnSearchSubject.addActionListener(this);
        
        rbSearchSubjectByName.addActionListener(this);
        rbSearchSubjectByNumOfLesson.addActionListener(this);
        rbSortSubjectLessonASC.addActionListener(this);
        rbSortSubjectLessonDESC.addActionListener(this);
        rbSortSubjectNameASC.addActionListener(this);
        rbSortSubjectNameDESC.addActionListener(this);
    }
    
    public void addSubjectCallback(Subject subject) {
        subjects.add(subject);
        showSubject(subject);
        saveData(DataController.SUBJECT);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // thực hiện các hành động
        var obj = e.getSource();
        if (obj.equals(btnAddNewSubject)) {
            AddSubjectDialog addSubjectDialog
                    = new AddSubjectDialog(this, rootPaneCheckingEnabled);
            addSubjectDialog.setVisible(true);
        } else if(obj.equals(btnRemoveSubject)) {
            removeSubject();
        } else if (obj.equals(btnEditSubject)) {
            editSubject();
        } else if (obj.equals(rbSortSubjectLessonASC)
                || obj.equals(rbSortSubjectLessonDESC)
                || obj.equals(rbSortSubjectNameASC)
                || obj.equals(rbSortSubjectNameDESC)) {
            sortSubjects(obj);
        } else if(obj.equals(btnSearchSubject)){
            searcheSubject();
        } else if(obj.equals(btnRefreshSubject)){
            refreshSubject();
        }
    }
    
    private void showSubject(Subject subject) {
        Object[] row = new Object[]{
            subject.getId(), subject.getName(),
            subject.getNumOfLesson(), subject.getKind()
        };
        tableModelSubject.addRow(row);
    }
    
    private void loadData() {
        subjects = dataController
                .<Subject>readDataFromFile(DataController.SUBJECT_FILE);
        editSubjectId();
    }
    
    private void showData() {
        showSubjects();
    }
    
    private void showSubjects() {
        tableModelSubject.setRowCount(0); // clear data
        for (Subject subject : subjects) {
            showSubject(subject);
        }
    }
    
    private void saveData(int choice) {
        switch (choice) {
            case DataController.SUBJECT:
                dataController.<Subject>writeToFile(subjects,
                        DataController.SUBJECT_FILE);
                break;
            case DataController.STUDENT:
                dataController.<Student>writeToFile(students,
                        DataController.STUDENT_FILE);
                break;
            case DataController.REGISTERING:
                dataController.<Registering>writeToFile(registerings,
                        DataController.REGISTERING_FILE);
                break;
        }
    }
    
    private void editSubjectId() {
        int maxId = Subject.getsId();
        for (Subject subject : subjects) {
            if (subject.getId() > maxId) {
                maxId = subject.getId();
            }
        }
        Subject.setsId(maxId + 1);
    }
    
    private void removeSubject() {
        int selectedIndex = tblSubject.getSelectedRow();
        if (selectedIndex > -1) {
            var msg = "Bạn có chắc chắn xoá môn học này?";
            int confirm = JOptionPane.showConfirmDialog(rootPane, msg);
            if (confirm == JOptionPane.YES_OPTION) { // or OK_OPTION
                subjects.remove(selectedIndex);
                tableModelSubject.removeRow(selectedIndex);
                dataController.<Subject>writeToFile(subjects,
                        DataController.SUBJECT_FILE);
            }
        } else {
            var msg = "Vui lòng chọn 1 môn!";
            showDialogMessage(msg);
        }
    }
    
    private void showDialogMessage(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }
    
    private void editSubject() {
        int selectedIndex = tblSubject.getSelectedRow();
        if (selectedIndex > -1) {
            Subject subject = subjects.get(selectedIndex);
            EditSubjectDialog editSubjectDialog
                    = new EditSubjectDialog(this, rootPaneCheckingEnabled, subject);
            editSubjectDialog.setVisible(true);
        } else {
            var msg = "Vui lòng chọn 1 môn!";
            showDialogMessage(msg);
        }
    }
    
    public void editSubjectCallback(Subject subject) {
        int selectedIndex = tblSubject.getSelectedRow();
        subjects.set(selectedIndex, subject);
        tableModelSubject.removeRow(selectedIndex);
        Object[] row = new Object[]{
            subject.getId(), subject.getName(),
            subject.getNumOfLesson(), subject.getKind()
        };
        tableModelSubject.insertRow(selectedIndex, row);
        saveData(DataController.SUBJECT);
    }
    
    private void sortSubjects(Object obj) {
        if (obj.equals(rbSortSubjectLessonASC)) {
            dataController.sortSubjectByNumOfLessonASC(subjects);
        } else if (obj.equals(rbSortSubjectLessonDESC)) {
            dataController.sortSubjectByNumOfLessonDESC(subjects);
        } else if (obj.equals(rbSortSubjectNameASC)) {
            dataController.sortSubjectByNameASC(subjects);
        } else if (obj.equals(rbSortSubjectNameDESC)) {
            dataController.sortSubjectByNameDESC(subjects);
        }
        showSubjects();
    }

    private void searcheSubject() {
        if(rbSearchSubjectByName.isSelected()){
            var key = txtSearchSubjectByName.getText();
            var result = dataController.searchSubjectByName(subjects, key);
            subjects.clear();
            subjects.addAll(result);
            showSubjects();
            cleanCodeP1();
        } else if(rbSearchSubjectByNumOfLesson.isSelected()){
            var fromV = txtSearchSubjectLessonFrom.getText();
            var toV = txtSearchSubjectLessonTo.getText();
            if(!fromV.isEmpty() && !toV.isEmpty()){
                var from = Integer.parseInt(fromV);
                var to = Integer.parseInt(toV);
                var result = dataController.searchSubjectByLesson(subjects, from, to);
                subjects.clear();
                subjects.addAll(result);
                cleanCodeP1();
            }
        }
    }
   
    void cleanCodeP1(){
        showSubjects();
        if (subjects.size() <= 0) {
            subjects.clear();
            showSubjects();
            var msg = "Không tìm thấy, vui lòng nhập lại!";
            showDialogMessage(msg);
        }
    }
    private void refreshSubject() {
        subjects.clear();
        subjects.addAll(dataController.<Subject>readDataFromFile(DataController.SUBJECT_FILE));
        showSubjects();
    }
}