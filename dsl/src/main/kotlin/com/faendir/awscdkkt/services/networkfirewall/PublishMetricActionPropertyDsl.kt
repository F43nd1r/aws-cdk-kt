package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun publishMetricActionProperty(initializer: CfnRuleGroup.PublishMetricActionProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.PublishMetricActionProperty =
    CfnRuleGroup.PublishMetricActionProperty.builder().apply(initializer).build()
