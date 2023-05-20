@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule

public
    fun samplingRuleProperty(initializer: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit):
    CfnSamplingRule.SamplingRuleProperty =
    CfnSamplingRule.SamplingRuleProperty.builder().apply(initializer).build()
