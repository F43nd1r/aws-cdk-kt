@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

public
    fun containerInfoProperty(initializer: CfnVirtualCluster.ContainerInfoProperty.Builder.() -> Unit):
    CfnVirtualCluster.ContainerInfoProperty =
    CfnVirtualCluster.ContainerInfoProperty.builder().apply(initializer).build()
