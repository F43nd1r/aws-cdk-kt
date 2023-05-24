package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun snsEventSource(topic: ITopic): SnsEventSource = SnsEventSource(topic)

@Generated
public fun snsEventSource(topic: ITopic, props: SnsEventSourceProps): SnsEventSource =
    SnsEventSource(topic, props)

@Generated
public fun buildSnsEventSource(topic: ITopic, initializer: @AwsCdkDsl
    SnsEventSource.Builder.() -> Unit): SnsEventSource =
    SnsEventSource.Builder.create(topic).apply(initializer).build()
