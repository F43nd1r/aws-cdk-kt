package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobQueueProps

@Generated
public fun cfnJobQueueProps(initializer: CfnJobQueueProps.Builder.() -> Unit = {}): CfnJobQueueProps
    = CfnJobQueueProps.builder().apply(initializer).build()
