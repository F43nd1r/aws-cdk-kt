package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.ManagedMemoryStrategy
import software.amazon.awscdk.services.bedrockagentcore.MemoryStrategyType

@Generated
public fun buildManagedMemoryStrategy(strategyType: MemoryStrategyType, initializer: @AwsCdkDsl ManagedMemoryStrategy.Builder.() -> Unit = {}): ManagedMemoryStrategy = ManagedMemoryStrategy.Builder.create(strategyType).apply(initializer).build()
