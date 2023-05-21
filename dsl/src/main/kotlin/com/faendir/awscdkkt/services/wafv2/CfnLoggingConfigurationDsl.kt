package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoggingConfiguration(
  id: String,
  props: CfnLoggingConfigurationProps,
  initializer: CfnLoggingConfiguration.() -> Unit = {},
): CfnLoggingConfiguration = CfnLoggingConfiguration(this, id, props).apply(initializer)
