package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource

@Generated
public fun buildManagedKafkaEventSource(initializer: @AwsCdkDsl
    ManagedKafkaEventSource.Builder.() -> Unit): ManagedKafkaEventSource =
    ManagedKafkaEventSource.Builder.create().apply(initializer).build()
