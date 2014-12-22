/**
 * primjer iz knjige
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *  Create and show a window that displays the message "Hello World",
 *  with an "OK" button.  The program ends when the user clicks the button.
 *  The GUI is constructed in the main() routine, which is not the best
 *  way to do things.  This program is a first example of using GUI components.
 */

public class HelloWorldGUI2 {

    private static class HelloWorldDisplay extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString( "Raspremi Sobu!", 78, 30 );
        }
    }

    private static class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        HelloWorldDisplay displayPanel = new HelloWorldDisplay();
        JButton okButton = new JButton("U Redu je");
        ButtonHandler listener = new ButtonHandler();
        okButton.addActionListener(listener);//linija koja kaze(listener) da izadje iz programa nakon klikom misa na dugme

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(displayPanel, BorderLayout.CENTER);
        content.add(okButton, BorderLayout.SOUTH);

        JFrame window = new JFrame("GUI Test");
        window.setContentPane(content);
        window.setSize(250,100);
        window.setLocation(830,500);
        window.setVisible(true);
        
    }

}