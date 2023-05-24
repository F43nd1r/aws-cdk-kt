package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityConfiguration(id: String, props: CfnSecurityConfigurationProps):
    CfnSecurityConfiguration = CfnSecurityConfiguration(this, id, props)

@Generated
public fun Construct.cfnSecurityConfiguration(
  id: String,
  props: CfnSecurityConfigurationProps,
  initializer: @AwsCdkDsl CfnSecurityConfiguration.() -> Unit,
): CfnSecurityConfiguration = CfnSecurityConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityConfiguration(id: String, initializer: @AwsCdkDsl
    CfnSecurityConfiguration.Builder.() -> Unit): CfnSecurityConfiguration =
    CfnSecurityConfiguration.Builder.create(this, id).apply(initializer).build()
