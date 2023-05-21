package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule

@Generated
public
    fun samplingRuleUpdateProperty(initializer: CfnSamplingRule.SamplingRuleUpdateProperty.Builder.() -> Unit
    = {}): CfnSamplingRule.SamplingRuleUpdateProperty =
    CfnSamplingRule.SamplingRuleUpdateProperty.builder().apply(initializer).build()
