package com.example.queueservice_batterysim.dto;

import lombok.Data;

@Data
public class BatterySimMessage {
    private boolean startJob;
    private String jobType;
    private BatterySim batterySim;
}
