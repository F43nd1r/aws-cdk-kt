@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule

public
    fun samplingRuleProperty(initializer: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit):
    CfnSamplingRule.SamplingRuleProperty =
    CfnSamplingRule.SamplingRuleProperty.builder().apply(initializer).build()
