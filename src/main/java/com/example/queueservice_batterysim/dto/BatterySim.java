package com.example.queueservice_batterysim.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatterySim {
    private String id;
    private double time;
    private double upperVoltage;
    private double lowerVoltage;
    private double nominalCell;
    private double controlCurrent;
}
