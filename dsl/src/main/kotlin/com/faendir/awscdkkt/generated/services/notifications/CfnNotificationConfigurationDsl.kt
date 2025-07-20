package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnNotificationConfiguration
import software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotificationConfiguration(
  id: String,
  props: CfnNotificationConfigurationProps,
  initializer: @AwsCdkDsl CfnNotificationConfiguration.() -> Unit = {},
): CfnNotificationConfiguration = CfnNotificationConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotificationConfiguration(id: String, initializer: @AwsCdkDsl CfnNotificationConfiguration.Builder.() -> Unit = {}): CfnNotificationConfiguration = CfnNotificationConfiguration.Builder.create(this, id).apply(initializer).build()
