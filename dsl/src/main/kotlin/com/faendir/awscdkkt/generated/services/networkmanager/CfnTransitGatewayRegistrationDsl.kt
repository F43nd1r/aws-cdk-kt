package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnTransitGatewayRegistration.() -> Unit = {},
): CfnTransitGatewayRegistration = CfnTransitGatewayRegistration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayRegistration(id: String, initializer: @AwsCdkDsl CfnTransitGatewayRegistration.Builder.() -> Unit = {}): CfnTransitGatewayRegistration = CfnTransitGatewayRegistration.Builder.create(this, id).apply(initializer).build()
