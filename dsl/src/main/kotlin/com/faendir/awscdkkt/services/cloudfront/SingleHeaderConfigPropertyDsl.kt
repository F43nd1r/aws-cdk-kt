@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun singleHeaderConfigProperty(initializer: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty =
    CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder().apply(initializer).build()
