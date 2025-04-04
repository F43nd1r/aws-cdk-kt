package com.faendir.awscdkkt.generated.services.logs.destinations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream
import software.amazon.awscdk.services.logs.destinations.FirehoseDestination

@Generated
public fun buildFirehoseDestination(stream: IDeliveryStream, initializer: @AwsCdkDsl
    FirehoseDestination.Builder.() -> Unit = {}): FirehoseDestination =
    FirehoseDestination.Builder.create(stream).apply(initializer).build()
