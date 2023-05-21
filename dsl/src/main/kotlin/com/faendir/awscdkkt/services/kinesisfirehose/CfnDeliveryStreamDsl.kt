package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeliveryStream(id: String, initializer: CfnDeliveryStream.() -> Unit = {}):
    CfnDeliveryStream = CfnDeliveryStream(this, id).apply(initializer)

@Generated
public fun Construct.cfnDeliveryStream(
  id: String,
  props: CfnDeliveryStreamProps,
  initializer: CfnDeliveryStream.() -> Unit = {},
): CfnDeliveryStream = CfnDeliveryStream(this, id, props).apply(initializer)
