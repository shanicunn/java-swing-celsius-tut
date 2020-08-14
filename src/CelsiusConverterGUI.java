import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// https://www.youtube.com/watch?v=-SmNpKskfJc
// In form the values = variables, text = display text
// In form to add eventListener you have to right click element in the property table

// Have to extend JFrame yourself
public class CelsiusConverterGUI extends JFrame {
    // Made with JPanel name
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel farenheitLabel;

    // Form title
    public CelsiusConverterGUI(String title) {
        super(title);

        // Form content
        this.setContentPane(mainPanel);
        this.pack();

        // Button Action Listener to update Fahrenheit Label
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // Convert to double
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText()))
                * 1.8 + 32);
                farenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My Celsius Converter");

        // Sets visibility
        frame.setVisible(true);
    }
}
