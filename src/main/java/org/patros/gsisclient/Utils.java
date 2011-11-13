
package org.patros.gsisclient;

public class Utils {

    public boolean checkAFM(final String afm) {
        
        if (afm.length() != 9){
            return false;
        }
        
        try {
            Long.parseLong(afm);
        }catch (NumberFormatException ex){
            return false;
        }
        
        
        int i;
        int sum = 0;
        int b;

        int a[];
        a = new int[9];

        int telestes[];
        telestes = new int[9];
        String str3 = afm.substring(8, 9);
        b = Integer.parseInt(str3);

        for (i = 2; i < 9; i++) {
            telestes[1] = 256;
            telestes[i] = telestes[i - 1] / 2;
        }

        for (i = 1; i <= 8; i++) {
            String str2 = afm.substring(i - 1, i);
            a[i] = Integer.parseInt(str2);
            sum = sum + a[i] * telestes[i];
        }

        return (b == (sum % 11) % 10);
    }
}
