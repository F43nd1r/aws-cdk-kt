package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps

@Generated
public
    fun cfnContinuousDeploymentPolicyProps(initializer: CfnContinuousDeploymentPolicyProps.Builder.() -> Unit
    = {}): CfnContinuousDeploymentPolicyProps =
    CfnContinuousDeploymentPolicyProps.builder().apply(initializer).build()
