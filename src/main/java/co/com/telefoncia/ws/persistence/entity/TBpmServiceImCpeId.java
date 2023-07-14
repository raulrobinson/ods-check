package co.com.telefoncia.ws.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "T_BPM_SERVICEIM_CPEID", schema = "SOM")
public class TBpmServiceImCpeId {
    @Column(name = "ACCESSID")
    private String accessId;
    @Column(name = "CUSTOMERID")
    private String customerId;
}
