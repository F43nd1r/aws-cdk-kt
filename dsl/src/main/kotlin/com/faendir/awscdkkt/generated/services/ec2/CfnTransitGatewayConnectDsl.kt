package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayConnect(
  id: String,
  props: CfnTransitGatewayConnectProps,
  initializer: @AwsCdkDsl CfnTransitGatewayConnect.() -> Unit = {},
): CfnTransitGatewayConnect = CfnTransitGatewayConnect(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayConnect(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayConnect.Builder.() -> Unit = {}): CfnTransitGatewayConnect =
    CfnTransitGatewayConnect.Builder.create(this, id).apply(initializer).build()
