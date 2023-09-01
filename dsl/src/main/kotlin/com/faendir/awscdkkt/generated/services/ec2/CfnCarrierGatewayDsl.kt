package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCarrierGateway
import software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCarrierGateway(
  id: String,
  props: CfnCarrierGatewayProps,
  initializer: @AwsCdkDsl CfnCarrierGateway.() -> Unit = {},
): CfnCarrierGateway = CfnCarrierGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCarrierGateway(id: String, initializer: @AwsCdkDsl
    CfnCarrierGateway.Builder.() -> Unit = {}): CfnCarrierGateway =
    CfnCarrierGateway.Builder.create(this, id).apply(initializer).build()
