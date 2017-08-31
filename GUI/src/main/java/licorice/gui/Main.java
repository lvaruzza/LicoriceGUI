/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licorice.gui;

import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

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
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(gui);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
