//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.swing.JOptionPane;
import org.junit.Assert;
import org.junit.Test;

public class IsComplexTest {

    @Test
    public void isPasswordComplex_true() {
        String password = JOptionPane.showInputDialog("Please enter your password now");
        Assert.assertTrue(IsComplex.isPasswordComplex(password));
    }

    @Test
    public void isPasswordComplex_false() {
        Assert.assertFalse(IsComplex.isPasswordComplex("12"));
    }
}
