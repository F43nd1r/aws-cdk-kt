@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig

public
    fun ecsBlueGreenDeploymentConfig(initializer: EcsBlueGreenDeploymentConfig.Builder.() -> Unit):
    EcsBlueGreenDeploymentConfig = EcsBlueGreenDeploymentConfig.builder().apply(initializer).build()
