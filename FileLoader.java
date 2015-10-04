import javax.swing.*;
import java.awt.*;

/**
 * Created by iamutkarsh on 4/10/15.
 */
public class FileLoader extends MainFrame {


    public static JLabel settings, branch, sync, sync_label, merge;

    public static void image_load()   {

        // Settings Icon
        ImageIcon trngle = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/settings.png");

        Image img1 = trngle.getImage() ;
        Image newimg1 = img1.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH ) ;
        trngle = new ImageIcon( newimg1 );

        settings = new JLabel(trngle);
        settings.setBounds(970, 25, 20, 20);
        settings.setVisible(true);

        // Branch Icon

        trngle = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/branch.png");

        img1 = trngle.getImage() ;
        newimg1 = img1.getScaledInstance(20, 30, java.awt.Image.SCALE_SMOOTH ) ;
        trngle = new ImageIcon( newimg1 );

        branch = new JLabel(trngle);
        branch.setBounds(10, 20, 20, 30);
        branch.setVisible(true);

        // Sunc Icon

        trngle = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/sync.png");
        img1 = trngle.getImage() ;
        newimg1 = img1.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH ) ;
        trngle = new ImageIcon( newimg1 );

        sync = new JLabel(trngle);
        sync.setBounds(880, 25, 20, 20);
        sync.setVisible(true);

        sync_label = new JLabel("Sync");
        sync_label.setBounds(905, 25, 40, 20);
        sync_label.setVisible(true);


        // Merge Icon

        trngle = new ImageIcon("/home/iamutkarsh/workspace/Minor/src/icons/merge.png");
        img1 = trngle.getImage() ;
        newimg1 = img1.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH ) ;
        trngle = new ImageIcon( newimg1 );

        merge = new JLabel(trngle);
        merge.setBounds(830, 25, 20, 20);
        merge.setVisible(true);



        top_toolbar.add(settings);
        top_toolbar.add(branch);
        top_toolbar.add(sync);
        top_toolbar.add(sync_label);
        top_toolbar.add(merge);







    }




}
