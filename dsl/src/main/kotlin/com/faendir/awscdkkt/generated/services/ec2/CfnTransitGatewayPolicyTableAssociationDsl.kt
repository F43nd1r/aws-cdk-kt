package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPolicyTableAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPolicyTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayPolicyTableAssociation(
  id: String,
  props: CfnTransitGatewayPolicyTableAssociationProps,
  initializer: @AwsCdkDsl CfnTransitGatewayPolicyTableAssociation.() -> Unit = {},
): CfnTransitGatewayPolicyTableAssociation = CfnTransitGatewayPolicyTableAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayPolicyTableAssociation(id: String, initializer: @AwsCdkDsl CfnTransitGatewayPolicyTableAssociation.Builder.() -> Unit = {}): CfnTransitGatewayPolicyTableAssociation = CfnTransitGatewayPolicyTableAssociation.Builder.create(this, id).apply(initializer).build()
