@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun batchRetryStrategyProperty(initializer: CfnPipe.BatchRetryStrategyProperty.Builder.() -> Unit):
    CfnPipe.BatchRetryStrategyProperty =
    CfnPipe.BatchRetryStrategyProperty.builder().apply(initializer).build()
