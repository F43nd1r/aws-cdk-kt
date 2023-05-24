package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SqsQueueProps

@Generated
public fun buildSqsQueueProps(initializer: @AwsCdkDsl SqsQueueProps.Builder.() -> Unit):
    SqsQueueProps = SqsQueueProps.Builder().apply(initializer).build()
