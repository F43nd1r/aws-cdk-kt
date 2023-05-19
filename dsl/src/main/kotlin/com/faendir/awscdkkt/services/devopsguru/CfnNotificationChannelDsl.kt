@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
