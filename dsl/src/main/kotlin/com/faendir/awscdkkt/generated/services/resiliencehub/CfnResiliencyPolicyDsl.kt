package com.faendir.awscdkkt.generated.services.resiliencehub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResiliencyPolicy(
  id: String,
  props: CfnResiliencyPolicyProps,
  initializer: @AwsCdkDsl CfnResiliencyPolicy.() -> Unit = {},
): CfnResiliencyPolicy = CfnResiliencyPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResiliencyPolicy(id: String, initializer: @AwsCdkDsl
    CfnResiliencyPolicy.Builder.() -> Unit = {}): CfnResiliencyPolicy =
    CfnResiliencyPolicy.Builder.create(this, id).apply(initializer).build()
