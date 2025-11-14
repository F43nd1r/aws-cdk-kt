package com.faendir.awscdkkt.generated.interfaces.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.sqs.QueueReference

@Generated
public fun buildQueueReference(initializer: @AwsCdkDsl QueueReference.Builder.() -> Unit = {}): QueueReference = QueueReference.Builder().apply(initializer).build()
