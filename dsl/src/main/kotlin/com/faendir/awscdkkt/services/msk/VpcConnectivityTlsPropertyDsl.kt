package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun vpcConnectivityTlsProperty(initializer: CfnCluster.VpcConnectivityTlsProperty.Builder.() -> Unit
    = {}): CfnCluster.VpcConnectivityTlsProperty =
    CfnCluster.VpcConnectivityTlsProperty.builder().apply(initializer).build()
