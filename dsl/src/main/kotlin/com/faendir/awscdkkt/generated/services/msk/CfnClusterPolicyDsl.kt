package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnClusterPolicy
import software.amazon.awscdk.services.msk.CfnClusterPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterPolicy(
  id: String,
  props: CfnClusterPolicyProps,
  initializer: @AwsCdkDsl CfnClusterPolicy.() -> Unit = {},
): CfnClusterPolicy = CfnClusterPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterPolicy(id: String, initializer: @AwsCdkDsl CfnClusterPolicy.Builder.() -> Unit = {}): CfnClusterPolicy = CfnClusterPolicy.Builder.create(this, id).apply(initializer).build()
