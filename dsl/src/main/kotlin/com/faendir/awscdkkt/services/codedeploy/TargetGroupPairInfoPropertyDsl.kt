package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun targetGroupPairInfoProperty(initializer: CfnDeploymentGroup.TargetGroupPairInfoProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.TargetGroupPairInfoProperty =
    CfnDeploymentGroup.TargetGroupPairInfoProperty.builder().apply(initializer).build()
