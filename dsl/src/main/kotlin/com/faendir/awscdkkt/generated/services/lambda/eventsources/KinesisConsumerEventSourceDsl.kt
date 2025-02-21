package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.IStreamConsumer
import software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource

@Generated
public fun buildKinesisConsumerEventSource(streamConsumer: IStreamConsumer, initializer: @AwsCdkDsl
    KinesisConsumerEventSource.Builder.() -> Unit = {}): KinesisConsumerEventSource =
    KinesisConsumerEventSource.Builder.create(streamConsumer).apply(initializer).build()
