package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

@Generated
public
    fun containerProviderProperty(initializer: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit
    = {}): CfnVirtualCluster.ContainerProviderProperty =
    CfnVirtualCluster.ContainerProviderProperty.builder().apply(initializer).build()
