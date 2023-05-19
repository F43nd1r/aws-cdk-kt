@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.EngineVersion

public fun engineVersion(initializer: EngineVersion.Builder.() -> Unit): EngineVersion =
    EngineVersion.builder().apply(initializer).build()
