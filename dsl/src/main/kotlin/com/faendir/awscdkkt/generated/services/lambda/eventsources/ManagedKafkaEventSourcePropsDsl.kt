package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps

@Generated
public fun buildManagedKafkaEventSourceProps(initializer: @AwsCdkDsl
    ManagedKafkaEventSourceProps.Builder.() -> Unit): ManagedKafkaEventSourceProps =
    ManagedKafkaEventSourceProps.Builder().apply(initializer).build()
