package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ScratchSpace

@Generated
public fun buildScratchSpace(initializer: @AwsCdkDsl ScratchSpace.Builder.() -> Unit): ScratchSpace
    = ScratchSpace.Builder().apply(initializer).build()
