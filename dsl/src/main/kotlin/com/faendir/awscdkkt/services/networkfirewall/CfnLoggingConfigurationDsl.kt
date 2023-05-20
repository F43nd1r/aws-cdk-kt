@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
