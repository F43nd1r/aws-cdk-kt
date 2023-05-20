@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.LockConfiguration

public fun lockConfiguration(initializer: LockConfiguration.Builder.() -> Unit): LockConfiguration =
    LockConfiguration.builder().apply(initializer).build()
