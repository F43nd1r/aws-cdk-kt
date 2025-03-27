package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.scheduler.targets.EcsRunEc2Task

@Generated
public fun buildEcsRunEc2Task(cluster: ICluster, initializer: @AwsCdkDsl
    EcsRunEc2Task.Builder.() -> Unit = {}): EcsRunEc2Task =
    EcsRunEc2Task.Builder.create(cluster).apply(initializer).build()
