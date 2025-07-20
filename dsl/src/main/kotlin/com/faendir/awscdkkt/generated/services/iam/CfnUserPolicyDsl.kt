package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUserPolicy
import software.amazon.awscdk.services.iam.CfnUserPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPolicy(
  id: String,
  props: CfnUserPolicyProps,
  initializer: @AwsCdkDsl CfnUserPolicy.() -> Unit = {},
): CfnUserPolicy = CfnUserPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPolicy(id: String, initializer: @AwsCdkDsl CfnUserPolicy.Builder.() -> Unit = {}): CfnUserPolicy = CfnUserPolicy.Builder.create(this, id).apply(initializer).build()
