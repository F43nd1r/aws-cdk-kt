package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueuePolicyProps

@Generated
public fun buildQueuePolicyProps(initializer: @AwsCdkDsl QueuePolicyProps.Builder.() -> Unit = {}):
    QueuePolicyProps = QueuePolicyProps.Builder().apply(initializer).build()
