package com.mycompany.quiznew;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Sound Room
 */
public class QuizAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuizAppGUI
     */
    //make a variable to hold the player's name
    static String playerName = "";

    //questions to take in as a parameter
    static ArrayList<Question> Questions = new ArrayList<Question>();

    //current question var to keep track of where we are
    static int currentQ = 0;
    
    //Improvement - method to reset the text based on the currentQ variable
    public void setQuestionText(int currentQuestion){
        LabelQuestionCounter.setText("Question " + (currentQuestion + 1) + " of " + (Questions.size()));
        TextAreaQuestionText.setText(Questions.get(currentQuestion).getQuestionText());
        RadioButtonOption1.setText(Questions.get(currentQuestion).getOption1());
        RadioButtonOption2.setText(Questions.get(currentQuestion).getOption2());
        RadioButtonOption3.setText(Questions.get(currentQuestion).getOption3());
        RadioButtonOption4.setText(Questions.get(currentQuestion).getOption4());
        
    }

    public QuizAppGUI(String name, ArrayList<Question> QuestionList) {
        initComponents();

        this.playerName = name;
        this.Questions = QuestionList;

        //put it in the middle of the screen and set the name 
        setTitle("Quiz");
        setLocationRelativeTo(null);

        this.setVisible(true);

        //make the text area uneditable
        TextAreaQuestionText.setEditable(false);

        //set the name text to be the name
        LabelName.setText(name.toUpperCase(Locale.ITALY));

        //put the first question in 
        setQuestionText(currentQ);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        ButtonSubmit = new javax.swing.JButton();
        LabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaQuestionText = new javax.swing.JTextArea();
        LabelQuestionCounter = new javax.swing.JLabel();
        RadioButtonOption1 = new javax.swing.JRadioButton();
        RadioButtonOption2 = new javax.swing.JRadioButton();
        RadioButtonOption3 = new javax.swing.JRadioButton();
        RadioButtonOption4 = new javax.swing.JRadioButton();
        ButtonPrevious = new javax.swing.JButton();
        ButtonNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        LabelTitle.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("Quiz");

        ButtonSubmit.setText("Submit");
        ButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubmitActionPerformed(evt);
            }
        });

        LabelName.setForeground(new java.awt.Color(255, 255, 255));
        LabelName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelName.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSubmit)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelTitle)
                        .addComponent(LabelName))
                    .addComponent(ButtonSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        TextAreaQuestionText.setColumns(20);
        TextAreaQuestionText.setLineWrap(true);
        TextAreaQuestionText.setRows(5);
        jScrollPane1.setViewportView(TextAreaQuestionText);

        LabelQuestionCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelQuestionCounter.setText("Question out of question");

        buttonGroup1.add(RadioButtonOption1);
        RadioButtonOption1.setText("Option 1");
        RadioButtonOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonOption1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonOption2);
        RadioButtonOption2.setText("Option 2");
        RadioButtonOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonOption2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonOption3);
        RadioButtonOption3.setText("Option 3");
        RadioButtonOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonOption3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonOption4);
        RadioButtonOption4.setText("Option 4");
        RadioButtonOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonOption4ActionPerformed(evt);
            }
        });

        ButtonPrevious.setText("Previous");
        ButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPreviousActionPerformed(evt);
            }
        });

        ButtonNext.setText("Next");
        ButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelQuestionCounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonPrevious)
                                .addGap(205, 205, 205)
                                .addComponent(ButtonNext))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RadioButtonOption1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(RadioButtonOption3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButtonOption4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RadioButtonOption2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelQuestionCounter)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonOption1)
                    .addComponent(RadioButtonOption2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonOption3)
                    .addComponent(RadioButtonOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPrevious)
                    .addComponent(ButtonNext))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextActionPerformed

        try {

            if (currentQ < Questions.size() - 1) {

                try {

                    //increment counter if we canand reset text
                    currentQ += 1;

                    //if the current question hasn't already been answered we clear the selection
                    if (!Questions.get(currentQ).isHasBeenAnswered()) {

                        buttonGroup1.clearSelection();
                    } else {

                        //if it has already been answered we set the question back to where it was answered
                        if (Questions.get(currentQ).getOptionSelected() == 1) {

                            RadioButtonOption1.setSelected(true);

                        } else if (Questions.get(currentQ).getOptionSelected() == 2) {

                            RadioButtonOption2.setSelected(true);

                        } else if (Questions.get(currentQ).getOptionSelected() == 3) {

                            RadioButtonOption3.setSelected(true);

                        } else if (Questions.get(currentQ).getOptionSelected() == 4) {

                            RadioButtonOption4.setSelected(true);

                        }
                    }
                    //set text 
                    setQuestionText(currentQ);
                    
                } catch (Exception e) {
                }

            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_ButtonNextActionPerformed

    private void ButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPreviousActionPerformed

        try {

            //decrement counter (if we can) and reset text
            if (!(currentQ < 1)) {
                try {

                    currentQ -= 1;

                    //set text 
                    setQuestionText(currentQ);
                    
                    //if there's an answer selected we set it back to it and if not we clear it
                    if (!Questions.get(currentQ).isHasBeenAnswered()) {

                        buttonGroup1.clearSelection();
                    } else {

                        //if like it's 1 that was selected we set it back to 1 and so on
                        if (Questions.get(currentQ).getOptionSelected() == 1) {

                            RadioButtonOption1.setSelected(true);

                        } else if (Questions.get(currentQ).getOptionSelected() == 2) {

                            RadioButtonOption2.setSelected(true);

                        } else if (Questions.get(currentQ).getOptionSelected() == 3) {

                            RadioButtonOption3.setSelected(true);

                        } else if (Questions.get(currentQ).getOptionSelected() == 4) {

                            RadioButtonOption4.setSelected(true);

                        }

                    }

                } catch (Exception e) {
                }
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_ButtonPreviousActionPerformed

    private void RadioButtonOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonOption4ActionPerformed
        Questions.get(currentQ).setHasBeenAnswered(true);
        Questions.get(currentQ).setOptionSelected(4);
    }//GEN-LAST:event_RadioButtonOption4ActionPerformed

    private void RadioButtonOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonOption1ActionPerformed
        Questions.get(currentQ).setHasBeenAnswered(true);
        Questions.get(currentQ).setOptionSelected(1);
    }//GEN-LAST:event_RadioButtonOption1ActionPerformed

    private void RadioButtonOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonOption2ActionPerformed
        Questions.get(currentQ).setHasBeenAnswered(true);
        Questions.get(currentQ).setOptionSelected(2);
    }//GEN-LAST:event_RadioButtonOption2ActionPerformed

    private void RadioButtonOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonOption3ActionPerformed
        Questions.get(currentQ).setHasBeenAnswered(true);
        Questions.get(currentQ).setOptionSelected(3);
    }//GEN-LAST:event_RadioButtonOption3ActionPerformed

    private void ButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubmitActionPerformed

        //close this, open the end screen
        this.dispose();
        try {
            EndScreen endScreenRun = new EndScreen(playerName, Questions);
        } catch (IOException ex) {
            Logger.getLogger(QuizAppGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_ButtonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizAppGUI(playerName, Questions).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNext;
    private javax.swing.JButton ButtonPrevious;
    private javax.swing.JButton ButtonSubmit;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelQuestionCounter;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JRadioButton RadioButtonOption1;
    private javax.swing.JRadioButton RadioButtonOption2;
    private javax.swing.JRadioButton RadioButtonOption3;
    private javax.swing.JRadioButton RadioButtonOption4;
    private javax.swing.JTextArea TextAreaQuestionText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
