package com.faendir.awscdkkt.generated.services.iotsitewise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import software.amazon.awscdk.services.iotsitewise.CfnGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGateway(
  id: String,
  props: CfnGatewayProps,
  initializer: @AwsCdkDsl CfnGateway.() -> Unit = {},
): CfnGateway = CfnGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGateway(id: String, initializer: @AwsCdkDsl CfnGateway.Builder.() -> Unit = {}): CfnGateway = CfnGateway.Builder.create(this, id).apply(initializer).build()
