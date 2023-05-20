@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public
    fun vpcConnectivityScramProperty(initializer: CfnCluster.VpcConnectivityScramProperty.Builder.() -> Unit):
    CfnCluster.VpcConnectivityScramProperty =
    CfnCluster.VpcConnectivityScramProperty.builder().apply(initializer).build()
