package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun scalingActionProperty(initializer: CfnInstanceGroupConfig.ScalingActionProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.ScalingActionProperty =
    CfnInstanceGroupConfig.ScalingActionProperty.builder().apply(initializer).build()
