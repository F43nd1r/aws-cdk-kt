package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAuthPolicy(
  id: String,
  props: CfnAuthPolicyProps,
  initializer: @AwsCdkDsl CfnAuthPolicy.() -> Unit = {},
): CfnAuthPolicy = CfnAuthPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAuthPolicy(id: String, initializer: @AwsCdkDsl CfnAuthPolicy.Builder.() -> Unit = {}): CfnAuthPolicy = CfnAuthPolicy.Builder.create(this, id).apply(initializer).build()
