package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMulticastDomainAssociation(id: String,
    props: CfnTransitGatewayMulticastDomainAssociationProps):
    CfnTransitGatewayMulticastDomainAssociation = CfnTransitGatewayMulticastDomainAssociation(this,
    id, props)

@Generated
public fun Construct.cfnTransitGatewayMulticastDomainAssociation(
  id: String,
  props: CfnTransitGatewayMulticastDomainAssociationProps,
  initializer: @AwsCdkDsl CfnTransitGatewayMulticastDomainAssociation.() -> Unit,
): CfnTransitGatewayMulticastDomainAssociation = CfnTransitGatewayMulticastDomainAssociation(this,
    id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayMulticastDomainAssociation(id: String,
    initializer: @AwsCdkDsl CfnTransitGatewayMulticastDomainAssociation.Builder.() -> Unit):
    CfnTransitGatewayMulticastDomainAssociation =
    CfnTransitGatewayMulticastDomainAssociation.Builder.create(this, id).apply(initializer).build()
