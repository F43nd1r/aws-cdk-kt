package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnPolicy
import software.amazon.awscdk.services.iot.CfnPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicy(
  id: String,
  props: CfnPolicyProps,
  initializer: @AwsCdkDsl CfnPolicy.() -> Unit = {},
): CfnPolicy = CfnPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicy(id: String, initializer: @AwsCdkDsl CfnPolicy.Builder.() -> Unit = {}): CfnPolicy = CfnPolicy.Builder.create(this, id).apply(initializer).build()
