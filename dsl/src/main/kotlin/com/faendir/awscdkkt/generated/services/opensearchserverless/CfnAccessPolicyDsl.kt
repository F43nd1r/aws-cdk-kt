package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessPolicy(
  id: String,
  props: CfnAccessPolicyProps,
  initializer: @AwsCdkDsl CfnAccessPolicy.() -> Unit = {},
): CfnAccessPolicy = CfnAccessPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessPolicy(id: String, initializer: @AwsCdkDsl
    CfnAccessPolicy.Builder.() -> Unit = {}): CfnAccessPolicy = CfnAccessPolicy.Builder.create(this,
    id).apply(initializer).build()
