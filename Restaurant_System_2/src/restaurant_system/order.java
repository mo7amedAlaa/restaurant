/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant_system;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed
 */
public class order extends javax.swing.JFrame {

    /**
     * Creates new form order
     */
    int meat1num, meat2num, meat3num, meat4num, meat5num;
    double meat1price, meat2price, meat3price, meat4price, meat5price;
    final double meat1cost = 25.0, meat2cost = 20.0, meat3cost = 30.5, meat4cost = 60.0, meat5cost = 40.0;
    int chekin1num, chekin2num, chekin3num, chekin4num, chekin5num;
    double chekin1price, chekin2price, chekin3price, chekin4price, chekin5price;
    final double chekin1cost = 20.0, chekin2cost = 29.5, chekin3cost = 30.5, chekin4cost = 60.5, chekin5cost = 70.0;
    int add1num, add2num, add3num, add4num, add5num;
    double add1price, add2price, add3price, add4price, add5price;
    final double add1cost = 25.0, add2cost = 20.0, add3cost = 30.5, add4cost = 60.0, add5cost = 40.0;
    int drunk1num, drunk2num, drunk3num, drunk4num, drunk5num;
    double drunk1price, drunk2price, drunk3price, drunk4price, drunk5price;
    final double drunk1cost = 25.0, drunk2cost = 20.0, drunk3cost = 30.5, drunk4cost = 60.0, drunk5cost = 40.0;
    int sweet1num, sweet2num, sweet3num, sweet4num, sweet5num;
    double sweet1price, sweet2price, sweet3price, sweet4price, sweet5price;
    final double sweet1cost = 25.0, sweet2cost = 20.0, sweet3cost = 30.5, sweet4cost = 60.0, sweet5cost = 40.0;
    double subtotal, teps, sumtotal;
    int ordercounter;
    PrintWriter outorder;

