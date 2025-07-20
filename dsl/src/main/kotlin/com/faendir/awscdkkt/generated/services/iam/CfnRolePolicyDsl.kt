package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnRolePolicy
import software.amazon.awscdk.services.iam.CfnRolePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRolePolicy(
  id: String,
  props: CfnRolePolicyProps,
  initializer: @AwsCdkDsl CfnRolePolicy.() -> Unit = {},
): CfnRolePolicy = CfnRolePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRolePolicy(id: String, initializer: @AwsCdkDsl CfnRolePolicy.Builder.() -> Unit = {}): CfnRolePolicy = CfnRolePolicy.Builder.create(this, id).apply(initializer).build()
