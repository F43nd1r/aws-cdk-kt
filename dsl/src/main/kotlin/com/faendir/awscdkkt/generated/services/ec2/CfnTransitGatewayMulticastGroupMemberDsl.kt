package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMulticastGroupMember(id: String,
    props: CfnTransitGatewayMulticastGroupMemberProps): CfnTransitGatewayMulticastGroupMember =
    CfnTransitGatewayMulticastGroupMember(this, id, props)

@Generated
public fun Construct.cfnTransitGatewayMulticastGroupMember(
  id: String,
  props: CfnTransitGatewayMulticastGroupMemberProps,
  initializer: @AwsCdkDsl CfnTransitGatewayMulticastGroupMember.() -> Unit,
): CfnTransitGatewayMulticastGroupMember = CfnTransitGatewayMulticastGroupMember(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayMulticastGroupMember(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayMulticastGroupMember.Builder.() -> Unit): CfnTransitGatewayMulticastGroupMember
    = CfnTransitGatewayMulticastGroupMember.Builder.create(this, id).apply(initializer).build()
