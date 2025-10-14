package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnMemory
import software.amazon.awscdk.services.bedrockagentcore.CfnMemoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMemory(
  id: String,
  props: CfnMemoryProps,
  initializer: @AwsCdkDsl CfnMemory.() -> Unit = {},
): CfnMemory = CfnMemory(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMemory(id: String, initializer: @AwsCdkDsl CfnMemory.Builder.() -> Unit = {}): CfnMemory = CfnMemory.Builder.create(this, id).apply(initializer).build()
