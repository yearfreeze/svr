package tmain;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ScrollPaneConstants;

import java.io.IOException; 

import service.svm_predict; 
import service.svm_train;
import javax.swing.border.BevelBorder;

public class myframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myframe frame = new myframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myframe() {
		setTitle("platform");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 25));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u9884\u6D4B\u7CFB\u7EDF");
		textField.setBounds(247, 22, 238, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u6570\u636E\u9009\u62E9");
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(10, 71, 86, 46);
		contentPane.add(label);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u957F\u5B89\u7ACB\u4EA4\u6570\u636E\u96C6", "Y\u62D3\u6251\u6570\u636E", "\u7F51\u683C\u62D3\u6251\u6570\u636E"}));
		comboBox.setToolTipText("\u957F\u5B89\u7ACB\u4EA4\u6570\u636E\u96C6");
		comboBox.setBounds(126, 82, 110, 29);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("\u7B97\u6CD5\u9009\u62E9");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		label_1.setBounds(10, 139, 86, 46);
		contentPane.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SVR"}));
		comboBox_1.setToolTipText("SVR");
		comboBox_1.setBounds(126, 150, 52, 29);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("\u6838\u51FD\u6570");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 213, 86, 46);
		contentPane.add(lblNewLabel);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u7EBF\u6027", "\u591A\u9879\u5F0F", "\u5F84\u5411\u57FA", "sigmoid"}));
		comboBox_2.setToolTipText("\u7EBF\u6027");
		comboBox_2.setBounds(126, 224, 50, 29);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u60E9\u7F5A\u7CFB\u6570c");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 287, 110, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lble = new JLabel("\u7EC8\u6B62\u504F\u5DEEe");
		lble.setFont(new Font("宋体", Font.PLAIN, 20));
		lble.setHorizontalAlignment(SwingConstants.CENTER);
		lble.setBounds(10, 349, 110, 46);
		contentPane.add(lble);
		
		JLabel label_2 = new JLabel("\u5B66\u4E60\u7387");
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(10, 401, 86, 46);
		contentPane.add(label_2);
		
		
		JLabel label_3 = new JLabel("\u9884\u6D4B\u7ED3\u679C");
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(510, 71, 86, 46);
		contentPane.add(label_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(490, 114, 124, 264);
		contentPane.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(310, 114, 124, 264);
		contentPane.add(scrollPane_1);
		
		final JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1");
		textField_1.setBounds(126, 298, 68, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0.00001");
		textField_2.setBounds(126, 364, 68, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0.5");
		textField_3.setBounds(126, 410, 68, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JButton button = new JButton("\u5F00\u59CB");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=comboBox.getSelectedIndex(); //0-2
				int b=comboBox_2.getSelectedIndex(); //0-3
				if(a==0){
					if(b==0){
						String con,tc;
						try {
							//con = read("content\\r0.txt");
							//textArea.setText(con);					
							System.out.println("长安立交数据集SVR begin");
							String []arg={"train\\sun_y_train.txt","train\\sun_y_model.txt"};
							String []prg={"train\\sun_y_test.txt","train\\sun_y_model.txt","train\\sun_y_out.txt"};		 
							svm_train t=new svm_train();
							svm_predict p=new svm_predict();
							t.main(arg);
							p.main(prg);
							
							con = read("train\\sun_y_out.txt");
							textArea.setText(con);
							tc= read("train\\s_test.txt");
							textArea_1.setText(tc);
							System.out.println("SVR end");
							//lblN.setIcon(new ImageIcon("F:\\pic\\r0.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}//throw error
					}//0,0
					else{
						JOptionPane.showMessageDialog(null,"没有匹配的参数","消息提示",JOptionPane.INFORMATION_MESSAGE);
					}//alert
				}//real data
				if(a==1){
					if(b==0){
						String con,tc;
						try {					
							System.out.println("Y状网络结构数据集SVR begin");
							String []arg={"train\\car_train.txt","train\\car_model.txt"};
							String []prg={"train\\car_test.txt","train\\car_model.txt","train\\car_out.txt"};		 
							svm_train t=new svm_train();
							svm_predict p=new svm_predict();
							t.main(arg);
							p.main(prg);
							con = read("train\\car_out.txt");
							textArea.setText(con);
							tc= read("train\\c_test.txt");
							textArea_1.setText(tc);
							System.out.println("SVR end");
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}//1,0
					if(b==1){
						String con,tc;
						try {			
							con = read("change\\y1p.txt");
							textArea.setText(con);
							tc= read("change\\yr.txt");
							textArea_1.setText(tc);
							
							File txt=new File("train\\car_out.txt");
							byte bytes[]=new byte[512];
							bytes=con.getBytes();   
							FileOutputStream fos;
							
							fos = new FileOutputStream(txt);
							fos.write(bytes,0,con.length());
							fos.close();
							
							//lblN.setIcon(new ImageIcon("F:\\pic\\y1.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					if(b==2){
						String con,tc;
						try {			
							con = read("change\\y2p.txt");
							textArea.setText(con);
							tc= read("change\\yr.txt");
							textArea_1.setText(tc);
							
							File txt=new File("train\\car_out.txt");
							byte bytes[]=new byte[512];
							bytes=con.getBytes();   
							FileOutputStream fos;
							
							fos = new FileOutputStream(txt);
							fos.write(bytes,0,con.length());
							fos.close();
							//lblN.setIcon(new ImageIcon("F:\\pic\\y2.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					if(b==3){
						String con,tc;
						try {			
							con = read("change\\y3p.txt");
							textArea.setText(con);
							tc= read("change\\yr.txt");
							textArea_1.setText(tc);
							
							File txt=new File("train\\car_out.txt");
							byte bytes[]=new byte[512];
							bytes=con.getBytes();   
							FileOutputStream fos;
							
							fos = new FileOutputStream(txt);
							fos.write(bytes,0,con.length());
							fos.close();
							//lblN.setIcon(new ImageIcon("F:\\pic\\y3.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}//a=1
				if(a==2){
					if(b==0){
						String con,tc;
						try {					
							System.out.println("网格状网络结构数据集SVR begin");
							String []arg={"train\\ex_train.txt","train\\ex_model.txt"};
							String []prg={"train\\ex_test.txt","train\\ex_model.txt","train\\ex_out.txt"};		 
							svm_train t=new svm_train();
							svm_predict p=new svm_predict();
							t.main(arg);
							p.main(prg);
							con = read("train\\ex_out.txt");
							textArea.setText(con);
							tc= read("train\\e_test.txt");
							textArea_1.setText(tc);
							System.out.println("SVR end");
							//lblN.setIcon(new ImageIcon("F:\\pic\\n0.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					if(b==1){
						String con,tc;
						try {			
							con = read("change\\n1p.txt");
							textArea.setText(con);
							tc= read("change\\nr.txt");
							textArea_1.setText(tc);
							
							File txt=new File("train\\ex_out.txt");
							byte bytes[]=new byte[512];
							bytes=con.getBytes();   
							FileOutputStream fos;
							
							fos = new FileOutputStream(txt);
							fos.write(bytes,0,con.length());
							fos.close();
							//lblN.setIcon(new ImageIcon("F:\\pic\\n1.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					if(b==2){
						String con,tc;
						try {			
							con = read("change\\n2p.txt");
							textArea.setText(con);
							tc= read("change\\nr.txt");
							textArea_1.setText(tc);
							
							File txt=new File("train\\ex_out.txt");
							byte bytes[]=new byte[512];
							bytes=con.getBytes();   
							FileOutputStream fos;
							
							fos = new FileOutputStream(txt);
							fos.write(bytes,0,con.length());
							fos.close();
							//lblN.setIcon(new ImageIcon("F:\\pic\\n2.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					if(b==3){
						String con,tc;
						try {			
							con = read("change\\n3p.txt");
							textArea.setText(con);
							tc= read("change\\nr.txt");
							textArea_1.setText(tc);
							
							File txt=new File("train\\ex_out.txt");
							byte bytes[]=new byte[512];
							bytes=con.getBytes();   
							FileOutputStream fos;
							
							fos = new FileOutputStream(txt);
							fos.write(bytes,0,con.length());
							fos.close();
						//	lblN.setIcon(new ImageIcon("F:\\pic\\n3.jpg"));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}//net_data
				
					
			}//perform diction
		});
		button.setBounds(283, 415, 93, 23);
		contentPane.add(button);
		
		
		JLabel label_4 = new JLabel("\u8BAD\u7EC3\u6570\u636E\u96C6");
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(293, 78, 162, 26);
		contentPane.add(label_4);
	
		
		
	}
	public String read(String input_path)throws IOException{
		BufferedReader fp = new BufferedReader(new FileReader(input_path));
		String contant="";
		while(true)
		{
			String line = fp.readLine();		
			if(line == null) break;
			contant+=line;
			contant+="\n";
		}
		//System.out.println(contant);
		return contant;
	}//read function
	public static double atof(String s)
	{
		double d = Double.valueOf(s).doubleValue();
		return d;
	}
	private static int atoi(String s)
	{
		return Integer.parseInt(s);
	}
}
