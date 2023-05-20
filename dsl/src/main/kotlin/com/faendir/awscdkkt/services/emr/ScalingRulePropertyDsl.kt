@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun scalingRuleProperty(initializer: CfnInstanceGroupConfig.ScalingRuleProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.ScalingRuleProperty =
    CfnInstanceGroupConfig.ScalingRuleProperty.builder().apply(initializer).build()
