package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.EcsTask

@Generated
public fun buildEcsTask(initializer: @AwsCdkDsl EcsTask.Builder.() -> Unit): EcsTask =
    EcsTask.Builder.create().apply(initializer).build()
