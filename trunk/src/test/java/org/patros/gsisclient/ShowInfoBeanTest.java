
package org.patros.gsisclient;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShowInfoBeanTest {
 
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        ShowInfoBean instance = new ShowInfoBean();
        instance.setAfm("094422282");
        RgWsBasStoixNRtUser expResult = new RgWsBasStoixNRtUser();
        expResult.setAfm("094422282");
        instance.getData();
        RgWsBasStoixNRtUser result = instance.getInfo();
        assertEquals(instance.getAfm(), result.getAfm().trim());
    }

}
