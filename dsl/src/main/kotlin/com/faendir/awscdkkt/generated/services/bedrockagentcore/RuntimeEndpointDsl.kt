package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.RuntimeEndpoint
import software.amazon.awscdk.services.bedrockagentcore.RuntimeEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.runtimeEndpoint(
  id: String,
  props: RuntimeEndpointProps,
  initializer: @AwsCdkDsl RuntimeEndpoint.() -> Unit = {},
): RuntimeEndpoint = RuntimeEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRuntimeEndpoint(id: String, initializer: @AwsCdkDsl RuntimeEndpoint.Builder.() -> Unit = {}): RuntimeEndpoint = RuntimeEndpoint.Builder.create(this, id).apply(initializer).build()
