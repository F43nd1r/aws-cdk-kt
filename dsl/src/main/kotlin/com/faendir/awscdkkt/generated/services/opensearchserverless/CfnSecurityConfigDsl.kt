package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityConfig(id: String): CfnSecurityConfig = CfnSecurityConfig(this, id)

@Generated
public fun Construct.cfnSecurityConfig(id: String, initializer: @AwsCdkDsl
    CfnSecurityConfig.() -> Unit): CfnSecurityConfig = CfnSecurityConfig(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnSecurityConfig(id: String, props: CfnSecurityConfigProps): CfnSecurityConfig
    = CfnSecurityConfig(this, id, props)

@Generated
public fun Construct.cfnSecurityConfig(
  id: String,
  props: CfnSecurityConfigProps,
  initializer: @AwsCdkDsl CfnSecurityConfig.() -> Unit,
): CfnSecurityConfig = CfnSecurityConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityConfig(id: String, initializer: @AwsCdkDsl
    CfnSecurityConfig.Builder.() -> Unit): CfnSecurityConfig =
    CfnSecurityConfig.Builder.create(this, id).apply(initializer).build()
