package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps

@Generated
public fun buildKafkaEventSourceProps(initializer: @AwsCdkDsl
    KafkaEventSourceProps.Builder.() -> Unit = {}): KafkaEventSourceProps =
    KafkaEventSourceProps.Builder().apply(initializer).build()
