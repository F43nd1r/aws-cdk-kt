package com.faendir.awscdkkt.generated.services.s3objectlambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessPointPolicy(
  id: String,
  props: CfnAccessPointPolicyProps,
  initializer: @AwsCdkDsl CfnAccessPointPolicy.() -> Unit = {},
): CfnAccessPointPolicy = CfnAccessPointPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessPointPolicy(id: String, initializer: @AwsCdkDsl
    CfnAccessPointPolicy.Builder.() -> Unit = {}): CfnAccessPointPolicy =
    CfnAccessPointPolicy.Builder.create(this, id).apply(initializer).build()
