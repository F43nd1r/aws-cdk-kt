@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.triggers.TriggerOptions

public fun triggerOptions(initializer: TriggerOptions.Builder.() -> Unit): TriggerOptions =
    TriggerOptions.builder().apply(initializer).build()
