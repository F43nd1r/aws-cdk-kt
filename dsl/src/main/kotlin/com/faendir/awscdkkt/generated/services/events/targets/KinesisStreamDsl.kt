package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.KinesisStream
import software.amazon.awscdk.services.kinesis.IStream

@Generated
public fun buildKinesisStream(stream: IStream, initializer: @AwsCdkDsl
    KinesisStream.Builder.() -> Unit): KinesisStream =
    KinesisStream.Builder.create(stream).apply(initializer).build()
