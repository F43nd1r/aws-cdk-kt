package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ulimit

@Generated
public fun buildUlimit(initializer: @AwsCdkDsl Ulimit.Builder.() -> Unit = {}): Ulimit =
    Ulimit.Builder().apply(initializer).build()
