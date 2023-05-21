package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun vpcConnectivityScramProperty(initializer: CfnCluster.VpcConnectivityScramProperty.Builder.() -> Unit
    = {}): CfnCluster.VpcConnectivityScramProperty =
    CfnCluster.VpcConnectivityScramProperty.builder().apply(initializer).build()
