@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.Environment

public fun environment(initializer: Environment.Builder.() -> Unit): Environment =
    Environment.builder().apply(initializer).build()
