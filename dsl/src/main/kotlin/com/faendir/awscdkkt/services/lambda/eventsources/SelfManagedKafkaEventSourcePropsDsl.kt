@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps

public
    fun selfManagedKafkaEventSourceProps(initializer: SelfManagedKafkaEventSourceProps.Builder.() -> Unit):
    SelfManagedKafkaEventSourceProps =
    SelfManagedKafkaEventSourceProps.builder().apply(initializer).build()
