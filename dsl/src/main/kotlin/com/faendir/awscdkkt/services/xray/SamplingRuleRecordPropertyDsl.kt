package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule

@Generated
public
    fun samplingRuleRecordProperty(initializer: CfnSamplingRule.SamplingRuleRecordProperty.Builder.() -> Unit
    = {}): CfnSamplingRule.SamplingRuleRecordProperty =
    CfnSamplingRule.SamplingRuleRecordProperty.builder().apply(initializer).build()
