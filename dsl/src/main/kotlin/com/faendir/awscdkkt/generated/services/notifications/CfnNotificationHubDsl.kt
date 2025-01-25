package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnNotificationHub
import software.amazon.awscdk.services.notifications.CfnNotificationHubProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotificationHub(
  id: String,
  props: CfnNotificationHubProps,
  initializer: @AwsCdkDsl CfnNotificationHub.() -> Unit = {},
): CfnNotificationHub = CfnNotificationHub(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotificationHub(id: String, initializer: @AwsCdkDsl
    CfnNotificationHub.Builder.() -> Unit = {}): CfnNotificationHub =
    CfnNotificationHub.Builder.create(this, id).apply(initializer).build()
