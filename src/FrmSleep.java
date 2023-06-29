/*
Created by Conner Recoskie.
Tuesday, February, 21st.
This program tells the user how many days they have lived for and how
many hours they have slept for based on the data they input. The program obtains
the birth date and current date from the user, it then calculates and outputs the
amount of days the user has lived for and the amount of time they have slept for. 
*/
public class FrmSleep extends javax.swing.JFrame {
    /*
    daysAlive
    This method receives the users date of birth and the current date, it then
    calculates and returns the amount of days the user has lived for.
    Parameters: int, int, int, int, int, int
    Returns: int
    */
    public static int daysAlive (int days, int months, int years, int dayBorn, 
            int monthBorn , int yearBorn)
    {
        // Initalizing a local variable to hold days alive value
        int daysLived;
        
        daysLived = ((years - yearBorn) * 365) + ((months - monthBorn) * 30) 
                + (days - dayBorn);
        
        return daysLived;
    }
    
    public FrmSleep() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBirthdate = new javax.swing.JLabel();
        lblTodaysDate = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        lblBirthMonth = new javax.swing.JLabel();
        txtBirthMonth = new javax.swing.JTextField();
        lblBirthYear = new javax.swing.JLabel();
        txtBirthYear = new javax.swing.JTextField();
        lblDay = new javax.swing.JLabel();
        txtToday = new javax.swing.JTextField();
        lblMonth = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblDaysAlive = new javax.swing.JLabel();
        lblHoursSlept = new javax.swing.JLabel();
        txtDaysAlive = new javax.swing.JLabel();
        txtHrsSlept = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("Sleep Calculator");

        lblBirthdate.setText("Enter Your Birthdate");

        lblTodaysDate.setText("Enter Todays Date");

        lblBirthday.setText("Day");

        lblBirthMonth.setText("Month");

        lblBirthYear.setText("Year");

        lblDay.setText("Day");

        lblMonth.setText("Month");

        lblYear.setText("Year");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblDaysAlive.setText("You have been alive for:");

        lblHoursSlept.setText("You have slept:");

        txtDaysAlive.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtDaysAlive.setText("          ");

        txtHrsSlept.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtHrsSlept.setText("       ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblBirthdate)
                        .addGap(108, 108, 108)
                        .addComponent(lblTodaysDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBirthMonth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(lblMonth)
                                .addGap(12, 12, 12)
                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBirthYear)
                                    .addGap(24, 24, 24)
                                    .addComponent(txtBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(138, 138, 138)
                                    .addComponent(lblYear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBirthday)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(144, 144, 144)
                                    .addComponent(lblDay)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                    .addComponent(txtToday, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalculate)
                    .addComponent(btnExit))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDaysAlive)
                    .addComponent(lblHoursSlept))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDaysAlive, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHrsSlept, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirthdate)
                    .addComponent(lblTodaysDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBirthday)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDay)
                        .addComponent(txtToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBirthMonth)
                        .addComponent(txtBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMonth)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBirthYear)
                        .addComponent(txtBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblYear)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalculate)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDaysAlive)
                            .addComponent(txtDaysAlive))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHoursSlept)
                        .addComponent(txtHrsSlept)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Initalizing a constant int variable for the daily sleep amount 
        final int SLEEP_AMOUNT = 8;

        // Initializing int variables to hold birthdate values
        int birthDay = 0;
        int birthMonth = 0;
        int birthYear = 0;
        
        // Initializing int variables to hold current date values
        int currentDay = 0;
        int currentMonth = 0;
        int currentYear = 0;
        
        // Initializing int variables to hold total days and sleep values
        int totalDaysAlive;
        int totalSleepHours;
        
        // Declaring boolean variables that will be used in error checking
        boolean value1 = false;
        boolean value2 = false;
        boolean value3 = false;
        boolean value4 = false;
        boolean value5 = false;
        boolean value6 = false;
        
        // Getting birthdate values from user, and confirming correct data-type is used
        try
        {
            // Getting user input and stroring it in a variable
            birthDay = Integer.parseInt(txtBirthday.getText());
            value1 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            txtDaysAlive.setText("Incorrect input detected");
            txtHrsSlept.setText("Incorrect input detected");
        }
        
        try
        {
            // Getting user input and stroring it in a variable
            birthMonth = Integer.parseInt(txtBirthMonth.getText());
            value2 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            txtDaysAlive.setText("Incorrect input detected");
            txtHrsSlept.setText("Incorrect input detected");
        }
        
        try
        {
            // Getting user input and stroring it in a variable
            birthYear = Integer.parseInt(txtBirthYear.getText());
            value3 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            txtDaysAlive.setText("Incorrect input detected");
            txtHrsSlept.setText("Incorrect input detected");
        }

        // Getting current date values from user, and confirming correct data-type is used
        try
        {
            // Getting user input and storing it in a variable
            currentDay = Integer.parseInt(txtToday.getText());
            value4 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            txtDaysAlive.setText("Incorrect input detected");
            txtHrsSlept.setText("Incorrect input detected");
        }
        
        try
        {
            // Getting user input and storing it in a variable
            currentMonth = Integer.parseInt(txtMonth.getText());
            value5 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            txtDaysAlive.setText("Incorrect input detected");
            txtHrsSlept.setText("Incorrect input detected");
        }
        
        try
        {
            // Getting user input and storing it in a variable
            currentYear = Integer.parseInt(txtYear.getText());
            value6 = true;
        }
        catch (NumberFormatException e)
        {
            // Outputting error message if incorrect value is entered
            txtDaysAlive.setText("Incorrect input detected");
            txtHrsSlept.setText("Incorrect input detected");
        }
        
        // Passing the data attained from the user to the "daysAlive" method
        totalDaysAlive = daysAlive(currentDay, currentMonth, currentYear,
                birthDay, birthMonth, birthYear);
        
        // Multiplying the amout of days the user has lived by contant sleep amount
        totalSleepHours = totalDaysAlive * SLEEP_AMOUNT;
        
        if (value1 && value2 && value3 && value4 && value5 && value6) 
        { 
            // Outputting the amount of the days the user has lived to the GUI
            txtDaysAlive.setText(String.valueOf(totalDaysAlive) + " days");

            // Outputting the amount of hours the user has slept to the GUI
            txtHrsSlept.setText(String.valueOf(totalSleepHours) + " hours");
        }        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Closing program if the exit button is pressed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSleep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblBirthMonth;
    private javax.swing.JLabel lblBirthYear;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDaysAlive;
    private javax.swing.JLabel lblHoursSlept;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTodaysDate;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBirthMonth;
    private javax.swing.JTextField txtBirthYear;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JLabel txtDaysAlive;
    private javax.swing.JLabel txtHrsSlept;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtToday;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

}
