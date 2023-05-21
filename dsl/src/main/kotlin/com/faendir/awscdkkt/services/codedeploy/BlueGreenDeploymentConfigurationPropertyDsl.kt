package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun blueGreenDeploymentConfigurationProperty(initializer: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty =
    CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.builder().apply(initializer).build()
