package ungdung_java;

import javax.swing.*;

public class MyWindows extends JFrame {
    public MyWindows() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MyWindows(String title, int x, int y,int width, int height) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addSomething();
        this.showMyApplication(title, x, y, width, height);
    }

    public void showMyApplication(String title, int x, int y, int width, int height) {
        this.setVisible(true);
        this.setTitle("My Application");
        this.setBounds(x, y, width, height);
        this.setLocationRelativeTo(null);
    }

    public void addSomething() {
        JButton jbtn = new JButton("Button");

        this.add(jbtn);
    }
}
