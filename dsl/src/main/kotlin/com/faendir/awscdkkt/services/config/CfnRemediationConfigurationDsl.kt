@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
import software.constructs.Construct

public fun Construct.cfnRemediationConfiguration(
  id: String,
  props: CfnRemediationConfigurationProps,
  initializer: CfnRemediationConfiguration.() -> Unit = {},
): CfnRemediationConfiguration = CfnRemediationConfiguration(this, id, props).apply(initializer)
