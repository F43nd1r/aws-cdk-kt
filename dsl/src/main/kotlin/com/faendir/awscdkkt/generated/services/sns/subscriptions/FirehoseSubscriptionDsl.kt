package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream
import software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription

@Generated
public fun buildFirehoseSubscription(deliveryStream: IDeliveryStream, initializer: @AwsCdkDsl
    FirehoseSubscription.Builder.() -> Unit = {}): FirehoseSubscription =
    FirehoseSubscription.Builder.create(deliveryStream).apply(initializer).build()
