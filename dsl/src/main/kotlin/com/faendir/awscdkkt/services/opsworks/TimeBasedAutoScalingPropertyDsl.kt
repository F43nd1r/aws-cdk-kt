package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance

@Generated
public
    fun timeBasedAutoScalingProperty(initializer: CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit
    = {}): CfnInstance.TimeBasedAutoScalingProperty =
    CfnInstance.TimeBasedAutoScalingProperty.builder().apply(initializer).build()
