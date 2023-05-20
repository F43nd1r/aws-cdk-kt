@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
import software.constructs.Construct

public fun Construct.cfnDeliveryStream(
  id: String,
  props: CfnDeliveryStreamProps,
  initializer: CfnDeliveryStream.() -> Unit = {},
): CfnDeliveryStream = CfnDeliveryStream(this, id, props).apply(initializer)

public fun Construct.cfnDeliveryStream(id: String, initializer: CfnDeliveryStream.() -> Unit = {}):
    CfnDeliveryStream = CfnDeliveryStream(this, id).apply(initializer)
