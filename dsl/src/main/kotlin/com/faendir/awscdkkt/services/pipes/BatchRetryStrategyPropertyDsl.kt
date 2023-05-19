@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun batchRetryStrategyProperty(initializer: CfnPipe.BatchRetryStrategyProperty.Builder.() -> Unit):
    CfnPipe.BatchRetryStrategyProperty =
    CfnPipe.BatchRetryStrategyProperty.builder().apply(initializer).build()
