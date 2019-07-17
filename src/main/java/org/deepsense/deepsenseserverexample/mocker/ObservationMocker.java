package org.deepsense.deepsenseserverexample.mocker;

import org.apache.commons.io.IOUtils;
import org.deepsense.server.model.DeepSenseObservation;
import org.deepsense.server.model.DeepSenseTransmission;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.*;

@Service
public class ObservationMocker {

    private byte[] imageBytes;

    public ObservationMocker() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        //imageBytes =IOUtils.toByteArray(classLoader.getResourceAsStream("static/logo-deepviss-96x96.png"));

    }


//    public DeepVISSProcessingRequest getMockedProcessingRequest(byte[] contentBytes, String contentType)
//    {
//        DeepVISSImage deepVISSImage=new DeepVISSImage();
//        List<DeepVISSBoundingRectangle> boundingBoxes=new ArrayList<>();
//        DeepVISSProcessingRequest deepVISSProcessingRequest=new DeepVISSProcessingRequest();
//        deepVISSProcessingRequest.setImage(deepVISSImage);
//        deepVISSProcessingRequest.setRegionsOfInterest(boundingBoxes);
//        DeepVISSBoundingRectangle deepVISSBoundingRectangle= new DeepVISSBoundingRectangle();
//        deepVISSBoundingRectangle.setHeight(100);
//        deepVISSBoundingRectangle.setWidth(250);
//        deepVISSBoundingRectangle.setLeft(130);
//        deepVISSBoundingRectangle.setTop(280);
//        deepVISSProcessingRequest.getRegionsOfInterest().add(deepVISSBoundingRectangle);
//        deepVISSProcessingRequest.getRegionsOfInterest().add(deepVISSBoundingRectangle);
//        deepVISSImage.setImageContentType(contentType);
//        deepVISSImage.setImageBase64(contentBytes);
//
//        return deepVISSProcessingRequest;
//    }

    public  List<DeepSenseObservation> getObservations()
    {
        List<DeepSenseObservation> observations=new ArrayList<>();

        DeepSenseObservation deepSenseObservation=new DeepSenseObservation();
        deepSenseObservation.setName("Statia 7");
        observations.add(deepSenseObservation);

        DeepSenseObservation deepSenseObservation2=new DeepSenseObservation();
        deepSenseObservation2.setName("Statia 8");
        observations.add(deepSenseObservation2);

        return observations;
    }

    public  List<DeepSenseTransmission> getTransmission()
    {
        List<DeepSenseTransmission> transmissions=new ArrayList<>();

        DeepSenseTransmission transmission=new DeepSenseTransmission();
        transmission.setObservations(new ArrayList<>());

        DeepSenseObservation deepSenseObservation=new DeepSenseObservation();
        deepSenseObservation.setName("Statia 7");
        transmission.getObservations().add(deepSenseObservation);

        DeepSenseObservation deepSenseObservation2=new DeepSenseObservation();
        deepSenseObservation2.setName("Statia 8");
        transmission.getObservations().add(deepSenseObservation2);

        transmissions.add(transmission);

        return transmissions;
    }

//    private static String computeEventId(DeepVISSEvent event, DeepVISSFrame frame) {
//        String fromtSalt = "K0Oorvb53ZofZHIrffV48Skpefk4ASSffEWOLbat";
//        String backSalt = "cx8nwHumrVfJliMpAf0wYAzztUz2iy55Y2nsS7sV";
//        String originalString = fromtSalt + event.getDetection().getBoundingRectangle().getTop() + "-" +
//                event.getDetection().getBoundingRectangle().getLeft() + "-" +
//                event.getDetection().getBoundingRectangle().getWidth() + "-" +
//                event.getDetection().getBoundingRectangle().getHeight() + "-" +
//                frame.getTimestamps().get(0).getValue() + "-" + frame.getSourceId() + backSalt;
//        String sha512hex = DigestUtils.sha512Hex(originalString);
//        return sha512hex;
//    }
}