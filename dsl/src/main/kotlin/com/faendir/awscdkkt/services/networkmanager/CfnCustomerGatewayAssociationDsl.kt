package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomerGatewayAssociation(
  id: String,
  props: CfnCustomerGatewayAssociationProps,
  initializer: CfnCustomerGatewayAssociation.() -> Unit = {},
): CfnCustomerGatewayAssociation = CfnCustomerGatewayAssociation(this, id, props).apply(initializer)
