

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import java.awt.*;




// Main container

public class MainFrame implements ActionListener{
	
	
	JFrame main_container;	
	JButton plus, add, create, clone, clone_repo, create_repo, add_file, browse;
	JInternalFrame plus_frame, repository_list_frame, file_list_frame;
	JTextField add_location, create_location, filter_repository;
	JLabel path, name, triangle;
	Graphics g;
	
	int plus_counter=1;
	
	int plus_button_width=85;
	int plus_button_height=30;

	
	
	
	
	MainFrame() {
	
		
	
		plus_frame = new JInternalFrame();
		
		plus_frame.setBounds(40,60,100,100);
		plus_frame.setLayout(null);
        plus_frame.setBackground(Color.white);



        repository_list_frame = new JInternalFrame();
        repository_list_frame.setBounds(0, 75, 300, 675);
        repository_list_frame.setLayout(null);
        repository_list_frame.setVisible(true);
        repository_list_frame.setBackground(Color.white);

        file_list_frame = new JInternalFrame();
        file_list_frame.setBounds(301,75,300,675);
        file_list_frame.setLayout(null);
        file_list_frame.setVisible(true);
        file_list_frame.setBackground(Color.white);



		
		
		// North pane of plus null
		BasicInternalFrameUI bi = (BasicInternalFrameUI)plus_frame.getUI();
        bi.setNorthPane(null);

        bi = (BasicInternalFrameUI)repository_list_frame.getUI();
        bi.setNorthPane(null);

        bi = (BasicInternalFrameUI)file_list_frame.getUI();
        bi.setNorthPane(null);



        // Image Display

        ImageIcon trngle = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/triangle.png");

        Image img1 = trngle.getImage() ;
        Image newimg1 = img1.getScaledInstance(15,15,  java.awt.Image.SCALE_SMOOTH ) ;
        ImageIcon image = new ImageIcon( newimg1 );

        JLabel triangle = new JLabel(image);
        triangle.setBounds(53, 35, 15, 15);
        triangle.setVisible(true);









        main_container = new JFrame();
		main_container.setSize(1366,768);
		main_container.setLayout(null);
        main_container.getContentPane().setBackground(Color.WHITE);
		main_container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		ImageIcon plus_icon = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/plus.png");
		ImageIcon add_file_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/add.png");
		ImageIcon create_repo_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/create.png");
		ImageIcon clone_repo_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/clone.png");
        ImageIcon browse_button_image = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/browse.png");


		
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
		add_file.setBounds(220,230,60,50);
		add_file.setVisible(false);
		
		
		// add text location
		
		
		add_location= new JTextField();
		
		add_location.setBounds(100,150,300,30);
		add_location.setVisible(true);


        create_location = new JTextField();

        create_location.setBounds(100,100,300,30);
        create_location.setVisible(false);
		
	
		

		
		
		
	
		
		create = new JButton("Create");
		create.setBounds(200, 15, plus_button_width, plus_button_height);
		create.setVisible(false);
		
		
		// create image
		img = create_repo_image.getImage() ;  
		newimg = img.getScaledInstance(60,50,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		
		create_repo = new JButton(icon);
		create_repo.setBounds(220,230,60,50);
		create_repo.setVisible(false);
		
		
		
		
		
		
		clone = new JButton("Clone");
		clone.setBounds(320, 15, plus_button_width, plus_button_height);
		clone.setVisible(false);
		
		
		// clone image
		
		img = clone_repo_image.getImage() ;  
		newimg = img.getScaledInstance(60,50,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		
		clone_repo = new JButton(icon);
		clone_repo.setBounds(220,230,60,50);
		//clone_repo.setBackground(Color.BLUE);
		clone_repo.setVisible(false);
		


        // browse button

        img = browse_button_image.getImage() ;
        newimg = img.getScaledInstance(40,30,  java.awt.Image.SCALE_SMOOTH ) ;
        icon = new ImageIcon( newimg );

        browse = new JButton(icon);
        browse.setBounds(405,150,40,30);
        browse.setVisible(false);





		
		// Labels
		
		path = new JLabel("Path");
		
		path.setBounds(50,150,40,30);
		
		path.setVisible(false);
		
		
		name = new JLabel("Name");
		name.setBounds(50,100,40,30);
		name.setVisible(false);
		
	
		// Text Fields

        filter_repository = new JTextField("Filter Repository");

        filter_repository.setBounds(5, 80, 290, 30);
        filter_repository.setVisible(true);
        // filter label vanish
        filter_repository.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                filter_repository.setText("");
            }
        });



		
		
		
		
		// Adding buttons to plus frame
		
		plus_frame.add(add);
		plus_frame.add(create);
		plus_frame.add(clone);
		
		plus_frame.add(add_file);
		plus_frame.add(clone_repo);
		plus_frame.add(create_repo);
		
		plus_frame.add(add_location);
        plus_frame.add(create_location);

        plus_frame.add(browse);
		
		
		
		// Label add
		
		plus_frame.add(path);
		plus_frame.add(name);

		

		plus.addActionListener(this);
		add.addActionListener(this);
		create.addActionListener(this);
		clone.addActionListener(this);
		
		add_file.addActionListener(this);
		create_repo.addActionListener(this);
		//clone_repo.addActionListener(this);
		
		
		
		
		// On plus button click 
		
	

		main_container.add(plus);

		main_container.add(plus_frame);
        main_container.add(filter_repository);
        main_container.add(repository_list_frame);
        main_container.add(file_list_frame);
        main_container.add(triangle);



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
				
		path.setVisible(true);
        browse.setVisible(true);

		
		
		
			
		}
		
		// Add Pressed
		
		if(e.getSource()==add) {
			
			add_file.setVisible(true);	
			create_repo.setVisible(false);
			//clone_repo.setVisible(false);
			plus_frame.setSize(500,300);
			
			path.setVisible(true);

			name.setVisible(false);
			add_location.setVisible(true);
            create_location.setVisible(false);
            browse.setVisible(true);

			
		}
		
		// Create Pressed
		
		if(e.getSource()==create) {
			
			add_file.setVisible(false);	
			create_repo.setVisible(true);
			//clone_repo.setVisible(false);	
			plus_frame.setSize(500,300);
			name.setVisible(true);
            path.setVisible(true);
            add_location.setVisible(true);
            create_location.setVisible(true);
            browse.setVisible(true);
			
			
		}
		
		// Clone Pressed
		if(e.getSource()==clone) {
			
			add_file.setVisible(false);	
			create_repo.setVisible(false);
			//clone_repo.setVisible(true);
			plus_frame.setSize(500,600);
			path.setVisible(false);
			name.setVisible(false);
			add_location.setVisible(false);
            create_location.setVisible(false);
            browse.setVisible(false);
			
			
		}
		
		
		
		
		}
	
	
	public static void main (String args[]) {
		
		new MainFrame();
		
	}	
		
	

}