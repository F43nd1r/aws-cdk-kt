package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNGateway
import software.amazon.awscdk.services.ec2.CfnVPNGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNGateway(id: String, props: CfnVPNGatewayProps): CfnVPNGateway =
    CfnVPNGateway(this, id, props)

@Generated
public fun Construct.cfnVPNGateway(
  id: String,
  props: CfnVPNGatewayProps,
  initializer: @AwsCdkDsl CfnVPNGateway.() -> Unit,
): CfnVPNGateway = CfnVPNGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPNGateway(id: String, initializer: @AwsCdkDsl
    CfnVPNGateway.Builder.() -> Unit): CfnVPNGateway = CfnVPNGateway.Builder.create(this,
    id).apply(initializer).build()
