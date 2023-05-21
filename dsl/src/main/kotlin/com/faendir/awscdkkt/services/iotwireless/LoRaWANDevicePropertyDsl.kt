package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@Generated
public
    fun loRaWANDeviceProperty(initializer: CfnWirelessDevice.LoRaWANDeviceProperty.Builder.() -> Unit
    = {}): CfnWirelessDevice.LoRaWANDeviceProperty =
    CfnWirelessDevice.LoRaWANDeviceProperty.builder().apply(initializer).build()
