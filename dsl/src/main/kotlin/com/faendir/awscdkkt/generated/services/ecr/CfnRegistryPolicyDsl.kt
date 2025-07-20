package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistryPolicy(
  id: String,
  props: CfnRegistryPolicyProps,
  initializer: @AwsCdkDsl CfnRegistryPolicy.() -> Unit = {},
): CfnRegistryPolicy = CfnRegistryPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegistryPolicy(id: String, initializer: @AwsCdkDsl CfnRegistryPolicy.Builder.() -> Unit = {}): CfnRegistryPolicy = CfnRegistryPolicy.Builder.create(this, id).apply(initializer).build()
