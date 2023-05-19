@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

public
    fun containerInfoProperty(initializer: CfnVirtualCluster.ContainerInfoProperty.Builder.() -> Unit):
    CfnVirtualCluster.ContainerInfoProperty =
    CfnVirtualCluster.ContainerInfoProperty.builder().apply(initializer).build()
