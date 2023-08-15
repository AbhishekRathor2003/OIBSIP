import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class User {
    private String userID;

    public User(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }
}

public class ATMInterface {

    private User currentUser;

    private JFrame frame;
    private JLabel welcomeLabel;
    private JButton historyButton, withdrawButton, depositButton, transferButton, quitButton;

    public ATMInterface(User currentUser) {
        this.currentUser = currentUser;

        frame = new JFrame("ATM Interface");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        welcomeLabel = new JLabel("Welcome, " + currentUser.getUserID() + "!");
        historyButton = new JButton("Transaction History");
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        transferButton = new JButton("Transfer");
        quitButton = new JButton("Quit");

        historyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showHistoryDialog();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showWithdrawDialog();
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showDepositDialog();
            }
        });

        transferButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showTransferDialog();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(welcomeLabel);
        frame.add(historyButton);
        frame.add(withdrawButton);
        frame.add(depositButton);
        frame.add(transferButton);
        frame.add(quitButton);

        frame.setVisible(true);
    }

    private void showHistoryDialog() {
        // Implement showing transaction history dialog
        JDialog historyDialog = new JDialog(frame, "Transaction History", true);
        historyDialog.setSize(300, 200);
        historyDialog.setLayout(new FlowLayout());

        JLabel historyLabel = new JLabel("Transaction history will be displayed here.");
        historyDialog.add(historyLabel);

        historyDialog.setVisible(true);
    }

    private void showWithdrawDialog() {
        // Implement withdrawal dialog
        // Create a similar JDialog for withdrawal
    }

    private void showDepositDialog() {
        // Implement deposit dialog
        // Create a similar JDialog for deposit
    }

    private void showTransferDialog() {
        // Implement transfer dialog
        // Create a similar JDialog for transfer
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                User currentUser = new User("12345");
                ATMInterface atmInterface = new ATMInterface(currentUser);
            }
        });
    }
}