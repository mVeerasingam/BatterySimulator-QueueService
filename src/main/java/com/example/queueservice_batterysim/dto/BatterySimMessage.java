package com.example.queueservice_batterysim.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatterySimMessage implements Serializable{
    private boolean startJob;
    private String jobType;
    private BatterySim batterySim;
}

//{
//  "startJob": true,
//  "jobType": "CellSimulation",
//  "batterySim": {
//    "time": 3,
//    "upperVoltage": 4.2,
//    "lowerVoltage": 2.5,
//    "nominalCell": 7,
//    "controlCurrent": 2
//  }
//}