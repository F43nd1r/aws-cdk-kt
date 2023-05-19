@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public
    fun vpcConfigProperty(initializer: CfnServerlessCluster.VpcConfigProperty.Builder.() -> Unit):
    CfnServerlessCluster.VpcConfigProperty =
    CfnServerlessCluster.VpcConfigProperty.builder().apply(initializer).build()
