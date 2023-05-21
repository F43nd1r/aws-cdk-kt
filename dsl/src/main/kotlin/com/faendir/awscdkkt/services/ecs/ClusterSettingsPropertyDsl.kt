package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public
    fun clusterSettingsProperty(initializer: CfnCluster.ClusterSettingsProperty.Builder.() -> Unit =
    {}): CfnCluster.ClusterSettingsProperty =
    CfnCluster.ClusterSettingsProperty.builder().apply(initializer).build()
