package de.labvision.analysis;

import de.labvision.common.LabSample;

public class AnalysisService {

    public LabSample analyzeSample(LabSample sample) {

        System.out.println("Analyse gestartet für: " + sample.getSampleName());

        return new LabSample(sample.getSampleName(), "analysiert");
    }
}
