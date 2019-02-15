/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licorice.gui;

import java.awt.*;
import java.util.Properties;
import javax.swing.*;

/**
 *
 * @author varuzza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainPanel gui = new MainPanel();
                UIAppender.setMainPanel(gui);

                JFrame frame = new JFrame("Licorice 2.0");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Image icon = new ImageIcon(getClass().getClassLoader().getResource("icon.png")).getImage();

                frame.setIconImage(icon);

                frame.getContentPane().add(gui);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
