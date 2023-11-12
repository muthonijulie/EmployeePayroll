import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.EtchedBorder;

public class empPay {

	private JFrame frmGeorge;
	private JTextField textField;
	private JTextField textFieldempName;
	private JTextField textFieldhrlSal;
	private JTextField textFieldMon1;
	private JTextField textFieldTue1;
	private JTextField textFieldWd1;
	private JTextField textFieldThur1;
	private JTextField textFieldFrd1;
	private JTextField textFieldSt1;
	private JTextField textFieldSun1;
	private JTextField textFieldMon2;
	private JTextField textFieldTue2;
	private JTextField textFieldWd2;
	private JTextField textFieldThur2;
	private JTextField textFieldFrd2;
	private JTextField textFieldSt2;
	private JTextField textFieldSun2;
	private JTextField textFieldReghrs;
	private JTextField textFieldOvtHrs;
	private JTextField textFieldRegamt;
	private JTextField textFieldOvtAmt;
	private JTextField textFieldNetpay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					empPay window = new empPay();
					window.frmGeorge.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public empPay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				frmGeorge = new JFrame();
				frmGeorge.setBackground(new Color(0, 0, 255));
				frmGeorge.setForeground(new Color(255, 255, 255));
				frmGeorge.setFont(new Font("Tahoma", Font.BOLD, 16));
				frmGeorge.setTitle("Georgetown Cleaning Services-Employee Payroll");
		frmGeorge.setBounds(100, 100, 936, 522);
		frmGeorge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorge.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(24, 24, 870, 113);
		frmGeorge.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(48, 32, 92, 27);
		panel.add(lblNewLabel_1);
		
		textFieldempName = new JTextField();
		textFieldempName.setBounds(154, 36, 318, 20);
		panel.add(textFieldempName);
		textFieldempName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hourly Salary:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(506, 39, 82, 20);
		panel.add(lblNewLabel_2);
		
