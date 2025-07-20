package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.JsonFileLogDriver

@Generated
public fun buildJsonFileLogDriver(initializer: @AwsCdkDsl JsonFileLogDriver.Builder.() -> Unit = {}): JsonFileLogDriver = JsonFileLogDriver.Builder.create().apply(initializer).build()
