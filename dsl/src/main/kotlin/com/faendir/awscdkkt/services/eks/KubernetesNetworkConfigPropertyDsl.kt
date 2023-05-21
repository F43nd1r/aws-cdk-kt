package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public
    fun kubernetesNetworkConfigProperty(initializer: CfnCluster.KubernetesNetworkConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.KubernetesNetworkConfigProperty =
    CfnCluster.KubernetesNetworkConfigProperty.builder().apply(initializer).build()
