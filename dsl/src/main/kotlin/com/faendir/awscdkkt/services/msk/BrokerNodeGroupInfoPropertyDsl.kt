package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun brokerNodeGroupInfoProperty(initializer: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit
    = {}): CfnCluster.BrokerNodeGroupInfoProperty =
    CfnCluster.BrokerNodeGroupInfoProperty.builder().apply(initializer).build()
