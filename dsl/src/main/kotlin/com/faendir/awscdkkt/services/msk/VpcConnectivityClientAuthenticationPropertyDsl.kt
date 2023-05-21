package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun vpcConnectivityClientAuthenticationProperty(initializer: CfnCluster.VpcConnectivityClientAuthenticationProperty.Builder.() -> Unit
    = {}): CfnCluster.VpcConnectivityClientAuthenticationProperty =
    CfnCluster.VpcConnectivityClientAuthenticationProperty.builder().apply(initializer).build()
