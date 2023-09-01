package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable

@Generated
public fun buildTaskEnvironmentVariable(initializer: @AwsCdkDsl
    TaskEnvironmentVariable.Builder.() -> Unit = {}): TaskEnvironmentVariable =
    TaskEnvironmentVariable.Builder().apply(initializer).build()
