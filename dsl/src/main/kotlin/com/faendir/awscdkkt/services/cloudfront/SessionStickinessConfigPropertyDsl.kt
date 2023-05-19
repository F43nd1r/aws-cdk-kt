@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun sessionStickinessConfigProperty(initializer: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty =
    CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder().apply(initializer).build()
