package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions

@Generated
public fun ecsEc2LaunchTarget(): EcsEc2LaunchTarget = EcsEc2LaunchTarget()

@Generated
public fun ecsEc2LaunchTarget(options: EcsEc2LaunchTargetOptions): EcsEc2LaunchTarget =
    EcsEc2LaunchTarget(options)

@Generated
public fun buildEcsEc2LaunchTarget(initializer: @AwsCdkDsl EcsEc2LaunchTarget.Builder.() -> Unit):
    EcsEc2LaunchTarget = EcsEc2LaunchTarget.Builder.create().apply(initializer).build()
