package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMulticastDomain(id: String,
    props: CfnTransitGatewayMulticastDomainProps): CfnTransitGatewayMulticastDomain =
    CfnTransitGatewayMulticastDomain(this, id, props)

@Generated
public fun Construct.cfnTransitGatewayMulticastDomain(
  id: String,
  props: CfnTransitGatewayMulticastDomainProps,
  initializer: @AwsCdkDsl CfnTransitGatewayMulticastDomain.() -> Unit,
): CfnTransitGatewayMulticastDomain = CfnTransitGatewayMulticastDomain(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayMulticastDomain(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayMulticastDomain.Builder.() -> Unit): CfnTransitGatewayMulticastDomain =
    CfnTransitGatewayMulticastDomain.Builder.create(this, id).apply(initializer).build()
