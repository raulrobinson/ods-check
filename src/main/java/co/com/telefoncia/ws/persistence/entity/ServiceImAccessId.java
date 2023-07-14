package co.com.telefoncia.ws.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "SERVICEIM_ACCESSID", schema = "SOM")
public class ServiceImAccessId {
    @Column(name = "accessid")
    private String accessId;
    @Column(name = "status")
    private String status;
    @Column(name = "cfscode")
    private String cfsCode;
}
