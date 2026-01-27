
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RS3 extends JFrame implements ActionListener {

    JTextField display;
    double num1 = 0, num2 = 0;
    String operator = "";

    public RS3() {

        setTitle("Modern Calculator");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        display = new JTextField();
        display.setFont(new Font("Segoe UI", Font.BOLD, 32));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBorder(new EmptyBorder(15, 15, 15, 15));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 10, 10));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(new Color(30, 30, 30));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "Sq", "Pow", "Fact", "C",
                "Exit"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Segoe UI", Font.BOLD, 16));
            btn.setFocusPainted(false);
            btn.setBackground(new Color(60, 63, 65));
            btn.setForeground(Color.WHITE);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        getContentPane().setBackground(new Color(45, 45, 45));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.matches("[0-9.]")) {
                display.setText(display.getText() + cmd);
            } else if (cmd.matches("[+\\-*/]")) {
                num1 = Double.parseDouble(display.getText());
                operator = cmd;
                display.setText("");
            } else if (cmd.equals("=")) {
                num2 = Double.parseDouble(display.getText());
                double result = switch (operator) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1 * num2;
                    case "/" -> num2 == 0 ? 0 : num1 / num2;
                    default -> 0;
                };
                display.setText(String.valueOf(result));
            } else if (cmd.equals("Sq")) {
                num1 = Double.parseDouble(display.getText());
                display.setText(String.valueOf(num1 * num1));
            } else if (cmd.equals("Pow")) {
                num1 = Double.parseDouble(display.getText());
                operator = "pow";
                display.setText("");
            } else if (cmd.equals("Fact")) {
                int n = Integer.parseInt(display.getText());
                long fact = 1;
                for (int i = 1; i <= n; i++)
                    fact *= i;
                display.setText(String.valueOf(fact));
            } else if (cmd.equals("C")) {
                display.setText("");
                num1 = num2 = 0;
            } else if (cmd.equals("Exit")) {
                System.exit(0);
            }

            if (operator.equals("pow") && !cmd.equals("Pow")) {
                num2 = Double.parseDouble(display.getText());
                display.setText(String.valueOf(Math.pow(num1, num2)));
                operator = "";
            }

        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new RS3();
    }
}
