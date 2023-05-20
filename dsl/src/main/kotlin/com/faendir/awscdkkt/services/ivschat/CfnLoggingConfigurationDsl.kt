@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ivschat

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps
import software.constructs.Construct

public fun Construct.cfnLoggingConfiguration(
  id: String,
  props: CfnLoggingConfigurationProps,
  initializer: CfnLoggingConfiguration.() -> Unit = {},
): CfnLoggingConfiguration = CfnLoggingConfiguration(this, id, props).apply(initializer)
