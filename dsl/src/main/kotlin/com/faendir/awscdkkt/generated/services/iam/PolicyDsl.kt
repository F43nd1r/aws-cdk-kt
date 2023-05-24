package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyProps
import software.constructs.Construct

@Generated
public fun Construct.policy(id: String): Policy = Policy(this, id)

@Generated
public fun Construct.policy(id: String, initializer: @AwsCdkDsl Policy.() -> Unit): Policy =
    Policy(this, id).apply(initializer)

@Generated
public fun Construct.policy(id: String, props: PolicyProps): Policy = Policy(this, id, props)

@Generated
public fun Construct.policy(
  id: String,
  props: PolicyProps,
  initializer: @AwsCdkDsl Policy.() -> Unit,
): Policy = Policy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPolicy(id: String, initializer: @AwsCdkDsl Policy.Builder.() -> Unit):
    Policy = Policy.Builder.create(this, id).apply(initializer).build()
