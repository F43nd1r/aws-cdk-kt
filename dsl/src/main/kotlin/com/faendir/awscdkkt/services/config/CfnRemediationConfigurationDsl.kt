@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
