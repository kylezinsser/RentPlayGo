import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RPGFrame extends JFrame {

	public RPGFrame(){
		super("RentPlayGo");
		setLayout(new BorderLayout());
		
		JPanel toolBar = new JPanel();		
		JPanel headerBar = new JPanel();
		JPanel navigationBar = new JPanel();
		JPanel blank = new JPanel();
		
		JButton logoButton = new JButton("Logo");
		JTextField searchBar = new JTextField("");
		
		toolBar.setPreferredSize(new Dimension(1000,80));
		searchBar.setPreferredSize(new Dimension(200,24));
				
		JButton homeButton = new JButton("Home");
		JButton cartButton = new JButton("Cart");
		JButton myAccountButton = new JButton("My Accout");
		JButton contactButton = new JButton("Contact");
		
		toolBar.setLayout(new BorderLayout());
		headerBar.setLayout(new BorderLayout());
		navigationBar.setLayout(new FlowLayout());
		
		headerBar.add(blank, BorderLayout.NORTH);
		headerBar.add(logoButton, BorderLayout.WEST);
		headerBar.add(searchBar, BorderLayout.EAST);
		
		navigationBar.add(homeButton);
		navigationBar.add(cartButton);
		navigationBar.add(myAccountButton);
		navigationBar.add(contactButton);		
		
		toolBar.add(headerBar, BorderLayout.CENTER);
		toolBar.add(navigationBar, BorderLayout.SOUTH);
		
		add(toolBar, BorderLayout.NORTH);
		
	}
	
	public class Handler implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
			
			
		}
		
		
		
	}
	
	
}
