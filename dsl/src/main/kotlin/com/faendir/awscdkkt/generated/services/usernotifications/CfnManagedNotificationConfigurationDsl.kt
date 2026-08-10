package com.faendir.awscdkkt.generated.services.usernotifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.usernotifications.CfnManagedNotificationConfiguration
import software.amazon.awscdk.services.usernotifications.CfnManagedNotificationConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnManagedNotificationConfiguration(id: String, initializer: @AwsCdkDsl CfnManagedNotificationConfiguration.() -> Unit = {}): CfnManagedNotificationConfiguration = CfnManagedNotificationConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnManagedNotificationConfiguration(
  id: String,
  props: CfnManagedNotificationConfigurationProps,
  initializer: @AwsCdkDsl CfnManagedNotificationConfiguration.() -> Unit = {},
): CfnManagedNotificationConfiguration = CfnManagedNotificationConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnManagedNotificationConfiguration(id: String, initializer: @AwsCdkDsl CfnManagedNotificationConfiguration.Builder.() -> Unit = {}): CfnManagedNotificationConfiguration = CfnManagedNotificationConfiguration.Builder.create(this, id).apply(initializer).build()
