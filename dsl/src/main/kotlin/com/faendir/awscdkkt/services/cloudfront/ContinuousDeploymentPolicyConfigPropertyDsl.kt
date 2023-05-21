package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@Generated
public
    fun continuousDeploymentPolicyConfigProperty(initializer: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit
    = {}): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty =
    CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder().apply(initializer).build()
