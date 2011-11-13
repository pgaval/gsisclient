
package org.patros.gsisclient;

import org.junit.*;

public class UtilsTest {
   
    @Test
    public void checkAFMShouldReturnFalseIfAFMisLessThanNineNumbers() {
        String afm = "1234";
        Utils instance = new Utils();
        Assert.assertFalse(instance.checkAFM(afm));
    }
    @Test
    public void checkAFMShouldReturnFalseIfAFMisMoreThanNineNumbers() {
        String afm = "1234567890";
        Utils instance = new Utils();
        Assert.assertFalse(instance.checkAFM(afm));
    }
    @Test
    public void checkAFMShouldReturnFalseForInvalidData() {
        String afm = "12345678";
        Utils instance = new Utils();
        Assert.assertFalse(instance.checkAFM(afm));
    }
    @Test
    public void checkAFMShouldReturnFalseForValidData() {
        String afm = "094422282";
        Utils instance = new Utils();
        Assert.assertTrue(instance.checkAFM(afm));
    }
}
