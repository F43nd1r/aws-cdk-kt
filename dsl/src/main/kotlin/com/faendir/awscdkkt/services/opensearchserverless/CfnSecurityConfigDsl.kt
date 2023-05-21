package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityConfig(id: String, initializer: CfnSecurityConfig.() -> Unit = {}):
    CfnSecurityConfig = CfnSecurityConfig(this, id).apply(initializer)

@Generated
public fun Construct.cfnSecurityConfig(
  id: String,
  props: CfnSecurityConfigProps,
  initializer: CfnSecurityConfig.() -> Unit = {},
): CfnSecurityConfig = CfnSecurityConfig(this, id, props).apply(initializer)
