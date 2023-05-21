package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.LockConfiguration

@Generated
public fun lockConfiguration(initializer: LockConfiguration.Builder.() -> Unit = {}):
    LockConfiguration = LockConfiguration.builder().apply(initializer).build()
