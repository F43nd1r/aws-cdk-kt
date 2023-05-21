package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun outpostConfigProperty(initializer: CfnCluster.OutpostConfigProperty.Builder.() -> Unit =
    {}): CfnCluster.OutpostConfigProperty =
    CfnCluster.OutpostConfigProperty.builder().apply(initializer).build()
