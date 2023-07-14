package co.com.telefoncia.ws.controller;

import co.com.telefoncia.ws.service.OdsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "telefonica/v1/ods-check", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    private final OdsService service;

    @Autowired
    public Controller(OdsService service) {
        this.service = service;
    }

    //
    // @PostMapping(path = "/custom-query-param", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    // public Object getCustomQueryByRequestParam(@RequestParam(name = "query") String query) {
    //     return teradataService.getCustomQueryByRequestParam(query);
    // }
    //
    // @PostMapping(path = "/custom-query-body", consumes = MediaType.APPLICATION_JSON_VALUE)
    // public Object getCustomQueryByRequestBody(@RequestBody RequestDTO requestDTO) {
    //     return teradataService.getCustomQueryByRequestBody(requestDTO);
    // }
}
