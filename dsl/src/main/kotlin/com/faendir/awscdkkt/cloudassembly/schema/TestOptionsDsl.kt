package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.TestOptions

@Generated
public fun testOptions(initializer: TestOptions.Builder.() -> Unit = {}): TestOptions =
    TestOptions.builder().apply(initializer).build()
