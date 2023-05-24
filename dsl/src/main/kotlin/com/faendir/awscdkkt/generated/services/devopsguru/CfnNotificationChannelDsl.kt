package com.faendir.awscdkkt.generated.services.devopsguru

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotificationChannel(id: String, props: CfnNotificationChannelProps):
    CfnNotificationChannel = CfnNotificationChannel(this, id, props)

@Generated
public fun Construct.cfnNotificationChannel(
  id: String,
  props: CfnNotificationChannelProps,
  initializer: @AwsCdkDsl CfnNotificationChannel.() -> Unit,
): CfnNotificationChannel = CfnNotificationChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotificationChannel(id: String, initializer: @AwsCdkDsl
    CfnNotificationChannel.Builder.() -> Unit): CfnNotificationChannel =
    CfnNotificationChannel.Builder.create(this, id).apply(initializer).build()
