package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeliveryChannel(
  id: String,
  props: CfnDeliveryChannelProps,
  initializer: CfnDeliveryChannel.() -> Unit = {},
): CfnDeliveryChannel = CfnDeliveryChannel(this, id, props).apply(initializer)
