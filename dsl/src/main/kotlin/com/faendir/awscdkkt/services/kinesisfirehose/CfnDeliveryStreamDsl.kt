@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
import software.constructs.Construct

public fun Construct.cfnDeliveryStream(id: String, initializer: CfnDeliveryStream.() -> Unit = {}):
    CfnDeliveryStream = CfnDeliveryStream(this, id).apply(initializer)

public fun Construct.cfnDeliveryStream(
  id: String,
  props: CfnDeliveryStreamProps,
  initializer: CfnDeliveryStream.() -> Unit = {},
): CfnDeliveryStream = CfnDeliveryStream(this, id, props).apply(initializer)
