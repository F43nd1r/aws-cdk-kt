@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Deprecated(message =
    "software.amazon.awscdk.services.events.targets.KinesisFirehoseStream is deprecated in CDK.")
@Generated
public fun buildKinesisFirehoseStream(stream: CfnDeliveryStream, initializer: @AwsCdkDsl
    KinesisFirehoseStream.Builder.() -> Unit = {}): KinesisFirehoseStream =
    KinesisFirehoseStream.Builder.create(stream).apply(initializer).build()
