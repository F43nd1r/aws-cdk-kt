@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.supportapp

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
import software.constructs.Construct

public fun Construct.cfnSlackWorkspaceConfiguration(
  id: String,
  props: CfnSlackWorkspaceConfigurationProps,
  initializer: CfnSlackWorkspaceConfiguration.() -> Unit = {},
): CfnSlackWorkspaceConfiguration = CfnSlackWorkspaceConfiguration(this, id,
    props).apply(initializer)
