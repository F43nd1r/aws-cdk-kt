package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnRuntimeEndpoint
import software.amazon.awscdk.services.bedrockagentcore.CfnRuntimeEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRuntimeEndpoint(
  id: String,
  props: CfnRuntimeEndpointProps,
  initializer: @AwsCdkDsl CfnRuntimeEndpoint.() -> Unit = {},
): CfnRuntimeEndpoint = CfnRuntimeEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRuntimeEndpoint(id: String, initializer: @AwsCdkDsl CfnRuntimeEndpoint.Builder.() -> Unit = {}): CfnRuntimeEndpoint = CfnRuntimeEndpoint.Builder.create(this, id).apply(initializer).build()
