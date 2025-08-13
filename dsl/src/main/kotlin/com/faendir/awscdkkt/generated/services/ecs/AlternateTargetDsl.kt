package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AlternateTarget

@Generated
public fun buildAlternateTarget(id: String, initializer: @AwsCdkDsl AlternateTarget.Builder.() -> Unit = {}): AlternateTarget = AlternateTarget.Builder.create(id).apply(initializer).build()
