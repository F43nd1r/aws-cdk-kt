package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule

@Generated
public fun samplingRuleProperty(initializer: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit
    = {}): CfnSamplingRule.SamplingRuleProperty =
    CfnSamplingRule.SamplingRuleProperty.builder().apply(initializer).build()
