package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame implements ActionListener {
    private JLabel usernameLabel, firstnameLabel, lastnameLabel, jobsLabel;
    private JTextField usernameField, firstnameField, lastnameField, jobsField;
    private JButton connectButton;

    public UserInterface() {
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 30, 100, 20);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(130, 30, 200, 20);
        add(usernameField);

        firstnameLabel = new JLabel("Firstname:");
        firstnameLabel.setBounds(20, 60, 100, 20);
        add(firstnameLabel);

        firstnameField = new JTextField();
        firstnameField.setBounds(130, 60, 200, 20);
        add(firstnameField);

        lastnameLabel = new JLabel("Lastname:");
        lastnameLabel.setBounds(20, 90, 100, 20);
        add(lastnameLabel);

        lastnameField = new JTextField();
        lastnameField.setBounds(130, 90, 200, 20);
        add(lastnameField);

        jobsLabel = new JLabel("Jobs:");
        jobsLabel.setBounds(20, 120, 100, 20);
        add(jobsLabel);

        jobsField = new JTextField();
        jobsField.setBounds(130, 120, 200, 20);
        add(jobsField);

        connectButton = new JButton("Connect");
        connectButton.setBounds(150, 160, 100, 30);
        connectButton.addActionListener(this);
        add(connectButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == connectButton) {
            String username = usernameField.getText();
            String firstname = firstnameField.getText();
            String lastname = lastnameField.getText();
            String jobs = jobsField.getText();

            System.out.println("Username: " + username);
            System.out.println("Firstname: " + firstname);
            System.out.println("Lastname: " + lastname);
            System.out.println("Jobs: " + jobs);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserInterface ui = new UserInterface();
            ui.setVisible(true);
        });
    }
}
