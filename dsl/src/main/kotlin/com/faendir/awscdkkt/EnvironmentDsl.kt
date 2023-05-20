@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.Environment

public fun environment(initializer: Environment.Builder.() -> Unit): Environment =
    Environment.builder().apply(initializer).build()
