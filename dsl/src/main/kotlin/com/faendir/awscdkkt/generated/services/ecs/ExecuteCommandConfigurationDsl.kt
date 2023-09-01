package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration

@Generated
public fun buildExecuteCommandConfiguration(initializer: @AwsCdkDsl
    ExecuteCommandConfiguration.Builder.() -> Unit = {}): ExecuteCommandConfiguration =
    ExecuteCommandConfiguration.Builder().apply(initializer).build()
