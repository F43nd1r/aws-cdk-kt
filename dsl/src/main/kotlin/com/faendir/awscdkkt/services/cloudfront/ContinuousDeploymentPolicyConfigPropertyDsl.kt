@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun continuousDeploymentPolicyConfigProperty(initializer: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty =
    CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder().apply(initializer).build()
