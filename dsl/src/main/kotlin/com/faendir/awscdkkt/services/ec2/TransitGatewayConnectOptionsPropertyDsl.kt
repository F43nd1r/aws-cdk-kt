package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect

@Generated
public
    fun transitGatewayConnectOptionsProperty(initializer: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder.() -> Unit
    = {}): CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty =
    CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.builder().apply(initializer).build()
