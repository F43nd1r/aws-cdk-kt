package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.EcsTask
import software.amazon.awscdk.services.events.targets.EcsTaskProps

@Generated
public fun ecsTask(props: EcsTaskProps): EcsTask = EcsTask(props)

@Generated
public fun buildEcsTask(initializer: @AwsCdkDsl EcsTask.Builder.() -> Unit): EcsTask =
    EcsTask.Builder.create().apply(initializer).build()
