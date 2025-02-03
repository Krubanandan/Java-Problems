import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
        "7", "8", "9", "/", 
        "4", "5", "6", "*", 
        "1", "2", "3", "-", 
        "0", "C", "=", "+"
    };
    private String num1 = "", num2 = "", operator = "";

    public Calculator() {
        // Frame setup
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text field
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        buttons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) { // Number button
            if (operator.isEmpty()) {
                num1 += input;
                textField.setText(num1);
            } else {
                num2 += input;
                textField.setText(num2);
            }
        } else if (input.matches("[/*\\-+]")) { // Operator button
            if (!num1.isEmpty()) {
                operator = input;
            }
        } else if (input.equals("=")) { // Equals button
            if (!num1.isEmpty() && !num2.isEmpty()) {
                double result = calculate(Double.parseDouble(num1), Double.parseDouble(num2), operator);
                textField.setText(String.valueOf(result));
                num1 = String.valueOf(result);
                num2 = "";
                operator = "";
            }
        } else if (input.equals("C")) { // Clear button
            num1 = num2 = operator = "";
            textField.setText("");
        }
    }

    private double calculate(double n1, double n2, String op) {
        return switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n2 != 0 ? n1 / n2 : 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
