package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStream
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun kinesisFirehoseStream(stream: CfnDeliveryStream): KinesisFirehoseStream =
    KinesisFirehoseStream(stream)

@Generated
public fun kinesisFirehoseStream(stream: CfnDeliveryStream, props: KinesisFirehoseStreamProps):
    KinesisFirehoseStream = KinesisFirehoseStream(stream, props)

@Generated
public fun buildKinesisFirehoseStream(stream: CfnDeliveryStream, initializer: @AwsCdkDsl
    KinesisFirehoseStream.Builder.() -> Unit): KinesisFirehoseStream =
    KinesisFirehoseStream.Builder.create(stream).apply(initializer).build()
