package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun retryStrategyProperty(initializer: CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.RetryStrategyProperty =
    CfnJobDefinition.RetryStrategyProperty.builder().apply(initializer).build()
