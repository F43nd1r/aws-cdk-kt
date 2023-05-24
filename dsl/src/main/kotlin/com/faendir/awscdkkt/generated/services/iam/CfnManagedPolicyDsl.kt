package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnManagedPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnManagedPolicy(id: String, props: CfnManagedPolicyProps): CfnManagedPolicy =
    CfnManagedPolicy(this, id, props)

@Generated
public fun Construct.cfnManagedPolicy(
  id: String,
  props: CfnManagedPolicyProps,
  initializer: @AwsCdkDsl CfnManagedPolicy.() -> Unit,
): CfnManagedPolicy = CfnManagedPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnManagedPolicy(id: String, initializer: @AwsCdkDsl
    CfnManagedPolicy.Builder.() -> Unit): CfnManagedPolicy = CfnManagedPolicy.Builder.create(this,
    id).apply(initializer).build()
