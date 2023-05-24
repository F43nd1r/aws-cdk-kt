package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNGatewayRoutePropagation(id: String,
    props: CfnVPNGatewayRoutePropagationProps): CfnVPNGatewayRoutePropagation =
    CfnVPNGatewayRoutePropagation(this, id, props)

@Generated
public fun Construct.cfnVPNGatewayRoutePropagation(
  id: String,
  props: CfnVPNGatewayRoutePropagationProps,
  initializer: @AwsCdkDsl CfnVPNGatewayRoutePropagation.() -> Unit,
): CfnVPNGatewayRoutePropagation = CfnVPNGatewayRoutePropagation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPNGatewayRoutePropagation(id: String, initializer: @AwsCdkDsl
    CfnVPNGatewayRoutePropagation.Builder.() -> Unit): CfnVPNGatewayRoutePropagation =
    CfnVPNGatewayRoutePropagation.Builder.create(this, id).apply(initializer).build()
