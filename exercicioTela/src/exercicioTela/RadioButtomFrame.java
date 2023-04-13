package exercicioTela;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtomFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Font plainFont;
	private Font boldFont; 
	private Font italicFont;
	private Font boldItalicFont;
	private JRadioButton plainJRadionButtom;
	private JRadioButton boldJRadionButtom;
	private JRadioButton italicJRadionButtom;
	private JRadioButton boldItalicJRadionButtom;
	private ButtonGroup radioGroup;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtomFrame frame = new RadioButtomFrame();
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
	public RadioButtomFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change",25);
		add(textField);
		
		plainJRadionButtom = new JRadioButton("Plain", true);
		boldJRadionButtom = new JRadioButton("Bold", false);
		italicJRadionButtom = new JRadioButton("Italic", false);
		boldItalicJRadionButtom = new JRadioButton("Bold Italic", false);
		
		add(plainJRadionButtom);
		add(boldJRadionButtom);
		add(italicJRadionButtom);
		add(boldItalicJRadionButtom);
		
		
	// cria relacionamento logico entre JRadioButtons
		
		radioGroup = new ButtonGroup();
		
		radioGroup.add(plainJRadionButtom);
		radioGroup.add(boldJRadionButtom);
		radioGroup.add(italicJRadionButtom);
		radioGroup.add(boldItalicJRadionButtom);
		
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD,14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serfi", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		//evntos
		
		plainJRadionButtom.addItemListener(new RadioButtonHandler(plainFont));
		boldJRadionButtom.addItemListener(new RadioButtonHandler(boldFont));
		italicJRadionButtom.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicJRadionButtom.addItemListener(new RadioButtonHandler(boldItalicFont));
		
		// cria fonte objetos
	}

	private class RadioButtonHandler implements ItemListener {
		private Font font;
		
		public RadioButtonHandler(Font f) {
			font = f;
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			textField.setFont(font);
			
		}
		
		
		
	}
}
