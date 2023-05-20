@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.Environment

public fun environment(initializer: Environment.Builder.() -> Unit): Environment =
    Environment.builder().apply(initializer).build()
