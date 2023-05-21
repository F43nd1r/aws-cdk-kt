package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

@Generated
public
    fun containerInfoProperty(initializer: CfnVirtualCluster.ContainerInfoProperty.Builder.() -> Unit
    = {}): CfnVirtualCluster.ContainerInfoProperty =
    CfnVirtualCluster.ContainerInfoProperty.builder().apply(initializer).build()
