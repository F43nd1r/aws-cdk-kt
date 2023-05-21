package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@Generated
public
    fun timeBasedLinearProperty(initializer: CfnDeploymentConfig.TimeBasedLinearProperty.Builder.() -> Unit
    = {}): CfnDeploymentConfig.TimeBasedLinearProperty =
    CfnDeploymentConfig.TimeBasedLinearProperty.builder().apply(initializer).build()
