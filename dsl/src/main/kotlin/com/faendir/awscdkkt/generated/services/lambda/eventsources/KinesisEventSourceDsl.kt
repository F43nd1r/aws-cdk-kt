package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource

@Generated
public fun buildKinesisEventSource(stream: IStream, initializer: @AwsCdkDsl
    KinesisEventSource.Builder.() -> Unit = {}): KinesisEventSource =
    KinesisEventSource.Builder.create(stream).apply(initializer).build()
