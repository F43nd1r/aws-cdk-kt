@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps
import software.constructs.Construct

public fun Construct.cfnContinuousDeploymentPolicy(
  id: String,
  props: CfnContinuousDeploymentPolicyProps,
  initializer: CfnContinuousDeploymentPolicy.() -> Unit = {},
): CfnContinuousDeploymentPolicy = CfnContinuousDeploymentPolicy(this, id, props).apply(initializer)
