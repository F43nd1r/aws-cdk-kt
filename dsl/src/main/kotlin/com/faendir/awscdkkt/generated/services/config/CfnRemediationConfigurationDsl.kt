package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRemediationConfiguration(id: String,
    props: CfnRemediationConfigurationProps): CfnRemediationConfiguration =
    CfnRemediationConfiguration(this, id, props)

@Generated
public fun Construct.cfnRemediationConfiguration(
  id: String,
  props: CfnRemediationConfigurationProps,
  initializer: @AwsCdkDsl CfnRemediationConfiguration.() -> Unit,
): CfnRemediationConfiguration = CfnRemediationConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRemediationConfiguration(id: String, initializer: @AwsCdkDsl
    CfnRemediationConfiguration.Builder.() -> Unit): CfnRemediationConfiguration =
    CfnRemediationConfiguration.Builder.create(this, id).apply(initializer).build()
