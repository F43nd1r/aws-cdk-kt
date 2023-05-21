package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMulticastDomainAssociation(
  id: String,
  props: CfnTransitGatewayMulticastDomainAssociationProps,
  initializer: CfnTransitGatewayMulticastDomainAssociation.() -> Unit = {},
): CfnTransitGatewayMulticastDomainAssociation = CfnTransitGatewayMulticastDomainAssociation(this,
    id, props).apply(initializer)
