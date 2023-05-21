package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public
    fun resourcesVpcConfigProperty(initializer: CfnCluster.ResourcesVpcConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.ResourcesVpcConfigProperty =
    CfnCluster.ResourcesVpcConfigProperty.builder().apply(initializer).build()
