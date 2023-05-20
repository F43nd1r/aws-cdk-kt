@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public
    fun brokerNodeGroupInfoProperty(initializer: CfnCluster.BrokerNodeGroupInfoProperty.Builder.() -> Unit):
    CfnCluster.BrokerNodeGroupInfoProperty =
    CfnCluster.BrokerNodeGroupInfoProperty.builder().apply(initializer).build()
