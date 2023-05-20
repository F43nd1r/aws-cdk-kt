@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

public
    fun clusterSettingsProperty(initializer: CfnCluster.ClusterSettingsProperty.Builder.() -> Unit):
    CfnCluster.ClusterSettingsProperty =
    CfnCluster.ClusterSettingsProperty.builder().apply(initializer).build()
