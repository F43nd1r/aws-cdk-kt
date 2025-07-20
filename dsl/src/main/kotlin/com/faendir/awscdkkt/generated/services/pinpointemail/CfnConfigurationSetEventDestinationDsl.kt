package com.faendir.awscdkkt.generated.services.pinpointemail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationSetEventDestination(
  id: String,
  props: CfnConfigurationSetEventDestinationProps,
  initializer: @AwsCdkDsl CfnConfigurationSetEventDestination.() -> Unit = {},
): CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationSetEventDestination(id: String, initializer: @AwsCdkDsl CfnConfigurationSetEventDestination.Builder.() -> Unit = {}): CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination.Builder.create(this, id).apply(initializer).build()
