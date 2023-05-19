@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps
import software.constructs.Construct

public fun Construct.cfnDeliveryChannel(
  id: String,
  props: CfnDeliveryChannelProps,
  initializer: CfnDeliveryChannel.() -> Unit = {},
): CfnDeliveryChannel = CfnDeliveryChannel(this, id, props).apply(initializer)
