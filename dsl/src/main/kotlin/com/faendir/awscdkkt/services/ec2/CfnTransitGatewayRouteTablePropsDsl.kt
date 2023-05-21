package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps

@Generated
public
    fun cfnTransitGatewayRouteTableProps(initializer: CfnTransitGatewayRouteTableProps.Builder.() -> Unit
    = {}): CfnTransitGatewayRouteTableProps =
    CfnTransitGatewayRouteTableProps.builder().apply(initializer).build()
