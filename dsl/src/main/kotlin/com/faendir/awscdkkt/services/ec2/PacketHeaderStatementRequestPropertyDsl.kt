package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@Generated
public
    fun packetHeaderStatementRequestProperty(initializer: CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.Builder.() -> Unit
    = {}): CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty =
    CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.builder().apply(initializer).build()
