

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;




// Main container

public class MainFrame implements ActionListener{
	
	
	JFrame main_container;	
	JButton plus, add, create, clone, clone_repo, create_repo, add_file;
	JInternalFrame plus_frame;
	
	int plus_counter=1;
	
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
		ImageIcon add_file_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/add.png");
		ImageIcon create_repo_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/create.png");
		ImageIcon clone_repo_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/clone.png");
		
		
		plus = new JButton(plus_icon);
		plus.setBounds(31, 31, 20, 20);
		plus.setVisible(true);
		
		add = new JButton("Add");
		add.setBounds(80, 15, plus_button_width, plus_button_height);
		add.setVisible(false);
		
		// add image
		Image img = add_file_image.getImage() ;  
		Image newimg = img.getScaledInstance(60,50,  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon icon = new ImageIcon( newimg );
		
		add_file = new JButton(icon);
		add_file.setBounds(200,230,60,50);
		add_file.setVisible(false);
		
		
		
		
	
		
		create = new JButton("Create");
		create.setBounds(200, 15, plus_button_width, plus_button_height);
		create.setVisible(false);
		
		
		// create image
		img = create_repo_image.getImage() ;  
		newimg = img.getScaledInstance(60,50,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		
		create_repo = new JButton(icon);
		create_repo.setBounds(200,230,60,50);
		create_repo.setVisible(false);
		
		
		
		
		
		
		clone = new JButton("Clone");
		clone.setBounds(320, 15, plus_button_width, plus_button_height);
		clone.setVisible(false);
		
		
		// add image
		img = clone_repo_image.getImage() ;  
		newimg = img.getScaledInstance(60,50,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		
		clone_repo = new JButton(icon);
		clone_repo.setBounds(200,230,60,50);
		//clone_repo.setBackground(Color.BLUE);
		clone_repo.setVisible(false);
		
		
		
		
		
		
		
		
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
		
		
		
		
		main_container.add(plus_frame);
		 
		main_container.setVisible(true);
	}
		
		

	

	public void actionPerformed(ActionEvent e) {
		
		// Event Listener for plus
		
		if(e.getSource()==plus) {	
			
			plus_counter++;	
		
			plus_frame.setSize(500,300);
			
			
			
		
			// Hide/Unhide
			if(plus_counter%2==0) {
			
				plus_frame.setVisible(true);
				add.setVisible(true);
				create.setVisible(true);
				clone.setVisible(true);
			}
			
			else {
				plus_frame.setVisible(false);
				add.setVisible(false);
				create.setVisible(false);
				clone.setVisible(false);
			}
				
		
		
		
			
		}
		
		
		if(e.getSource()==add) {
			
			add_file.setVisible(true);	
			create_repo.setVisible(false);
			clone_repo.setVisible(false);
			
		}
		
		if(e.getSource()==create) {
			
			add_file.setVisible(false);	
			create_repo.setVisible(true);
			clone_repo.setVisible(false);	
			
		}
		
		
		if(e.getSource()==clone) {
			
			add_file.setVisible(false);	
			create_repo.setVisible(false);
			clone_repo.setVisible(true);
		}
		
		
		
		
		}
	
	
	public static void main (String args[]) {
		
		new MainFrame();
		
	}	
		
	

}