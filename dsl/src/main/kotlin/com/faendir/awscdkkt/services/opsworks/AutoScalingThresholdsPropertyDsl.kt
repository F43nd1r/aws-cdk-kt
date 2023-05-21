package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnLayer

@Generated
public
    fun autoScalingThresholdsProperty(initializer: CfnLayer.AutoScalingThresholdsProperty.Builder.() -> Unit
    = {}): CfnLayer.AutoScalingThresholdsProperty =
    CfnLayer.AutoScalingThresholdsProperty.builder().apply(initializer).build()
