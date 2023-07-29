package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnGroupPolicy
import software.amazon.awscdk.services.iam.CfnGroupPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroupPolicy(id: String, props: CfnGroupPolicyProps): CfnGroupPolicy =
    CfnGroupPolicy(this, id, props)

@Generated
public fun Construct.cfnGroupPolicy(
  id: String,
  props: CfnGroupPolicyProps,
  initializer: @AwsCdkDsl CfnGroupPolicy.() -> Unit,
): CfnGroupPolicy = CfnGroupPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroupPolicy(id: String, initializer: @AwsCdkDsl
    CfnGroupPolicy.Builder.() -> Unit): CfnGroupPolicy = CfnGroupPolicy.Builder.create(this,
    id).apply(initializer).build()
