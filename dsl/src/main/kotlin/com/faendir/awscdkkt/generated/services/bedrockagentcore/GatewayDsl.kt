package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.Gateway
import software.amazon.awscdk.services.bedrockagentcore.GatewayProps
import software.constructs.Construct

@Generated
public fun Construct.gateway(id: String, initializer: @AwsCdkDsl Gateway.() -> Unit = {}): Gateway = Gateway(this, id).apply(initializer)

@Generated
public fun Construct.gateway(
  id: String,
  props: GatewayProps,
  initializer: @AwsCdkDsl Gateway.() -> Unit = {},
): Gateway = Gateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGateway(id: String, initializer: @AwsCdkDsl Gateway.Builder.() -> Unit = {}): Gateway = Gateway.Builder.create(this, id).apply(initializer).build()
