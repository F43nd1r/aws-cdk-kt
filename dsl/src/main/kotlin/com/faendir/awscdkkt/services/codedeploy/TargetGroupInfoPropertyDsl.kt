@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun targetGroupInfoProperty(initializer: CfnDeploymentGroup.TargetGroupInfoProperty.Builder.() -> Unit):
    CfnDeploymentGroup.TargetGroupInfoProperty =
    CfnDeploymentGroup.TargetGroupInfoProperty.builder().apply(initializer).build()
