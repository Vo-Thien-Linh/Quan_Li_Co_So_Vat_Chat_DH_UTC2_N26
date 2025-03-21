package controller;

import view.HomePage;
import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutController {
	private HomePage homePage;

    public LogoutController(HomePage homePage) {
        this.homePage = homePage;
        this.homePage.addLogoutListener(new LogoutListener());
    }

    class LogoutListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            homePage.dispose(); 
            LoginView loginView = new LoginView();
            loginView.setVisible(true); 
        }
    }
}
