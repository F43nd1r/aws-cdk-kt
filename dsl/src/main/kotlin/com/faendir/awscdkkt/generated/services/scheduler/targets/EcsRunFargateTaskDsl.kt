package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.scheduler.targets.EcsRunFargateTask

@Generated
public fun buildEcsRunFargateTask(cluster: ICluster, initializer: @AwsCdkDsl
    EcsRunFargateTask.Builder.() -> Unit = {}): EcsRunFargateTask =
    EcsRunFargateTask.Builder.create(cluster).apply(initializer).build()
