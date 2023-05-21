package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination

@Generated
public
    fun httpUrlDestinationSummaryProperty(initializer: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder.() -> Unit
    = {}): CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty =
    CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.builder().apply(initializer).build()
