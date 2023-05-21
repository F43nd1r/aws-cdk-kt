package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition

@Generated
public
    fun deviceDefinitionVersionProperty(initializer: CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder.() -> Unit
    = {}): CfnDeviceDefinition.DeviceDefinitionVersionProperty =
    CfnDeviceDefinition.DeviceDefinitionVersionProperty.builder().apply(initializer).build()
