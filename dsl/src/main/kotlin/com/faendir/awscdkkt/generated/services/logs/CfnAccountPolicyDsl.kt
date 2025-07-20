package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnAccountPolicy
import software.amazon.awscdk.services.logs.CfnAccountPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccountPolicy(
  id: String,
  props: CfnAccountPolicyProps,
  initializer: @AwsCdkDsl CfnAccountPolicy.() -> Unit = {},
): CfnAccountPolicy = CfnAccountPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccountPolicy(id: String, initializer: @AwsCdkDsl CfnAccountPolicy.Builder.() -> Unit = {}): CfnAccountPolicy = CfnAccountPolicy.Builder.create(this, id).apply(initializer).build()
