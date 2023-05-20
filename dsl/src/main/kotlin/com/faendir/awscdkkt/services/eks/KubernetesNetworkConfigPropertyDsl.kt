@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

public
    fun kubernetesNetworkConfigProperty(initializer: CfnCluster.KubernetesNetworkConfigProperty.Builder.() -> Unit):
    CfnCluster.KubernetesNetworkConfigProperty =
    CfnCluster.KubernetesNetworkConfigProperty.builder().apply(initializer).build()
