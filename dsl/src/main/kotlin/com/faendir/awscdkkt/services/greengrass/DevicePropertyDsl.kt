package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion

@Generated
public fun deviceProperty(initializer: CfnDeviceDefinitionVersion.DeviceProperty.Builder.() -> Unit
    = {}): CfnDeviceDefinitionVersion.DeviceProperty =
    CfnDeviceDefinitionVersion.DeviceProperty.builder().apply(initializer).build()
