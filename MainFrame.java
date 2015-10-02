

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import java.awt.event.*;




// Main container

public class MainFrame implements ActionListener{
	
	
	JFrame main_container;	
	JButton plus, add, create, clone, clone_repo, create_repo, add_file;
	JInternalFrame plus_frame;
	
	int plus_counter=0;
	
	int plus_button_width=85;
	int plus_button_height=30;

	
	
	
	
	MainFrame() {
	
		
	
		plus_frame = new JInternalFrame();
		
		plus_frame.setBounds(40,60,100,100);
		plus_frame.setLayout(null);
		
		
		// North pane of plus null
		BasicInternalFrameUI bi = (BasicInternalFrameUI)plus_frame.getUI();
        bi.setNorthPane(null);
		
		
		main_container = new JFrame();
		
		main_container.setSize(1366,768);
		main_container.setLayout(null);
		
		
		
		
		ImageIcon plus_icon = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/plus.png");
		
		
		plus = new JButton(plus_icon);
		plus.setBounds(31, 31, 20, 20);
		plus.setVisible(true);
		
		add = new JButton("Add");
		add.setBounds(80, 50, plus_button_width, plus_button_height);
		add.setVisible(true);
		
		add_file = new JButton("Add File");
		add_file.setBounds(0,150,250,20);
		add_file.setBackground(Color.BLUE);
		//add_file.setVisible(true);
		
		
	
		
		create = new JButton("Create");
		create.setBounds(200, 50, plus_button_width, plus_button_height);
		create.setVisible(true);
		
		create_repo = new JButton("Create Repository");
		create_repo.setBounds(0,150,250,20);
		create_repo.setBackground(Color.BLUE);
		//create_repo.setVisible(true);
		
		
		
		
		
		clone = new JButton("Clone");
		clone.setBounds(320, 50, plus_button_width, plus_button_height);
		clone.setVisible(true);
		
		clone_repo = new JButton("Clone Repository");
		clone_repo.setBounds(0,150,250,20);
		clone_repo.setBackground(Color.BLUE);
		//clone_repo.setVisible(true);
		
		
		
		
		
		
		
		
		// Adding buttons to plus frame
		
		plus_frame.add(add);
		plus_frame.add(create);
		plus_frame.add(clone);
		
		plus_frame.add(add_file);
		plus_frame.add(clone_repo);
		plus_frame.add(create_repo);
		
		

		plus.addActionListener(this);
		add.addActionListener(this);
		create.addActionListener(this);
		clone.addActionListener(this);
		
		add_file.addActionListener(this);
		create_repo.addActionListener(this);
		clone_repo.addActionListener(this);
		
		
		
		
		// On plus button click 
		
	

		main_container.add(plus);
		
		
		
		
		
		 
		main_container.setVisible(true);
	}
		
		

	

	public void actionPerformed(ActionEvent e) {
		
		// Event Listener for plus
		
		if(e.getSource()==plus) {	
			
			plus_counter++;	
		
			plus_frame.setSize(500,300);
		
			// Hide/Unhide
			if(plus_counter%2==0)
				plus_frame.setVisible(true);
			else
				plus_frame.setVisible(false);
		
		
		main_container.add(plus_frame);
			
		main_container.setVisible(true);
		}
		
		
		if(e.getSource()==add) {
			
			add_file.setVisible(true);	
			
		}
		
		if(e.getSource()==create) {
			
			create_repo.setVisible(true);	
			
		}
		
		
		
		
		
		}
	
	
	public static void main (String args[]) {
		
		new MainFrame();
		
	}	
		
	

}