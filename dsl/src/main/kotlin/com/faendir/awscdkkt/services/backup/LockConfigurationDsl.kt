@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.LockConfiguration

public fun lockConfiguration(initializer: LockConfiguration.Builder.() -> Unit): LockConfiguration =
    LockConfiguration.builder().apply(initializer).build()
