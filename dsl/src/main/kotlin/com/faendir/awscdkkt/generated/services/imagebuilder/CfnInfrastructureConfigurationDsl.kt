package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInfrastructureConfiguration(
  id: String,
  props: CfnInfrastructureConfigurationProps,
  initializer: @AwsCdkDsl CfnInfrastructureConfiguration.() -> Unit = {},
): CfnInfrastructureConfiguration = CfnInfrastructureConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInfrastructureConfiguration(id: String, initializer: @AwsCdkDsl CfnInfrastructureConfiguration.Builder.() -> Unit = {}): CfnInfrastructureConfiguration = CfnInfrastructureConfiguration.Builder.create(this, id).apply(initializer).build()
