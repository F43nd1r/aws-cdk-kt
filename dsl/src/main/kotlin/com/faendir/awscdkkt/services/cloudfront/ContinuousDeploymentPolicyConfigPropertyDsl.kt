@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun continuousDeploymentPolicyConfigProperty(initializer: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty =
    CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder().apply(initializer).build()
