package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnRuntime
import software.amazon.awscdk.services.bedrockagentcore.CfnRuntimeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRuntime(
  id: String,
  props: CfnRuntimeProps,
  initializer: @AwsCdkDsl CfnRuntime.() -> Unit = {},
): CfnRuntime = CfnRuntime(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRuntime(id: String, initializer: @AwsCdkDsl CfnRuntime.Builder.() -> Unit = {}): CfnRuntime = CfnRuntime.Builder.create(this, id).apply(initializer).build()
