package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.IDeliveryStream
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2

@Generated
public fun buildKinesisFirehoseStreamV2(stream: IDeliveryStream, initializer: @AwsCdkDsl
    KinesisFirehoseStreamV2.Builder.() -> Unit = {}): KinesisFirehoseStreamV2 =
    KinesisFirehoseStreamV2.Builder.create(stream).apply(initializer).build()
