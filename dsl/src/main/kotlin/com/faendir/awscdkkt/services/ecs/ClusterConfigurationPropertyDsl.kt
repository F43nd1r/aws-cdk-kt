@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

public
    fun clusterConfigurationProperty(initializer: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit):
    CfnCluster.ClusterConfigurationProperty =
    CfnCluster.ClusterConfigurationProperty.builder().apply(initializer).build()
