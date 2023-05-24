package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation
import software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomerGatewayAssociation(id: String,
    props: CfnCustomerGatewayAssociationProps): CfnCustomerGatewayAssociation =
    CfnCustomerGatewayAssociation(this, id, props)

@Generated
public fun Construct.cfnCustomerGatewayAssociation(
  id: String,
  props: CfnCustomerGatewayAssociationProps,
  initializer: @AwsCdkDsl CfnCustomerGatewayAssociation.() -> Unit,
): CfnCustomerGatewayAssociation = CfnCustomerGatewayAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomerGatewayAssociation(id: String, initializer: @AwsCdkDsl
    CfnCustomerGatewayAssociation.Builder.() -> Unit): CfnCustomerGatewayAssociation =
    CfnCustomerGatewayAssociation.Builder.create(this, id).apply(initializer).build()
