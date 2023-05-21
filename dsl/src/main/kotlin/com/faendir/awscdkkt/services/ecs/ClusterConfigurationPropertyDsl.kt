package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public
    fun clusterConfigurationProperty(initializer: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit
    = {}): CfnCluster.ClusterConfigurationProperty =
    CfnCluster.ClusterConfigurationProperty.builder().apply(initializer).build()
