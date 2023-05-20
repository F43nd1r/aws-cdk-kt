@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps
import software.constructs.Construct

public fun Construct.cfnLoggingConfiguration(
  id: String,
  props: CfnLoggingConfigurationProps,
  initializer: CfnLoggingConfiguration.() -> Unit = {},
): CfnLoggingConfiguration = CfnLoggingConfiguration(this, id, props).apply(initializer)
