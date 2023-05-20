@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnConfiguration
import software.amazon.awscdk.services.msk.CfnConfigurationProps
import software.constructs.Construct

public fun Construct.cfnConfiguration(
  id: String,
  props: CfnConfigurationProps,
  initializer: CfnConfiguration.() -> Unit = {},
): CfnConfiguration = CfnConfiguration(this, id, props).apply(initializer)
