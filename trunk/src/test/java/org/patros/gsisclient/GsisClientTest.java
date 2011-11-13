
package org.patros.gsisclient;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class GsisClientTest {
  
    @Test
    public void testGetData() {
        System.out.println("getData");
        String afm = "0944222821";
        GsisClient instance = new GsisClient();
        RgWsBasStoixNRtUser basStoixNRtUser = instance.getData(afm);
        assertEquals(afm, basStoixNRtUser.getAfm().trim()); 
    }
}
