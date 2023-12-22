package com.example.queueservice_batterysim.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatterySim implements Serializable {
    private double time;
    private double upperVoltage;
    private double lowerVoltage;
    private double nominalCell;
    private double controlCurrent;
}
