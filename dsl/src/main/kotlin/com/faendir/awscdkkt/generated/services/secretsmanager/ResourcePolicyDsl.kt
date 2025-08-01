package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.ResourcePolicy
import software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.resourcePolicy(
  id: String,
  props: ResourcePolicyProps,
  initializer: @AwsCdkDsl ResourcePolicy.() -> Unit = {},
): ResourcePolicy = ResourcePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildResourcePolicy(id: String, initializer: @AwsCdkDsl ResourcePolicy.Builder.() -> Unit = {}): ResourcePolicy = ResourcePolicy.Builder.create(this, id).apply(initializer).build()
