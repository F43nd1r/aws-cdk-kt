@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

public fun bootstrapRole(initializer: BootstrapRole.Builder.() -> Unit): BootstrapRole =
    BootstrapRole.builder().apply(initializer).build()
