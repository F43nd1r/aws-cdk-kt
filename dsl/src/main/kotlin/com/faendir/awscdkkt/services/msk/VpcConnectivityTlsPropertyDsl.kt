@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public
    fun vpcConnectivityTlsProperty(initializer: CfnCluster.VpcConnectivityTlsProperty.Builder.() -> Unit):
    CfnCluster.VpcConnectivityTlsProperty =
    CfnCluster.VpcConnectivityTlsProperty.builder().apply(initializer).build()
