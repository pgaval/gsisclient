
package org.patros.gsisclient;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;
import junit.framework.Assert;
import org.junit.Test;

public class ShowInfoBeanTest {
 
    @Test
    public void getInfoShouldReturnValidData() {
        ShowInfoBean instance = new ShowInfoBean();
        instance.setAfm("094422282");
        instance.getData();
        RgWsBasStoixNRtUser result = instance.getInfo();
        Assert.assertNotNull(result.getDoy());
    }
    @Test
    public void getInfoShouldReturnNoData() {
        ShowInfoBean instance = new ShowInfoBean();
        instance.setAfm("000000000");
        instance.getData();
        RgWsBasStoixNRtUser result = instance.getInfo();
        Assert.assertNotNull(result.getDoy());
    }

}
