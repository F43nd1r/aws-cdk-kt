package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun blueInstanceTerminationOptionProperty(initializer: CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.BlueInstanceTerminationOptionProperty =
    CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.builder().apply(initializer).build()
