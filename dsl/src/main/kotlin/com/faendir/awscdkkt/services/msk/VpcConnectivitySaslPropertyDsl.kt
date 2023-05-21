package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun vpcConnectivitySaslProperty(initializer: CfnCluster.VpcConnectivitySaslProperty.Builder.() -> Unit
    = {}): CfnCluster.VpcConnectivitySaslProperty =
    CfnCluster.VpcConnectivitySaslProperty.builder().apply(initializer).build()
