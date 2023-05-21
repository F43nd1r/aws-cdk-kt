package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun scalingRuleProperty(initializer: CfnInstanceGroupConfig.ScalingRuleProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.ScalingRuleProperty =
    CfnInstanceGroupConfig.ScalingRuleProperty.builder().apply(initializer).build()
