@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public
    fun vpcConnectivityProperty(initializer: CfnCluster.VpcConnectivityProperty.Builder.() -> Unit):
    CfnCluster.VpcConnectivityProperty =
    CfnCluster.VpcConnectivityProperty.builder().apply(initializer).build()
