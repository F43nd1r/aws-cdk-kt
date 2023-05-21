package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun scalingTriggerProperty(initializer: CfnInstanceGroupConfig.ScalingTriggerProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.ScalingTriggerProperty =
    CfnInstanceGroupConfig.ScalingTriggerProperty.builder().apply(initializer).build()