    public order() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chekinSpinner1 = new javax.swing.JSpinner();
        chekinSpinner2 = new javax.swing.JSpinner();
        chekinSpinner3 = new javax.swing.JSpinner();
        chekinSpinner5 = new javax.swing.JSpinner();
        chekinSpinner4 = new javax.swing.JSpinner();
        chekin_edt1 = new javax.swing.JLabel();
        chekin_edt2 = new javax.swing.JLabel();
        chekin_edt3 = new javax.swing.JLabel();
        chekin_edt4 = new javax.swing.JLabel();
        chekin_edt5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        meatSpinner1 = new javax.swing.JSpinner();
        meatSpinner2 = new javax.swing.JSpinner();
        meatSpinner3 = new javax.swing.JSpinner();
        meatSpinner5 = new javax.swing.JSpinner();
        meatSpinner4 = new javax.swing.JSpinner();
        meat_edt1 = new javax.swing.JLabel();
        meat_edt2 = new javax.swing.JLabel();
        meat_edt3 = new javax.swing.JLabel();
        meat_edt4 = new javax.swing.JLabel();
        meat_edt5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        addSpinner1 = new javax.swing.JSpinner();
        addSpinner2 = new javax.swing.JSpinner();
        addSpinner3 = new javax.swing.JSpinner();
        addSpinner5 = new javax.swing.JSpinner();
        addSpinner4 = new javax.swing.JSpinner();
        add_edt1 = new javax.swing.JLabel();
        add_edt5 = new javax.swing.JLabel();
        add_edt4 = new javax.swing.JLabel();
        add_edt3 = new javax.swing.JLabel();
        add_edt2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        drunkSpinner1 = new javax.swing.JSpinner();
        drunkSpinner2 = new javax.swing.JSpinner();
        drunkSpinner3 = new javax.swing.JSpinner();
        drunkSpinner5 = new javax.swing.JSpinner();
        drunkSpinner4 = new javax.swing.JSpinner();
        drunk_edt1 = new javax.swing.JLabel();
        drunk_edt2 = new javax.swing.JLabel();
        drunk_edt3 = new javax.swing.JLabel();
        drunk_edt4 = new javax.swing.JLabel();
        drunk_edt5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        sweetSpinner1 = new javax.swing.JSpinner();
        sweetSpinner2 = new javax.swing.JSpinner();
        sweetSpinner3 = new javax.swing.JSpinner();
        sweetSpinner5 = new javax.swing.JSpinner();
        sweetSpinner4 = new javax.swing.JSpinner();
        sweet_edt1 = new javax.swing.JLabel();
        sweet_edt2 = new javax.swing.JLabel();
        sweet_edt3 = new javax.swing.JLabel();
        sweet_edt4 = new javax.swing.JLabel();
        sweet_edt5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sumtext = new javax.swing.JLabel();
        sumtext1 = new javax.swing.JLabel();
        sumtext2 = new javax.swing.JLabel();
        sum_edt = new javax.swing.JLabel();
        total_edt = new javax.swing.JLabel();
        teps_edt = new javax.swing.JLabel();
        billtext = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        طلب = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" الدجاج");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("تشيكن فيليه عادى ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("  تشكن برجر ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("بيج تيستي تشيكن");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("تشيكن فيليه سبايسي");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("فاميلي تشيكن ");

        chekinSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chekinSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chekinSpinner1StateChanged(evt);
            }
        });

        chekinSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chekinSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chekinSpinner2StateChanged(evt);
            }
        });

        chekinSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chekinSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chekinSpinner3StateChanged(evt);
            }
        });

        chekinSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chekinSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chekinSpinner5StateChanged(evt);
            }
        });

        chekinSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chekinSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chekinSpinner4StateChanged(evt);
            }
        });

        chekin_edt1.setText("0.0جنية");

        chekin_edt2.setText("0.0جنية");

        chekin_edt3.setText("0.0جنية");

        chekin_edt4.setText("0.0جنية");

        chekin_edt5.setText("0.0جنية");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_system/Double-McChicken.png"))); // NOI18N
        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chekinSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chekinSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chekinSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chekinSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chekinSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chekin_edt1)
                            .addComponent(chekin_edt2)
                            .addComponent(chekin_edt3)
                            .addComponent(chekin_edt5)
                            .addComponent(chekin_edt4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chekinSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekin_edt1))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekinSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekin_edt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekinSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekin_edt3))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekinSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekin_edt4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekinSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekin_edt5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("اللحوم");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("تشيز برجر  مشروم");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("تشيز برجر ديلوكس");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("تشيز برجر");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("ليتل تايستي");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("فاميلي رويال");

        meatSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatSpinner1StateChanged(evt);
            }
        });

        meatSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatSpinner2StateChanged(evt);
            }
        });

        meatSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatSpinner3StateChanged(evt);
            }
        });

        meatSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatSpinner5StateChanged(evt);
            }
        });

        meatSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatSpinner4StateChanged(evt);
            }
        });

        meat_edt1.setText("0.0جنية");

        meat_edt2.setText("0.0جنية");

        meat_edt3.setText("0.0جنية");

        meat_edt4.setText("0.0جنية");

        meat_edt5.setText("0.0جنية");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_system/Double-McRoyal.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(meatSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(meatSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(meatSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(meatSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meatSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meat_edt4)
                                    .addComponent(meat_edt5)
                                    .addComponent(meat_edt3)
                                    .addComponent(meat_edt2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(meat_edt1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel13)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meat_edt1))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meat_edt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meat_edt3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meat_edt4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meat_edt5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("اضافات");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("قطع دجاج");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("سلطة خضرا ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("فرايز");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("تشيدر تشيز فرايز");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("شرائح الجزر");

        addSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        addSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addSpinner1StateChanged(evt);
            }
        });

        addSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        addSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addSpinner2StateChanged(evt);
            }
        });

        addSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        addSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addSpinner3StateChanged(evt);
            }
        });

        addSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        addSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addSpinner5StateChanged(evt);
            }
        });

        addSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        addSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addSpinner4StateChanged(evt);
            }
        });

        add_edt1.setText("0.0جنية");

        add_edt5.setText("0.0جنية");

        add_edt4.setText("0.0جنية");

        add_edt3.setText("0.0جنية");

        add_edt2.setText("0.0جنية");

        jLabel8.setText(" ");

        jLabel21.setIcon(new javax.swing.ImageIcon("A:\\Projects\\java projet\\Restaurant_System_2\\src\\restaurant_system\\up.jpg")); // NOI18N
        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel29)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(addSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(add_edt4))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(addSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(add_edt3))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(addSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(add_edt5))))
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(addSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(add_edt1))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(addSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(add_edt2)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_edt1)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_edt2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_edt3))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_edt4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_edt5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText(" مشروبات");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("كابوتشينو");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText(" كوكاكولا");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("موكاتشينو");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("عصير التفاح");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("الشوكولاتة الساخنة");

        drunkSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        drunkSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drunkSpinner1StateChanged(evt);
            }
        });

        drunkSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        drunkSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drunkSpinner2StateChanged(evt);
            }
        });

        drunkSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        drunkSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drunkSpinner3StateChanged(evt);
            }
        });

        drunkSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        drunkSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drunkSpinner5StateChanged(evt);
            }
        });

        drunkSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        drunkSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drunkSpinner4StateChanged(evt);
            }
        });

        drunk_edt1.setText("0.0جنية");

        drunk_edt2.setText("0.0جنية");

        drunk_edt3.setText("0.0جنية");

        drunk_edt4.setText("0.0جنية");

        drunk_edt5.setText("0.0جنية");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mohamed\\Dropbox\\PC\\Desktop\\New folder\\يب.png")); // NOI18N
        jLabel22.setText("jLabel22");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(100, 100, 100))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drunkSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(drunkSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(drunkSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addGap(18, 18, 18)
                                        .addComponent(drunkSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(drunkSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel41)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drunk_edt4)
                    .addComponent(drunk_edt5)
                    .addComponent(drunk_edt3)
                    .addComponent(drunk_edt2)
                    .addComponent(drunk_edt1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(drunkSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drunk_edt1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drunkSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drunk_edt2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drunkSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drunk_edt3))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drunk_edt4)
                    .addComponent(drunkSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drunkSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drunk_edt5))
                .addGap(36, 36, 36))
        );

        jPanel6.setBackground(new java.awt.Color(51, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("الحلو");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("فطيرة الفراولة بالكاسترد");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("آيس كريم صانداي فراولة");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("آپل پأي");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("آيس كريم كون ");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("فاميلي ايس ");

        sweetSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        sweetSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sweetSpinner1StateChanged(evt);
            }
        });

        sweetSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        sweetSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sweetSpinner2StateChanged(evt);
            }
        });

        sweetSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        sweetSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sweetSpinner3StateChanged(evt);
            }
        });

        sweetSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        sweetSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sweetSpinner5StateChanged(evt);
            }
        });

        sweetSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        sweetSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sweetSpinner4StateChanged(evt);
            }
        });

        sweet_edt1.setText("0.0جنية");

        sweet_edt2.setText("0.0جنية");

        sweet_edt3.setText("0.0جنية");

        sweet_edt4.setText("0.0جنية");

        sweet_edt5.setText("0.0جنية");

        jLabel10.setIcon(new javax.swing.ImageIcon("A:\\Projects\\java projet\\Restaurant_System_2\\src\\restaurant_system\\po.png")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sweetSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sweetSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sweetSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sweetSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(sweetSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sweet_edt5)
                            .addComponent(sweet_edt4)
                            .addComponent(sweet_edt2)
                            .addComponent(sweet_edt3)
                            .addComponent(sweet_edt1)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel49)
                        .addGap(84, 84, 84)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel25))
                        .addGap(54, 54, 54)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sweetSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweet_edt1)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweetSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweet_edt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweetSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweet_edt3))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(sweetSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweet_edt4))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sweet_edt5)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweetSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));

        sumtext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sumtext.setText("المجموع:");

        sumtext1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sumtext1.setText("الاجمالي");

        sumtext2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sumtext2.setText("التبس:");

        sum_edt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sum_edt.setText(" 0.0جنية ");

        total_edt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total_edt.setText(" 0.0جنية ");

        teps_edt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        teps_edt.setText(" 0.0جنية ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teps_edt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumtext2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sum_edt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(sumtext, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(total_edt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumtext1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum_edt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sumtext2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teps_edt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_edt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        billtext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        billtext.setText("رقم الفاتورة : 0");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("التالي");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("السابق");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText(" Make Order");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        طلب.setBackground(new java.awt.Color(51, 51, 255));
        طلب.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        طلب.setText("الفاتورة");
        طلب.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                طلبActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("طلب جديد");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("طلب");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(طلب, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(طلب, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(566, 566, 566))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(billtext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(billtext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meatSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatSpinner2StateChanged
        meat2num = (Integer) meatSpinner2.getValue();
        meat2price = meat1cost * meat2num;
        meat_edt2.setText(meat2price + "جنية");
    }//GEN-LAST:event_meatSpinner2StateChanged

    private void meatSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatSpinner1StateChanged
        meat1num = (Integer) meatSpinner1.getValue();
        meat1price = meat1cost * meat1num;
        meat_edt1.setText(meat1price + "جنية");
    }//GEN-LAST:event_meatSpinner1StateChanged

    private void meatSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatSpinner3StateChanged
        // TODO add your handling code here:
        meat3num = (Integer) meatSpinner3.getValue();
        meat3price = meat1cost * meat3num;
        meat_edt3.setText(meat3price + "جنية");
    }//GEN-LAST:event_meatSpinner3StateChanged

    private void meatSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatSpinner4StateChanged
        // TODO add your handling code here:
        meat4num = (Integer) meatSpinner4.getValue();
        meat4price = meat4cost * meat4num;
        meat_edt4.setText(meat4price + "جنية");
    }//GEN-LAST:event_meatSpinner4StateChanged

    private void meatSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatSpinner5StateChanged
        // TODO add your handling code here:
        meat5num = (Integer) meatSpinner5.getValue();
        meat5price = meat5cost * meat5num;
        meat_edt5.setText(meat5price + "جنية");
    }//GEN-LAST:event_meatSpinner5StateChanged

    private void chekinSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chekinSpinner1StateChanged
        // TODO add your handling code here:
        chekin1num = (Integer) chekinSpinner1.getValue();
        chekin1price = chekin1cost * chekin1num;
        chekin_edt1.setText(chekin1price + "جنية");

    }//GEN-LAST:event_chekinSpinner1StateChanged

    private void chekinSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chekinSpinner2StateChanged
        chekin2num = (Integer) chekinSpinner2.getValue();
        chekin2price = chekin2cost * chekin2num;
        chekin_edt2.setText(chekin2price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_chekinSpinner2StateChanged

    private void chekinSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chekinSpinner3StateChanged
        chekin3num = (Integer) chekinSpinner3.getValue();
        chekin3price = chekin3cost * chekin3num;
        chekin_edt3.setText(chekin3price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_chekinSpinner3StateChanged

    private void chekinSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chekinSpinner4StateChanged
        chekin4num = (Integer) chekinSpinner4.getValue();
        chekin4price = chekin4cost * chekin4num;
        chekin_edt4.setText(chekin4price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_chekinSpinner4StateChanged

    private void chekinSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chekinSpinner5StateChanged
        chekin5num = (Integer) chekinSpinner5.getValue();
        chekin5price = chekin5cost * chekin5num;
        chekin_edt5.setText(chekin5price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_chekinSpinner5StateChanged

    private void addSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addSpinner1StateChanged
        add1num = (Integer) addSpinner1.getValue();
        add1price = add1cost * add1num;
        add_edt1.setText(add1price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_addSpinner1StateChanged

    private void addSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addSpinner2StateChanged
        add2num = (Integer) addSpinner2.getValue();
        add2price = add2cost * add2num;
        add_edt2.setText(add2price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_addSpinner2StateChanged

    private void addSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addSpinner3StateChanged
        add3num = (Integer) addSpinner3.getValue();
        add3price = add3cost * add3num;
        add_edt3.setText(add3price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_addSpinner3StateChanged

    private void addSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addSpinner4StateChanged
        add4num = (Integer) addSpinner4.getValue();
        add4price = add4cost * add4num;
        add_edt4.setText(add4price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_addSpinner4StateChanged

    private void addSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addSpinner5StateChanged
        add5num = (Integer) addSpinner5.getValue();
        add5price = add5cost * add5num;
        add_edt5.setText(add5price + "جنية");        // TODO add your handling code here:
    }//GEN-LAST:event_addSpinner5StateChanged

    private void drunkSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drunkSpinner1StateChanged
        // TODO add your handling code here:
        drunk1num = (Integer) drunkSpinner1.getValue();
        drunk1price = drunk1cost * drunk1num;
        drunk_edt1.setText(drunk1price + "جنية");
    }//GEN-LAST:event_drunkSpinner1StateChanged

    private void drunkSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drunkSpinner2StateChanged
        drunk2num = (Integer) drunkSpinner2.getValue();
        drunk2price = drunk2cost * drunk2num;
        drunk_edt2.setText(drunk2price + "جنية");         // TODO add your handling code here:
    }//GEN-LAST:event_drunkSpinner2StateChanged

    private void drunkSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drunkSpinner3StateChanged
        drunk3num = (Integer) drunkSpinner3.getValue();
        drunk3price = drunk3cost * drunk3num;
        drunk_edt3.setText(drunk3price + "جنية");         // TODO add your handling code here:
    }//GEN-LAST:event_drunkSpinner3StateChanged

    private void drunkSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drunkSpinner4StateChanged
        drunk4num = (Integer) drunkSpinner4.getValue();
        drunk4price = drunk4cost * drunk4num;
        drunk_edt4.setText(drunk4price + "جنية");         // TODO add your handling code here:
    }//GEN-LAST:event_drunkSpinner4StateChanged

    private void drunkSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drunkSpinner5StateChanged
        drunk5num = (Integer) drunkSpinner5.getValue();
        drunk5price = drunk5cost * drunk5num;
        drunk_edt5.setText(drunk5price + "جنية");         // TODO add your handling code here:
    }//GEN-LAST:event_drunkSpinner5StateChanged

    private void sweetSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetSpinner1StateChanged
        sweet1num = (Integer) sweetSpinner1.getValue();
        sweet1price = sweet1cost * sweet1num;
        sweet_edt1.setText(sweet1price + "جنية");         // TODO add your handling code here:
    }//GEN-LAST:event_sweetSpinner1StateChanged

    private void sweetSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetSpinner2StateChanged
        sweet2num = (Integer) sweetSpinner2.getValue();
        sweet2price = sweet1cost * sweet2num;
        sweet_edt2.setText(sweet2price + "جنية");          // TODO add your handling code here:
    }//GEN-LAST:event_sweetSpinner2StateChanged

    private void sweetSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetSpinner3StateChanged
        sweet3num = (Integer) sweetSpinner3.getValue();
        sweet3price = sweet3cost * sweet3num;
        sweet_edt3.setText(sweet3price + "جنية");          // TODO add your handling code here:
    }//GEN-LAST:event_sweetSpinner3StateChanged

    private void sweetSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetSpinner4StateChanged
        sweet4num = (Integer) sweetSpinner4.getValue();
        sweet4price = sweet4cost * sweet4num;
        sweet_edt4.setText(sweet4price + "جنية");          // TODO add your handling code here:
    }//GEN-LAST:event_sweetSpinner4StateChanged

    private void sweetSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetSpinner5StateChanged
        sweet5num = (Integer) sweetSpinner5.getValue();
        sweet5price = sweet5cost * sweet5num;
        sweet_edt5.setText(sweet5price + "جنية");          // TODO add your handling code here:
    }//GEN-LAST:event_sweetSpinner5StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        subtotal = meat1price + meat2price + meat3price + meat4price + meat5price + chekin1price + chekin2price + chekin3price + chekin4price + chekin5price + add1price + add2price + add3price + add4price + add5price + drunk1price + drunk2price + drunk3price + drunk4price + drunk5price + sweet1price + sweet2price + sweet3price + sweet4price + sweet5price;
        teps = subtotal * (0.05);
        sumtotal = subtotal + teps;
        sum_edt.setText(subtotal + "جنية ");
        teps_edt.setText(teps + " جنية");
        total_edt.setText(sumtotal + " جنية");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void طلبActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_طلبActionPerformed

        
           

            if (sumtotal != 0) {
                
                
                try {
                    outorder = new PrintWriter("orderno." + ordercounter + ".txt");
                    outorder.println("******************");
                    outorder.println("family Restaurant");
                    outorder.println("******************");
                    outorder.println("رقم الفاتورة: " + ordercounter);
                    outorder.println("****************");
                    
                    if (meat1num != 0) {
                        
                        outorder.println("تشيز برجر ديلوكس" + meat1num);
                    }
                    if (meat2num != 0) {
                        
                        outorder.println("تشيز برجر  مشروم" + meat2num);
                    }
                    if (meat3num != 0) {
                        
                        outorder.println("ليتل تايستي" + meat3num);
                    }
                    if (meat4num != 0) {
                        
                        outorder.println("تشيز يرجر" + meat4num);
                    }
                    if (meat5num != 0) {
                        
                        outorder.println("فاميلي رويال" + meat5num);
                    }
                    if (chekin1num != 0) {
                        
                        outorder.println("تشكن برجر" + chekin1num);
                    }
                    if (chekin2num != 0) {
                        
                        outorder.println("تشكن فيله عادي" + chekin2num);
                    }
                    if (chekin3num != 0) {
                        
                        outorder.println("تشكن فيله سبايسي" + chekin3num);
                    }
                    if (chekin4num != 0) {
                        
                        outorder.println("بيج تيستي تشيكن" + chekin4num);
                    }
                    if (chekin5num != 0) {
                        
                        outorder.println("فاميلي تشيكن " + chekin5num);
                    }
                    if (add1num != 0) {
                        
                        outorder.println("سلطة خضرا" + add1num);
                    }
                    if (add2num != 0) {
                        
                        outorder.println("قطع دجاج" + add2num);
                    }
                    if (add3num != 0) {
                        
                        outorder.println("تشيدر تشيز فرايز" + add3num);
                    }
                    if (add4num != 0) {
                        
                        outorder.println("فرايز" + add4num);
                        
                    }
                    if (add5num != 0) {
                        
                        outorder.println("شرائح الجزر" + add5num);
                    }
                    if (drunk1num != 0) {
                        
                        outorder.println("كوكاكولا" + drunk1num);
                    }
                    if (drunk2num != 0) {
                        
                        outorder.println("كابوتشينو" + drunk2num);
                    }
                    if (drunk3num != 0) {
                        
                        outorder.println("عصير التفاح" + drunk3num);
                    }
                    if (drunk4num != 0) {
                        
                        outorder.println("موكاتشينو" + drunk4num);
                    }
                    if (drunk5num != 0) {
                        
                        outorder.println(" الشوكولاتة الساخنة" + drunk5num);
                    }
                    
                    if (sweet1num != 0) {
                        
                        outorder.println("آيس كريم صانداي فراولة" + sweet1num);
                    }
                    if (sweet2num != 0) {
                        
                        outorder.println("فطيرة الفراولة بالكاسترد" + sweet2num);
                    }
                    if (sweet3num != 0) {
                        
                        outorder.println(" آيس كريم كون" + sweet3num);
                    }
                    if (sweet4num != 0) {
                        
                        outorder.println(" آپل پأي" + sweet4num);
                    }
                    if (sweet5num != 0) {
                        
                        outorder.println(" فاميلي ايس " + sweet5num);
                    }
                    outorder.println("******************");
                    outorder.println("الحساب:" + subtotal + "جنية");
                    outorder.println("التبس :" + teps);
                    outorder.println("=================");
                    outorder.println("الاجمالي :   " + sumtotal);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            outorder.close();
          
        
    }//GEN-LAST:event_طلبActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (sumtotal != 0) {
            meatSpinner1.setValue(0);
            meatSpinner2.setValue(0);
            meatSpinner3.setValue(0);
            meatSpinner4.setValue(0);
            meatSpinner5.setValue(0);
            chekinSpinner1.setValue(0);
            chekinSpinner2.setValue(0);
            chekinSpinner3.setValue(0);
            chekinSpinner4.setValue(0);
            chekinSpinner5.setValue(0);
            addSpinner1.setValue(0);
            addSpinner2.setValue(0);
            addSpinner3.setValue(0);
            addSpinner4.setValue(0);
            addSpinner5.setValue(0);
            drunkSpinner1.setValue(0);
            drunkSpinner2.setValue(0);
            drunkSpinner3.setValue(0);
            drunkSpinner4.setValue(0);
            drunkSpinner5.setValue(0);
            sweetSpinner1.setValue(0);
            sweetSpinner2.setValue(0);
            sweetSpinner3.setValue(0);
            sweetSpinner4.setValue(0);
            sweetSpinner5.setValue(0);
            sumtotal = subtotal = teps = 0;
            sum_edt.setText(null);
            teps_edt.setText(null);
            total_edt.setText(null);
            ordercounter++;
            outorder.println("رقم الفاتورة: " + ordercounter);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new end().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner addSpinner1;
    private javax.swing.JSpinner addSpinner2;
    private javax.swing.JSpinner addSpinner3;
    private javax.swing.JSpinner addSpinner4;
    private javax.swing.JSpinner addSpinner5;
    private javax.swing.JLabel add_edt1;
    private javax.swing.JLabel add_edt2;
    private javax.swing.JLabel add_edt3;
    private javax.swing.JLabel add_edt4;
    private javax.swing.JLabel add_edt5;
    private javax.swing.JLabel billtext;
    private javax.swing.JSpinner chekinSpinner1;
    private javax.swing.JSpinner chekinSpinner2;
    private javax.swing.JSpinner chekinSpinner3;
    private javax.swing.JSpinner chekinSpinner4;
    private javax.swing.JSpinner chekinSpinner5;
    private javax.swing.JLabel chekin_edt1;
    private javax.swing.JLabel chekin_edt2;
    private javax.swing.JLabel chekin_edt3;
    private javax.swing.JLabel chekin_edt4;
    private javax.swing.JLabel chekin_edt5;
    private javax.swing.JSpinner drunkSpinner1;
    private javax.swing.JSpinner drunkSpinner2;
    private javax.swing.JSpinner drunkSpinner3;
    private javax.swing.JSpinner drunkSpinner4;
    private javax.swing.JSpinner drunkSpinner5;
    private javax.swing.JLabel drunk_edt1;
    private javax.swing.JLabel drunk_edt2;
    private javax.swing.JLabel drunk_edt3;
    private javax.swing.JLabel drunk_edt4;
    private javax.swing.JLabel drunk_edt5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner meatSpinner1;
    private javax.swing.JSpinner meatSpinner2;
    private javax.swing.JSpinner meatSpinner3;
    private javax.swing.JSpinner meatSpinner4;
    private javax.swing.JSpinner meatSpinner5;
    private javax.swing.JLabel meat_edt1;
    private javax.swing.JLabel meat_edt2;
    private javax.swing.JLabel meat_edt3;
    private javax.swing.JLabel meat_edt4;
    private javax.swing.JLabel meat_edt5;
    private javax.swing.JLabel sum_edt;
    private javax.swing.JLabel sumtext;
    private javax.swing.JLabel sumtext1;
    private javax.swing.JLabel sumtext2;
    private javax.swing.JSpinner sweetSpinner1;
    private javax.swing.JSpinner sweetSpinner2;
    private javax.swing.JSpinner sweetSpinner3;
    private javax.swing.JSpinner sweetSpinner4;
    private javax.swing.JSpinner sweetSpinner5;
    private javax.swing.JLabel sweet_edt1;
    private javax.swing.JLabel sweet_edt2;
    private javax.swing.JLabel sweet_edt3;
    private javax.swing.JLabel sweet_edt4;
    private javax.swing.JLabel sweet_edt5;
    private javax.swing.JLabel teps_edt;
    private javax.swing.JLabel total_edt;
    private javax.swing.JButton طلب;
    // End of variables declaration//GEN-END:variables
}
