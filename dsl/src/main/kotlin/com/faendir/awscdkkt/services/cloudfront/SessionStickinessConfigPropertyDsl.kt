@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun sessionStickinessConfigProperty(initializer: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty =
    CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder().apply(initializer).build()
