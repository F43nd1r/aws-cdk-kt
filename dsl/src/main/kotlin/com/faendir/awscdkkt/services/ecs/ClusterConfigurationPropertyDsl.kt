@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

public
    fun clusterConfigurationProperty(initializer: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit):
    CfnCluster.ClusterConfigurationProperty =
    CfnCluster.ClusterConfigurationProperty.builder().apply(initializer).build()
