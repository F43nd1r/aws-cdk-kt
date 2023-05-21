package com.faendir.awscdkkt.services.iotcoredeviceadvisor

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition

@Generated
public
    fun deviceUnderTestProperty(initializer: CfnSuiteDefinition.DeviceUnderTestProperty.Builder.() -> Unit
    = {}): CfnSuiteDefinition.DeviceUnderTestProperty =
    CfnSuiteDefinition.DeviceUnderTestProperty.builder().apply(initializer).build()
