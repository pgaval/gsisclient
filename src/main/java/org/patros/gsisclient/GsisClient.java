
package org.patros.gsisclient;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn.RgWsBasStoixN;
import gr.gsis.rgwsbasstoixn.rgwsbasstoixn.RgWsBasStoixN_Service;
import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.GenWsErrorRtUser;
import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;
import java.math.BigDecimal;
import javax.xml.ws.Holder;

public class GsisClient {

    public RgWsBasStoixNRtUser getData(String afm) {
        RgWsBasStoixN_Service service = new RgWsBasStoixN_Service();
        RgWsBasStoixN servicePort = service.getRgWsBasStoixNSoapHttpPort();
        RgWsBasStoixNRtUser basStoixNRtUser = new RgWsBasStoixNRtUser(); 
        Holder<RgWsBasStoixNRtUser> basStoixNRtUserHolder = new Holder<RgWsBasStoixNRtUser>();
        basStoixNRtUserHolder.value = basStoixNRtUser;

        GenWsErrorRtUser errorRtUser = new GenWsErrorRtUser();
        Holder<GenWsErrorRtUser> errorRtUserHolder = new Holder<GenWsErrorRtUser>();
        errorRtUserHolder.value = errorRtUser;
        
        BigDecimal seqOutId = new BigDecimal(0);
        Holder<BigDecimal> seqOutIdHolder = new Holder<BigDecimal>();
        seqOutIdHolder.value = seqOutId;
        
        servicePort.rgWsBasStoixN(afm, basStoixNRtUserHolder, seqOutIdHolder, errorRtUserHolder);
        return basStoixNRtUserHolder.value;
    }
}
