package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.FirehoseDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream

@Generated
public fun buildFirehoseDeliveryStream(deliveryStream: IDeliveryStream, initializer: @AwsCdkDsl FirehoseDeliveryStream.Builder.() -> Unit = {}): FirehoseDeliveryStream = FirehoseDeliveryStream.Builder.create(deliveryStream).apply(initializer).build()
