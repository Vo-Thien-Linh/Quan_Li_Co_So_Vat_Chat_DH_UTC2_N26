package controller;

import service.UserService;
import view.HomePage;
import view.LoginView;

import javax.swing.JOptionPane;

public class LoginController {
    private UserService userService;
    private LoginView loginView;
    public LoginController(UserService userService, LoginView loginView) {
        this.userService = userService;
        this.loginView = loginView;
    }

    public void login(String username, String password) {
        boolean success = userService.login(username, password);
        if (success) {
        	loginView.setVisible(false);
        	
        	HomePage homePage = new HomePage();
        	new LogoutController(homePage);
        	homePage.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(loginView, "Sai tài khoản hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
}
