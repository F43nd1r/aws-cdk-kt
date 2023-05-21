package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.SecretVersionInfo

@Generated
public fun secretVersionInfo(initializer: SecretVersionInfo.Builder.() -> Unit = {}):
    SecretVersionInfo = SecretVersionInfo.builder().apply(initializer).build()
