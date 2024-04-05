package ungdung_java;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MyWindows windows = new MyWindows("Ứng dụng bá cháy", 400, 400, 400, 400);
        } catch (Exception e) {
            System.out.println("Loi roi be yeu oi, mau sua di thoi");
        } finally {
            System.out.println("Exit!!");
        }

    }
}