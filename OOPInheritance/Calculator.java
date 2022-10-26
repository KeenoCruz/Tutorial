
/**
 * Write a description of class MidTermExam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame
{
    JLabel op1 = new JLabel();
    JLabel op = new JLabel();
    JLabel op2 = new JLabel();
    
    JTextField op1text = new JTextField();
    JTextField optext = new JTextField();
    JTextField op2text = new JTextField();
        
    JButton calculate = new JButton();
    JButton exit = new JButton();
    
    public Calculator()
    {
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        
        setTitle("Calculator");
        
        op1.setText("Operand 1:");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(op1, gridConstraints);
        
        op.setText("Operator");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        getContentPane().add(op, gridConstraints);
        
        op2.setText("Operand 2:");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        getContentPane().add(op2, gridConstraints);
        
        op1text.setText("          ");
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        getContentPane().add(op1text, gridConstraints);
        
        optext.setText("   ");
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        getContentPane().add(optext, gridConstraints);
        
        op2text.setText("          ");
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        getContentPane().add(op2text, gridConstraints);
        
        calculate.setText("Calculate");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        getContentPane().add(calculate, gridConstraints);
        
        exit.setText("Exit");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 4;
        getContentPane().add(exit, gridConstraints);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                exitingForm(e);
            }
        });
        calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculateActionPerformed(e);
            }
        });
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                exitActionPerformed(e);
            }
        });
        
        pack();
    }
    private void exitingForm(WindowEvent e)
    {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Exit, Thank you!");
    }
    private void calculateActionPerformed(ActionEvent e)
    {
        JFrame f = new JFrame();
        
        int operand1 = Integer.parseInt(op1.getText());
        String operator = (op.getText());
        int operand2 = Integer.parseInt(op2.getText());
        
        int resultadd, resultsub, resultmulti, resultdiv;
        
        if (operator == "+")
        {
        resultadd = operand1 + operand2;
        JOptionPane.showMessageDialog(f, "Result: " + resultadd);
    }
        else if(operator == "-")
        {
        resultsub = operand1 - operand2;
        JOptionPane.showMessageDialog(f, "Result: " + resultsub);
    }
        else if(operator == "*")
        {
        resultmulti = operand1 * operand2;
        JOptionPane.showMessageDialog(f, "Result: " + resultmulti);
    }
        else if(operator == "/")
        {
        resultdiv = operand1 / operand2;
        JOptionPane.showMessageDialog(f, "Result: " + resultdiv);
    }
    }
    private void exitActionPerformed(ActionEvent e)
    {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Exit, Thank you!");
        System.exit(0);
    }
    public static void main(String [] args)
    {
        new Calculator().show();
    }
}



