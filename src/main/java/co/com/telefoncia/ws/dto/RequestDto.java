package co.com.telefoncia.ws.dto;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto implements Serializable {
    private String query;
}
