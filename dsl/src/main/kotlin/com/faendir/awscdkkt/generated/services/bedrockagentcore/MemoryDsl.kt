package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.Memory
import software.amazon.awscdk.services.bedrockagentcore.MemoryProps
import software.constructs.Construct

@Generated
public fun Construct.memory(id: String, initializer: @AwsCdkDsl Memory.() -> Unit = {}): Memory = Memory(this, id).apply(initializer)

@Generated
public fun Construct.memory(
  id: String,
  props: MemoryProps,
  initializer: @AwsCdkDsl Memory.() -> Unit = {},
): Memory = Memory(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMemory(id: String, initializer: @AwsCdkDsl Memory.Builder.() -> Unit = {}): Memory = Memory.Builder.create(this, id).apply(initializer).build()
