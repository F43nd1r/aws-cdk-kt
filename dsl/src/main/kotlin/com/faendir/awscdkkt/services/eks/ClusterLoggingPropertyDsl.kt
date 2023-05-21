package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun clusterLoggingProperty(initializer: CfnCluster.ClusterLoggingProperty.Builder.() -> Unit
    = {}): CfnCluster.ClusterLoggingProperty =
    CfnCluster.ClusterLoggingProperty.builder().apply(initializer).build()
