@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

public
    fun containerProviderProperty(initializer: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit):
    CfnVirtualCluster.ContainerProviderProperty =
    CfnVirtualCluster.ContainerProviderProperty.builder().apply(initializer).build()
