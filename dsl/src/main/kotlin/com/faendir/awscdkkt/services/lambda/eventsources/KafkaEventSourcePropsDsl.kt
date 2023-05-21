package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps

@Generated
public fun kafkaEventSourceProps(initializer: KafkaEventSourceProps.Builder.() -> Unit = {}):
    KafkaEventSourceProps = KafkaEventSourceProps.builder().apply(initializer).build()
