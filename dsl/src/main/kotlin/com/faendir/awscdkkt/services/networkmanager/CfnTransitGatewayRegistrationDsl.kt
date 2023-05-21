package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRegistration(
  id: String,
  props: CfnTransitGatewayRegistrationProps,
  initializer: CfnTransitGatewayRegistration.() -> Unit = {},
): CfnTransitGatewayRegistration = CfnTransitGatewayRegistration(this, id, props).apply(initializer)
