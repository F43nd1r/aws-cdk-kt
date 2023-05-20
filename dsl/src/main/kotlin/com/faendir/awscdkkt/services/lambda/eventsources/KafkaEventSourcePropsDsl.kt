@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps

public fun kafkaEventSourceProps(initializer: KafkaEventSourceProps.Builder.() -> Unit):
    KafkaEventSourceProps = KafkaEventSourceProps.builder().apply(initializer).build()
