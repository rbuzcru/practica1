package Ejercicios9_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.BoxLayout;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class frame extends JFrame implements ActionListener, ItemListener, ChangeListener {
	private JTextField textField;
	JProgressBar progressBar = new JProgressBar();
	JComboBox<String> comboBox = new JComboBox<>();
	JSpinner spinner = new JSpinner();
	private JSlider slider;
	JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		progressBar.setBounds(142, 236, 146, 14);
		getContentPane().add(progressBar);
		progressBar.setValue(0);
		progressBar.addChangeListener(this);

		textField = new JTextField();
		textField.setBounds(10, 64, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.addActionListener(this);
		
		JCheckBox chkbox = new JCheckBox("Clica");
		chkbox.setBounds(6, 114, 97, 23);
		getContentPane().add(chkbox);
		chkbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (chkbox.isSelected()) {
					progressBar.setValue(progressBar.getValue() + 20);
				} else {
					progressBar.setValue(progressBar.getValue() - 20);
				}
			}
		});
		comboBox.setBounds(168, 23, 115, 22);
		comboBox.addItem("Seleccione una opción");
		comboBox.addItem("1+1=2");
		comboBox.addItem("1+1=3");
		comboBox.addItem("1+1=1");
		getContentPane().add(comboBox);
		comboBox.addItemListener(this);

		spinner.setBounds(352, 64, 72, 20);
		getContentPane().add(spinner);
		spinner.setValue(50);
		spinner.addChangeListener(this);

		slider = new JSlider();
		slider.setBounds(278, 114, 146, 26);
		getContentPane().add(slider);
		slider.addChangeListener(this);

		
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\tarde\\eclipse-workspace\\Ejercicios\\src\\ejercicio1\\imagenes\\descarga.jfif"));
		lblNewLabel.setBounds(89, 64, 178, 161);
		getContentPane().add(lblNewLabel);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			if (comboBox.getSelectedItem() == "1+1=2") {
				progressBar.setValue(progressBar.getValue() + 10);
			} else {
				progressBar.setValue(progressBar.getValue() - 10);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==textField) {
			if(textField.getText().equals("abrete")) {
				progressBar.setValue(progressBar.getValue() + 20);
			} else {
				progressBar.setValue(progressBar.getValue() - 20);
			}
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == spinner) {
			if (spinner.getValue() == (Object) 100) {
				progressBar.setValue(progressBar.getValue() + 20);
			} else {
				progressBar.setValue(progressBar.getValue() - 20);
			}
		}
		if (e.getSource() == slider) {
			if (slider.getValue()==100) {
				progressBar.setValue(progressBar.getValue() + 20);
			} else {
				progressBar.setValue(progressBar.getValue() - 1);
				}
		}
		if(e.getSource()==progressBar) {
			if(progressBar.getValue()==100) {
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tarde\\eclipse-workspace\\Ejercicios\\src\\ejercicio1\\imagenes\\caja.jfif"));
			}
			else {
				lblNewLabel.setIcon(new ImageIcon(
						"C:\\Users\\tarde\\eclipse-workspace\\Ejercicios\\src\\ejercicio1\\imagenes\\descarga.jfif"));
			}
		}

	}

}
