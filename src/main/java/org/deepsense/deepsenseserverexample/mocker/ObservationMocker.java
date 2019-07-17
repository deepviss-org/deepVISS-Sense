package org.deepsense.deepsenseserverexample.mocker;

import org.apache.commons.io.IOUtils;
import org.deepsense.server.model.DeepSenseObservation;
import org.deepsense.server.model.DeepSenseRecord;
import org.deepsense.server.model.DeepSenseSampledValue;
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


    public  List<DeepSenseObservation> getObservations()
    {
        List<DeepSenseObservation> observations=new ArrayList<>();

        DeepSenseObservation deepSenseObservation=new DeepSenseObservation();

        observations.add(deepSenseObservation);
        deepSenseObservation.setValue(new DeepSenseSampledValue());
        deepSenseObservation.getValue().setAverage(25.12);
        deepSenseObservation.getValue().setMax(28.39);
        deepSenseObservation.getValue().setMin(23.73);
        deepSenseObservation.getValue().setMedian(25.87);


        DeepSenseObservation deepSenseObservation2=new DeepSenseObservation();
        deepSenseObservation2.getValue().setAverage(25.12);
        deepSenseObservation2.getValue().setMax(28.39);
        deepSenseObservation2.getValue().setMin(23.73);
        deepSenseObservation2.getValue().setMedian(25.87);

        observations.add(deepSenseObservation2);

        return observations;
    }


    public DeepSenseTransmission getOneTransmission()
    {
        DeepSenseTransmission deepSenseTransmission=new DeepSenseTransmission();
        deepSenseTransmission.setRecords(new ArrayList<>());

        DeepSenseRecord deepSenseRecord=new DeepSenseRecord();
        deepSenseTransmission.getRecords().add(deepSenseRecord);

        deepSenseRecord.setObservations(new ArrayList<>());

        DeepSenseObservation deepSenseObservation=new DeepSenseObservation();
        deepSenseObservation.setInstrumentName("Sensor 1");
        deepSenseObservation.setInstrumentHeatlh(DeepSenseObservation.InstrumentHeatlhEnum.MALFUNCTION);
        deepSenseObservation.setValue(new DeepSenseSampledValue());
        deepSenseObservation.getValue().setAverage(25.12);
        deepSenseObservation.getValue().setMax(28.39);
        deepSenseObservation.getValue().setMin(23.73);
        deepSenseObservation.getValue().setMedian(25.87);

        deepSenseRecord.getObservations().add(deepSenseObservation);
        return deepSenseTransmission;
    }

}