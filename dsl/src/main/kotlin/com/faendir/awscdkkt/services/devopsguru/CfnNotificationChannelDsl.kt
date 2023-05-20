@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps
import software.constructs.Construct

public fun Construct.cfnNotificationChannel(
  id: String,
  props: CfnNotificationChannelProps,
  initializer: CfnNotificationChannel.() -> Unit = {},
): CfnNotificationChannel = CfnNotificationChannel(this, id, props).apply(initializer)
