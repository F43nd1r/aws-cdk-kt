package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.Runtime
import software.amazon.awscdk.services.bedrockagentcore.RuntimeProps
import software.constructs.Construct

@Generated
public fun Construct.runtime(
  id: String,
  props: RuntimeProps,
  initializer: @AwsCdkDsl Runtime.() -> Unit = {},
): Runtime = Runtime(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRuntime(id: String, initializer: @AwsCdkDsl Runtime.Builder.() -> Unit = {}): Runtime = Runtime.Builder.create(this, id).apply(initializer).build()
