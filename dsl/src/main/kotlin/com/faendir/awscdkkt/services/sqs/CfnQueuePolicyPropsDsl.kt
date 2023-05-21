package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps

@Generated
public fun cfnQueuePolicyProps(initializer: CfnQueuePolicyProps.Builder.() -> Unit = {}):
    CfnQueuePolicyProps = CfnQueuePolicyProps.builder().apply(initializer).build()
