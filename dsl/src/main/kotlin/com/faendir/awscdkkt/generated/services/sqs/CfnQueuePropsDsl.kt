package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueueProps

@Generated
public fun buildCfnQueueProps(initializer: @AwsCdkDsl CfnQueueProps.Builder.() -> Unit):
    CfnQueueProps = CfnQueueProps.Builder().apply(initializer).build()
