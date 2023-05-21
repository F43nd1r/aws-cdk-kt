package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@Generated
public
    fun sessionStickinessConfigProperty(initializer: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder.() -> Unit
    = {}): CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty =
    CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder().apply(initializer).build()
