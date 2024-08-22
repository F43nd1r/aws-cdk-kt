package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy
import software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerTrafficPolicy(
  id: String,
  props: CfnMailManagerTrafficPolicyProps,
  initializer: @AwsCdkDsl CfnMailManagerTrafficPolicy.() -> Unit = {},
): CfnMailManagerTrafficPolicy = CfnMailManagerTrafficPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerTrafficPolicy(id: String, initializer: @AwsCdkDsl
    CfnMailManagerTrafficPolicy.Builder.() -> Unit = {}): CfnMailManagerTrafficPolicy =
    CfnMailManagerTrafficPolicy.Builder.create(this, id).apply(initializer).build()
