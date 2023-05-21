package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun brokerLogsProperty(initializer: CfnCluster.BrokerLogsProperty.Builder.() -> Unit = {}):
    CfnCluster.BrokerLogsProperty =
    CfnCluster.BrokerLogsProperty.builder().apply(initializer).build()
