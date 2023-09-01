package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.DeploymentAlarmOptions

@Generated
public fun buildDeploymentAlarmOptions(initializer: @AwsCdkDsl
    DeploymentAlarmOptions.Builder.() -> Unit = {}): DeploymentAlarmOptions =
    DeploymentAlarmOptions.Builder().apply(initializer).build()
