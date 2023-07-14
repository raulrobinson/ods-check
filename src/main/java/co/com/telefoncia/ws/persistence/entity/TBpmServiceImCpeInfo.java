package co.com.telefoncia.ws.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "T_BPM_SERVICEIM_CPE_INFO", schema = "SOM")
public class TBpmServiceImCpeInfo {
    @Column(name = "cpeid")
    private String cpeId;
    @Column(name = "model")
    private String model;
}
