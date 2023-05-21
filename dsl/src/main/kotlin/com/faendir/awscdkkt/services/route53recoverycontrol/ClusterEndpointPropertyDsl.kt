package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster

@Generated
public
    fun clusterEndpointProperty(initializer: CfnCluster.ClusterEndpointProperty.Builder.() -> Unit =
    {}): CfnCluster.ClusterEndpointProperty =
    CfnCluster.ClusterEndpointProperty.builder().apply(initializer).build()
