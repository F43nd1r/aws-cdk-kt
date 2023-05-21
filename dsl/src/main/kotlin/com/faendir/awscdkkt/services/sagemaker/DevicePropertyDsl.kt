package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDevice

@Generated
public fun deviceProperty(initializer: CfnDevice.DeviceProperty.Builder.() -> Unit = {}):
    CfnDevice.DeviceProperty = CfnDevice.DeviceProperty.builder().apply(initializer).build()
