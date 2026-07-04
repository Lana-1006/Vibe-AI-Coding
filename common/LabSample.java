package de.labvision.common;

public class LabSample {
    
    private String sampleName;
    private String status;

    public LabSample(String sampleName, String status) {
        this.sampleName = sampleName;
        this.status = status;
    }

    public String getSampleName() {
        return sampleName;
    }

    public String getStatus() {
        return status;
    }
}
