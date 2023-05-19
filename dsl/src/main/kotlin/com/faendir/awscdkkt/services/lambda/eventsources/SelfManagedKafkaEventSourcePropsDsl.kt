@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps

public
    fun selfManagedKafkaEventSourceProps(initializer: SelfManagedKafkaEventSourceProps.Builder.() -> Unit):
    SelfManagedKafkaEventSourceProps =
    SelfManagedKafkaEventSourceProps.builder().apply(initializer).build()
