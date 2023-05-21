package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun vpcConnectivityProperty(initializer: CfnCluster.VpcConnectivityProperty.Builder.() -> Unit =
    {}): CfnCluster.VpcConnectivityProperty =
    CfnCluster.VpcConnectivityProperty.builder().apply(initializer).build()
