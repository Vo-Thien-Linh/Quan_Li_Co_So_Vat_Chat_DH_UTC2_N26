package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
	private JButton btnLogout;
	
    public HomePage() {
        setTitle("Trang Chủ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        
        JLabel label = new JLabel("Chào mừng bạn đến với Trang Chủ!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        
        btnLogout = new JButton("Đăng xuất");
        JPanel buttonPanel = new JPanel(); // Panel để chứa nút
        buttonPanel.add(btnLogout);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        
        add(panel);
    }
    
    public void addLogoutListener(ActionListener listener) {
        btnLogout.addActionListener(listener);
    }
}
