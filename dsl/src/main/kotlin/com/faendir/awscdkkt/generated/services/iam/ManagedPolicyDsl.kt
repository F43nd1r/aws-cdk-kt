package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.managedPolicy(id: String, props: ManagedPolicyProps): ManagedPolicy =
    ManagedPolicy(this, id, props)

@Generated
public fun Construct.managedPolicy(
  id: String,
  props: ManagedPolicyProps,
  initializer: @AwsCdkDsl ManagedPolicy.() -> Unit,
): ManagedPolicy = ManagedPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.managedPolicy(id: String): ManagedPolicy = ManagedPolicy(this, id)

@Generated
public fun Construct.managedPolicy(id: String, initializer: @AwsCdkDsl ManagedPolicy.() -> Unit):
    ManagedPolicy = ManagedPolicy(this, id).apply(initializer)

@Generated
public fun Construct.buildManagedPolicy(id: String, initializer: @AwsCdkDsl
    ManagedPolicy.Builder.() -> Unit): ManagedPolicy = ManagedPolicy.Builder.create(this,
    id).apply(initializer).build()
