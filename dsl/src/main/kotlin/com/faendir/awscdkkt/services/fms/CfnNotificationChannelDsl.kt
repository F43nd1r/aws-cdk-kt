@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.amazon.awscdk.services.fms.CfnNotificationChannelProps
import software.constructs.Construct

public fun Construct.cfnNotificationChannel(
  id: String,
  props: CfnNotificationChannelProps,
  initializer: CfnNotificationChannel.() -> Unit = {},
): CfnNotificationChannel = CfnNotificationChannel(this, id, props).apply(initializer)
