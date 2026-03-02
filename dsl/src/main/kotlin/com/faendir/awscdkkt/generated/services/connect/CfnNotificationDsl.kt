package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnNotification
import software.amazon.awscdk.services.connect.CfnNotificationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotification(
  id: String,
  props: CfnNotificationProps,
  initializer: @AwsCdkDsl CfnNotification.() -> Unit = {},
): CfnNotification = CfnNotification(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotification(id: String, initializer: @AwsCdkDsl CfnNotification.Builder.() -> Unit = {}): CfnNotification = CfnNotification.Builder.create(this, id).apply(initializer).build()
