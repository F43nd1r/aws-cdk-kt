@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

public fun bootstrapRole(initializer: BootstrapRole.Builder.() -> Unit): BootstrapRole =
    BootstrapRole.builder().apply(initializer).build()
