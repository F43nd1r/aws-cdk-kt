package com.faendir.awscdkkt.generated.services.supportapp

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnSlackWorkspaceConfiguration.() -> Unit = {},
): CfnSlackWorkspaceConfiguration = CfnSlackWorkspaceConfiguration(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnSlackWorkspaceConfiguration(id: String, initializer: @AwsCdkDsl
    CfnSlackWorkspaceConfiguration.Builder.() -> Unit = {}): CfnSlackWorkspaceConfiguration =
    CfnSlackWorkspaceConfiguration.Builder.create(this, id).apply(initializer).build()
