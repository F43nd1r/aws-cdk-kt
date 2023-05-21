package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@Generated
public
    fun minimumHealthyHostsProperty(initializer: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder.() -> Unit
    = {}): CfnDeploymentConfig.MinimumHealthyHostsProperty =
    CfnDeploymentConfig.MinimumHealthyHostsProperty.builder().apply(initializer).build()
