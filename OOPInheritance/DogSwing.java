
/**
 * Write a description of class DogSwing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DogSwing
{
    static JFrame frame = new JFrame();
    
    static JLabel breed = new JLabel();
    static JLabel tagNo = new JLabel();
    static JLabel color = new JLabel();
    
    static JTextField breedText = new JTextField();
    static JTextField tagNoText = new JTextField();
    static JTextField colorText = new JTextField();
    
    static JButton enter = new JButton();
    static JButton exit = new JButton();
    
    static GridBagConstraints gridConstraints = new GridBagConstraints();
    
    
    public static void DogClass()
    {
        frame.getContentPane().setLayout(new GridBagLayout());
        
        frame.setVisible(true);
        
        frame.setTitle("Dog Form");
        
        breed.setText("Breed:");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        frame.getContentPane().add(breed, gridConstraints);
        
        tagNo.setText("Tag Number:");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        frame.getContentPane().add(tagNo, gridConstraints);
        
        color.setText("Color:");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        frame.getContentPane().add(color, gridConstraints);
        
        breedText.setText("                    ");
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        frame.getContentPane().add(breedText, gridConstraints);
        
        tagNoText.setText("                    ");
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 1;
        frame.getContentPane().add(tagNoText, gridConstraints);
        
        colorText.setText("                    ");
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 2;
        frame.getContentPane().add(colorText, gridConstraints);
        
        enter.setText("Enter");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        frame.getContentPane().add(enter, gridConstraints);
        
        exit.setText("Exit");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        frame.getContentPane().add(enter, gridConstraints);
        
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                exitingForm(e);
            }
        });
        enter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                enterActionPerformed(e);
            }
        });
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                exitActionPerformed(e);
            }
        });
        
        frame.pack();
    }
    private static void exitingForm(WindowEvent e)
    {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Exit, Thank you!");
    }
    private static void enterActionPerformed(ActionEvent e)
    {
        JFrame f = new JFrame();
        
        String getBreed = breedText.getText();
        String getTagNo = tagNoText.getText();
        String getColor = colorText.getText();
        
        JOptionPane.showMessageDialog(null, "Breed: " + getBreed + "Tag Number: " + getTagNo + "Color: " + getColor, "DOG RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void exitActionPerformed(ActionEvent e)
    {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Exit, Thank you!");
        System.exit(0);
    }
    public static void main(String [] args)
    {
        DogSwing myDog = new DogSwing();
    }
}
