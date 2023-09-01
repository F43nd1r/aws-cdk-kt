package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun buildVpcConnectivityProperty(initializer: @AwsCdkDsl
    CfnCluster.VpcConnectivityProperty.Builder.() -> Unit = {}): CfnCluster.VpcConnectivityProperty
    = CfnCluster.VpcConnectivityProperty.Builder().apply(initializer).build()
