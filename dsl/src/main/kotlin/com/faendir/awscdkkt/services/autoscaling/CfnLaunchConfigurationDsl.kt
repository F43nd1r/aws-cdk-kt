@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps
import software.constructs.Construct

public fun Construct.cfnLaunchConfiguration(
  id: String,
  props: CfnLaunchConfigurationProps,
  initializer: CfnLaunchConfiguration.() -> Unit = {},
): CfnLaunchConfiguration = CfnLaunchConfiguration(this, id, props).apply(initializer)
