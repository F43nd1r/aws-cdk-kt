@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
