package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun deviceConfigurationProperty(initializer: CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit
    = {}): CfnUserPool.DeviceConfigurationProperty =
    CfnUserPool.DeviceConfigurationProperty.builder().apply(initializer).build()
