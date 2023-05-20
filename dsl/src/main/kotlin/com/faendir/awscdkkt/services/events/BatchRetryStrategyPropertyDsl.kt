@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

public
    fun batchRetryStrategyProperty(initializer: CfnRule.BatchRetryStrategyProperty.Builder.() -> Unit):
    CfnRule.BatchRetryStrategyProperty =
    CfnRule.BatchRetryStrategyProperty.builder().apply(initializer).build()
