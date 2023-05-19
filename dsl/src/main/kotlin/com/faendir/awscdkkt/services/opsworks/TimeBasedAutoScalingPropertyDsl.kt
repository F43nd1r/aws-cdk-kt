@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance

public
    fun timeBasedAutoScalingProperty(initializer: CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit):
    CfnInstance.TimeBasedAutoScalingProperty =
    CfnInstance.TimeBasedAutoScalingProperty.builder().apply(initializer).build()
