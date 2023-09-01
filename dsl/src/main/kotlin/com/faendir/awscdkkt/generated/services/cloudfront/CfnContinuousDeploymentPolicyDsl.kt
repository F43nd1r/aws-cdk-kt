package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContinuousDeploymentPolicy(
  id: String,
  props: CfnContinuousDeploymentPolicyProps,
  initializer: @AwsCdkDsl CfnContinuousDeploymentPolicy.() -> Unit = {},
): CfnContinuousDeploymentPolicy = CfnContinuousDeploymentPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContinuousDeploymentPolicy(id: String, initializer: @AwsCdkDsl
    CfnContinuousDeploymentPolicy.Builder.() -> Unit = {}): CfnContinuousDeploymentPolicy =
    CfnContinuousDeploymentPolicy.Builder.create(this, id).apply(initializer).build()
