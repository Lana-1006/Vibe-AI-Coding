package de.labvision.report;

import de.labvision.common.LabSample;

public class ReportService {

           public void createReport(LabSample sample) {

        System.out.println("===== Laborbericht =====");
        System.out.println("Probe: " + sample.getSampleName());
        System.out.println("Status: " + sample.getStatus());
        System.out.println("========================");
    }
}

