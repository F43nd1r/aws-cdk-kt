package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnLayer

@Generated
public
    fun loadBasedAutoScalingProperty(initializer: CfnLayer.LoadBasedAutoScalingProperty.Builder.() -> Unit
    = {}): CfnLayer.LoadBasedAutoScalingProperty =
    CfnLayer.LoadBasedAutoScalingProperty.builder().apply(initializer).build()
