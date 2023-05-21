package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun onPremisesTagSetProperty(initializer: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.OnPremisesTagSetProperty =
    CfnDeploymentGroup.OnPremisesTagSetProperty.builder().apply(initializer).build()
