package co.com.telefoncia.ws.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "INF_SUBSCRIBER", schema = "DWHODS")
public class InfSubscriber {
    @Column(name = "subs_id")
    private String subsId;
    @Column(name = "prod_code")
    private String prodCode;
}
