package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLifecyclePolicy(
  id: String,
  props: CfnLifecyclePolicyProps,
  initializer: @AwsCdkDsl CfnLifecyclePolicy.() -> Unit = {},
): CfnLifecyclePolicy = CfnLifecyclePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLifecyclePolicy(id: String, initializer: @AwsCdkDsl CfnLifecyclePolicy.Builder.() -> Unit = {}): CfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this, id).apply(initializer).build()
