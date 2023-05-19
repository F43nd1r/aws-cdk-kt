@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig

public fun resourceConfig(initializer: ResourceConfig.Builder.() -> Unit): ResourceConfig =
    ResourceConfig.builder().apply(initializer).build()
