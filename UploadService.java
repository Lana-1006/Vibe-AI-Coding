package de.labvision.upload;

import de.labvision.common.LabSample;

 
public class UploadService {
    
     public LabSample uploadSample(String sampleName) {
        System.out.println("Probe wurde hochgeladen: " + sampleName);
        return new LabSample(sampleName, "hochgeladen");
    }
}
