
package org.patros.gsisclient;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ShowInfoBean {

    private String afm;
    private RgWsBasStoixNRtUser info;

    public RgWsBasStoixNRtUser getInfo() {
        return info;
    }

    public void setInfo(RgWsBasStoixNRtUser data) {
        this.info = data;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String data) {
        this.afm = data;
    }
    
    public void getData(){
        GsisClient gsisClient = new GsisClient();
        this.setInfo(gsisClient.getData(afm));
        if ( this.getInfo().getRegistDate()==null){
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_WARN, 
                    "Δε βρέθηκαν στοιχεία για το ΑΦΜ:" +afm, 
                    "Δε βρέθηκαν στοιχεία για το ΑΦΜ:" +afm));
            
        }else {
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_INFO, 
                    "Η ανάκτηση των στοιχείων ολοκληρώθηκε με επιτυχία", 
                    "Η ανάκτηση των στοιχείων ολοκληρώθηκε με επιτυχία"));
        }
        
    }
    
}
