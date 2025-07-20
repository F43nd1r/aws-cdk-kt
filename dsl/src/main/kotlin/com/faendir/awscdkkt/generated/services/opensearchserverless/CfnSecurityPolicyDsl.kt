package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityPolicy(
  id: String,
  props: CfnSecurityPolicyProps,
  initializer: @AwsCdkDsl CfnSecurityPolicy.() -> Unit = {},
): CfnSecurityPolicy = CfnSecurityPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityPolicy(id: String, initializer: @AwsCdkDsl CfnSecurityPolicy.Builder.() -> Unit = {}): CfnSecurityPolicy = CfnSecurityPolicy.Builder.create(this, id).apply(initializer).build()
