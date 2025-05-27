package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration
import software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceConfiguration(
  id: String,
  props: CfnResourceConfigurationProps,
  initializer: @AwsCdkDsl CfnResourceConfiguration.() -> Unit = {},
): CfnResourceConfiguration = CfnResourceConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceConfiguration(id: String, initializer: @AwsCdkDsl
    CfnResourceConfiguration.Builder.() -> Unit = {}): CfnResourceConfiguration =
    CfnResourceConfiguration.Builder.create(this, id).apply(initializer).build()
