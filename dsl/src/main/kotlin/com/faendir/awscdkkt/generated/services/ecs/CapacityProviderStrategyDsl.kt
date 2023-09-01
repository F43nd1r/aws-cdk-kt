package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy

@Generated
public fun buildCapacityProviderStrategy(initializer: @AwsCdkDsl
    CapacityProviderStrategy.Builder.() -> Unit = {}): CapacityProviderStrategy =
    CapacityProviderStrategy.Builder().apply(initializer).build()
