package org.deepsense.deepsenseserverexample.controllers;


import org.deepsense.deepsenseserverexample.mocker.ObservationMocker;
import org.deepsense.server.model.DeepSenseObservation;
import org.deepsense.server.model.DeepSenseTransmission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/rest/examples/")
@ApiIgnore
public class MockController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ObservationMocker observationMocker;

    @PostConstruct
    private void initialize() throws IOException {

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/observation", method = RequestMethod.GET, produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    List<DeepSenseObservation> getObservation(
    ) throws IOException, InterruptedException {
        List<DeepSenseObservation> observations=observationMocker.getObservations();

        return observations;

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/transmission", method = RequestMethod.GET, produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    List<DeepSenseTransmission> getTransmission(
    ) throws IOException, InterruptedException {
        List<DeepSenseTransmission> transmissions=observationMocker.getTransmission();

        return transmissions;

    }



}