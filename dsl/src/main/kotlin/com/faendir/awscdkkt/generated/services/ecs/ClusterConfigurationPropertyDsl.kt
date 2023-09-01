package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public fun buildClusterConfigurationProperty(initializer: @AwsCdkDsl
    CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit = {}):
    CfnCluster.ClusterConfigurationProperty =
    CfnCluster.ClusterConfigurationProperty.Builder().apply(initializer).build()