		textFieldhrlSal = new JTextField();
		textFieldhrlSal.setBounds(590, 40, 114, 20);
		panel.add(textFieldhrlSal);
		textFieldhrlSal.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Time Sheet", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(24, 148, 870, 169);
		frmGeorge.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_3 = new JLabel("First Week:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(36, 57, 70, 25);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Second Week:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(36, 93, 94, 25);
		panel_1.add(lblNewLabel_4);
		
		textFieldMon1 = new JTextField();
		textFieldMon1.setBounds(139, 60, 86, 20);
		panel_1.add(textFieldMon1);
		textFieldMon1.setColumns(10);
		
		textFieldTue1 = new JTextField();
		textFieldTue1.setBounds(235, 60, 86, 20);
		panel_1.add(textFieldTue1);
		textFieldTue1.setColumns(10);
		
		textFieldWd1 = new JTextField();
		textFieldWd1.setBounds(331, 60, 86, 20);
		panel_1.add(textFieldWd1);
		textFieldWd1.setColumns(10);
		
		textFieldThur1 = new JTextField();
		textFieldThur1.setBounds(427, 60, 86, 20);
		panel_1.add(textFieldThur1);
		textFieldThur1.setColumns(10);
		
		textFieldFrd1 = new JTextField();
		textFieldFrd1.setBounds(523, 60, 86, 20);
		panel_1.add(textFieldFrd1);
		textFieldFrd1.setColumns(10);
		
		textFieldSt1 = new JTextField();
		textFieldSt1.setBounds(619, 60, 86, 20);
		panel_1.add(textFieldSt1);
		textFieldSt1.setColumns(10);
		
		textFieldSun1 = new JTextField();
		textFieldSun1.setBounds(715, 60, 86, 20);
		panel_1.add(textFieldSun1);
		textFieldSun1.setColumns(10);
		
		textFieldMon2 = new JTextField();
		textFieldMon2.setBounds(139, 96, 86, 20);
		panel_1.add(textFieldMon2);
		textFieldMon2.setColumns(10);
		
		textFieldTue2 = new JTextField();
		textFieldTue2.setBounds(235, 96, 86, 20);
		panel_1.add(textFieldTue2);
		textFieldTue2.setColumns(10);
		
		textFieldWd2 = new JTextField();
		textFieldWd2.setBounds(331, 96, 86, 20);
		panel_1.add(textFieldWd2);
		textFieldWd2.setColumns(10);
		
		textFieldThur2 = new JTextField();
		textFieldThur2.setBounds(427, 96, 86, 20);
		panel_1.add(textFieldThur2);
		textFieldThur2.setColumns(10);
		
		textFieldFrd2 = new JTextField();
		textFieldFrd2.setBounds(523, 96, 86, 20);
		panel_1.add(textFieldFrd2);
		textFieldFrd2.setColumns(10);
		
		textFieldSt2 = new JTextField();
		textFieldSt2.setBounds(619, 96, 86, 20);
		panel_1.add(textFieldSt2);
		textFieldSt2.setColumns(10);
		
		textFieldSun2 = new JTextField();
		textFieldSun2.setBounds(715, 96, 86, 20);
		panel_1.add(textFieldSun2);
		textFieldSun2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Monday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(152, 29, 73, 25);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tuesday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(248, 29, 57, 20);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Wednesday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(343, 29, 74, 20);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Thursday");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(445, 29, 63, 20);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Friday");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(543, 29, 66, 20);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Saturday");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(631, 29, 74, 20);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Sunday");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(731, 29, 57, 20);
		panel_1.add(lblNewLabel_11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_2.setBounds(24, 327, 870, 145);
		frmGeorge.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Process It");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empNam;
				double hourly,Mon1,Mon2,Tue1,Tue2,Wed1,Wed2,Thur1,Thur2,Fri1,Fri2,Sat1,Sat2,Sun1,Sun2,regHrs,regAmt,ovtHrs,ovtAmt,netPay;
				
				empNam= textFieldempName.getText();
				hourly=Double.parseDouble(textFieldhrlSal.getText());
				Mon1=Double.parseDouble(textFieldMon1.getText());
				Mon2=Double.parseDouble(textFieldMon2.getText());
				Tue1=Double.parseDouble(textFieldTue1.getText());
				Tue2=Double.parseDouble(textFieldTue2.getText());
				Wed1=Double.parseDouble(textFieldWd1.getText());
			    Wed2=Double.parseDouble(textFieldWd2.getText());
				Thur1=Double.parseDouble(textFieldThur1.getText());
				Thur2=Double.parseDouble(textFieldThur2.getText());
				Fri1=Double.parseDouble(textFieldFrd1.getText());
				Fri2=Double.parseDouble(textFieldFrd2.getText());
				Sat1=Double.parseDouble(textFieldSt1.getText());
				Sat2=Double.parseDouble(textFieldSt2.getText());
				Sun1=Double.parseDouble(textFieldSun1.getText());
				Sun2=Double.parseDouble(textFieldSun2.getText());
				
			   double TtHrs=Mon1+Mon2+Tue1+Tue2+Wed1+Wed2+Thur1+Thur2+Fri1+Fri2+Sat1+Sat2+Sun1+Sun2;
			   ovtHrs=(Mon2-8)+(Tue2-8)+(Wed2-8)+(Thur2-8);
			   regHrs=TtHrs-ovtHrs;
				textFieldReghrs.setText(String.valueOf(regHrs));
				regAmt=hourly*regHrs;
				textFieldRegamt.setText(String.valueOf(regAmt));


				 
				 textFieldOvtHrs.setText(String.valueOf(ovtHrs));
				 ovtAmt=27.78*ovtHrs;
				 DecimalFormat df = new DecimalFormat("0.00");
				 textFieldOvtAmt.setText(String.valueOf(df.format(ovtAmt)));
				
				 netPay=regAmt+ovtAmt;
				 textFieldNetpay.setText(String.valueOf(netPay));
				 

				
			}
		});
		btnNewButton.setBounds(23, 24, 108, 95);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_12 = new JLabel("Regular:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(156, 65, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Overtime");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(156, 105, 62, 14);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Hours");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(241, 34, 55, 14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Amount");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(351, 34, 55, 14);
		panel_2.add(lblNewLabel_15);
		
		textFieldReghrs = new JTextField();
		textFieldReghrs.setBounds(223, 62, 86, 20);
		panel_2.add(textFieldReghrs);
		textFieldReghrs.setColumns(10);
		
		textFieldOvtHrs = new JTextField();
		textFieldOvtHrs.setBounds(223, 99, 86, 20);
		panel_2.add(textFieldOvtHrs);
		textFieldOvtHrs.setColumns(10);
		
		textFieldRegamt = new JTextField();
		textFieldRegamt.setBounds(331, 62, 86, 20);
		panel_2.add(textFieldRegamt);
		textFieldRegamt.setColumns(10);
		
		textFieldOvtAmt = new JTextField();
		textFieldOvtAmt.setBounds(331, 99, 86, 20);
		panel_2.add(textFieldOvtAmt);
		textFieldOvtAmt.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Net Pay:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16.setBounds(521, 80, 63, 14);
		panel_2.add(lblNewLabel_16);
		
		textFieldNetpay = new JTextField();
		textFieldNetpay.setBounds(588, 78, 86, 20);
		panel_2.add(textFieldNetpay);
		textFieldNetpay.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(701, 32, 101, 81);
		panel_2.add(btnNewButton_1);
	}
}
