package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun batchRetryStrategyProperty(initializer: CfnRule.BatchRetryStrategyProperty.Builder.() -> Unit
    = {}): CfnRule.BatchRetryStrategyProperty =
    CfnRule.BatchRetryStrategyProperty.builder().apply(initializer).build()
