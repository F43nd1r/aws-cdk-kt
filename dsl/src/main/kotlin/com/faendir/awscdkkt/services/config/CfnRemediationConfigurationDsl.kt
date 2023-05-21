package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRemediationConfiguration(
  id: String,
  props: CfnRemediationConfigurationProps,
  initializer: CfnRemediationConfiguration.() -> Unit = {},
): CfnRemediationConfiguration = CfnRemediationConfiguration(this, id, props).apply(initializer)
