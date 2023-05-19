@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps

public fun kafkaEventSourceProps(initializer: KafkaEventSourceProps.Builder.() -> Unit):
    KafkaEventSourceProps = KafkaEventSourceProps.builder().apply(initializer).build()
