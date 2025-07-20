package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.DeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamProps
import software.constructs.Construct

@Generated
public fun Construct.deliveryStream(
  id: String,
  props: DeliveryStreamProps,
  initializer: @AwsCdkDsl DeliveryStream.() -> Unit = {},
): DeliveryStream = DeliveryStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDeliveryStream(id: String, initializer: @AwsCdkDsl DeliveryStream.Builder.() -> Unit = {}): DeliveryStream = DeliveryStream.Builder.create(this, id).apply(initializer).build()
