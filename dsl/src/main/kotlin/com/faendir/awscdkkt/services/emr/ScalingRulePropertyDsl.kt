@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun scalingRuleProperty(initializer: CfnInstanceGroupConfig.ScalingRuleProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.ScalingRuleProperty =
    CfnInstanceGroupConfig.ScalingRuleProperty.builder().apply(initializer).build()
