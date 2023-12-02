package com.example.queueservice_batterysim.dto;

import lombok.Data;

@Data
public class BatterySim {
    private double time;
    private double upperVoltage;
    private double lowerVoltage;
    private double nominalCell;
    private double controlCurrent;
}
