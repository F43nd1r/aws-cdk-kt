package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun loadBalancerInfoProperty(initializer: CfnDeploymentGroup.LoadBalancerInfoProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.LoadBalancerInfoProperty =
    CfnDeploymentGroup.LoadBalancerInfoProperty.builder().apply(initializer).build()
