package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun targetGroupInfoProperty(initializer: CfnDeploymentGroup.TargetGroupInfoProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.TargetGroupInfoProperty =
    CfnDeploymentGroup.TargetGroupInfoProperty.builder().apply(initializer).build()
