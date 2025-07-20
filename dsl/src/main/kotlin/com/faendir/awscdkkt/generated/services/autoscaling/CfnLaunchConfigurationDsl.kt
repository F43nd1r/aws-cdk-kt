package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchConfiguration(
  id: String,
  props: CfnLaunchConfigurationProps,
  initializer: @AwsCdkDsl CfnLaunchConfiguration.() -> Unit = {},
): CfnLaunchConfiguration = CfnLaunchConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunchConfiguration(id: String, initializer: @AwsCdkDsl CfnLaunchConfiguration.Builder.() -> Unit = {}): CfnLaunchConfiguration = CfnLaunchConfiguration.Builder.create(this, id).apply(initializer).build()
