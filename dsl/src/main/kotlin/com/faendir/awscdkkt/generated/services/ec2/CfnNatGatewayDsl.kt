package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNatGateway
import software.amazon.awscdk.services.ec2.CfnNatGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNatGateway(
  id: String,
  props: CfnNatGatewayProps,
  initializer: @AwsCdkDsl CfnNatGateway.() -> Unit = {},
): CfnNatGateway = CfnNatGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNatGateway(id: String, initializer: @AwsCdkDsl CfnNatGateway.Builder.() -> Unit = {}): CfnNatGateway = CfnNatGateway.Builder.create(this, id).apply(initializer).build()
