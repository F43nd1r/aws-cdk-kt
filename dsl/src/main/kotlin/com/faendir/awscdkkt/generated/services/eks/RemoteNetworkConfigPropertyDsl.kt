package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun buildRemoteNetworkConfigProperty(initializer: @AwsCdkDsl
    CfnCluster.RemoteNetworkConfigProperty.Builder.() -> Unit = {}):
    CfnCluster.RemoteNetworkConfigProperty =
    CfnCluster.RemoteNetworkConfigProperty.Builder().apply(initializer).build()
