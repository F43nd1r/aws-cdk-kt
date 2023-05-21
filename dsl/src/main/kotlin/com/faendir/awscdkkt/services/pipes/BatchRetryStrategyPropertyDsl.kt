package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun batchRetryStrategyProperty(initializer: CfnPipe.BatchRetryStrategyProperty.Builder.() -> Unit
    = {}): CfnPipe.BatchRetryStrategyProperty =
    CfnPipe.BatchRetryStrategyProperty.builder().apply(initializer).build()
