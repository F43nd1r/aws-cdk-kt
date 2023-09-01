package com.faendir.awscdkkt.generated.services.organizations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnResourcePolicy
import software.amazon.awscdk.services.organizations.CfnResourcePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourcePolicy(
  id: String,
  props: CfnResourcePolicyProps,
  initializer: @AwsCdkDsl CfnResourcePolicy.() -> Unit = {},
): CfnResourcePolicy = CfnResourcePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourcePolicy(id: String, initializer: @AwsCdkDsl
    CfnResourcePolicy.Builder.() -> Unit = {}): CfnResourcePolicy =
    CfnResourcePolicy.Builder.create(this, id).apply(initializer).build()
