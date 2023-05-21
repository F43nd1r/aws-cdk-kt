package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueueProps

@Generated
public fun cfnQueueProps(initializer: CfnQueueProps.Builder.() -> Unit = {}): CfnQueueProps =
    CfnQueueProps.builder().apply(initializer).build()
