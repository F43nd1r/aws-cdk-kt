package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.MemoryStrategyType
import software.amazon.awscdk.services.bedrockagentcore.SelfManagedMemoryStrategy

@Generated
public fun buildSelfManagedMemoryStrategy(strategyType: MemoryStrategyType, initializer: @AwsCdkDsl SelfManagedMemoryStrategy.Builder.() -> Unit = {}): SelfManagedMemoryStrategy = SelfManagedMemoryStrategy.Builder.create(strategyType).apply(initializer).build()
