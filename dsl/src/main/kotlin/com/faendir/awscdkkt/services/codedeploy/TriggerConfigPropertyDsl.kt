@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun triggerConfigProperty(initializer: CfnDeploymentGroup.TriggerConfigProperty.Builder.() -> Unit):
    CfnDeploymentGroup.TriggerConfigProperty =
    CfnDeploymentGroup.TriggerConfigProperty.builder().apply(initializer).build()
