package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun vpcConnectivityIamProperty(initializer: CfnCluster.VpcConnectivityIamProperty.Builder.() -> Unit
    = {}): CfnCluster.VpcConnectivityIamProperty =
    CfnCluster.VpcConnectivityIamProperty.builder().apply(initializer).build()
