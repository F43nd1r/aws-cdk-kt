package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource

@Generated
public fun buildSelfManagedKafkaEventSource(initializer: @AwsCdkDsl
    SelfManagedKafkaEventSource.Builder.() -> Unit): SelfManagedKafkaEventSource =
    SelfManagedKafkaEventSource.Builder.create().apply(initializer).build()
