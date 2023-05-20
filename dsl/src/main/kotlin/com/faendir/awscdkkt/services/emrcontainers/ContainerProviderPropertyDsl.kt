@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

public
    fun containerProviderProperty(initializer: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit):
    CfnVirtualCluster.ContainerProviderProperty =
    CfnVirtualCluster.ContainerProviderProperty.builder().apply(initializer).build()
