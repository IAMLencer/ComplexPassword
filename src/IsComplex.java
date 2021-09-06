//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;

public class IsComplex {
    public IsComplex() {
    }

    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Please enter your password now");
        boolean res = isPasswordComplex(password);
        if (res) {
            JOptionPane.showMessageDialog((Component)null, "Nice your password is strong!");
        } else {
            JOptionPane.showMessageDialog((Component)null, "Oops!, Not strong enough");
        }

    }

    public static boolean isPasswordComplex(String password) {
        return  password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }
}
