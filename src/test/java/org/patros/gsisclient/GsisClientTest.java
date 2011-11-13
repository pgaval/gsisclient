
package org.patros.gsisclient;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;
import junit.framework.Assert;
import org.junit.Test;


public class GsisClientTest {
  
    @Test
    public void getDataShouldReturnValidData() {
        String afm = "094422282";
        GsisClient instance = new GsisClient();
        RgWsBasStoixNRtUser basStoixNRtUser = instance.getData(afm);
        Assert.assertNotNull(basStoixNRtUser.getDoy()); 
    }
    @Test
    public void getDataShouldReturnNoData() {
        String afm = "000000000";
        GsisClient instance = new GsisClient();
        RgWsBasStoixNRtUser basStoixNRtUser = instance.getData(afm);
        Assert.assertNull(basStoixNRtUser.getDoy()); 
    }
}
