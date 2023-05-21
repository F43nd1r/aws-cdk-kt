package com.faendir.awscdkkt.services.supportapp

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSlackWorkspaceConfiguration(
  id: String,
  props: CfnSlackWorkspaceConfigurationProps,
  initializer: CfnSlackWorkspaceConfiguration.() -> Unit = {},
): CfnSlackWorkspaceConfiguration = CfnSlackWorkspaceConfiguration(this, id,
    props).apply(initializer)
