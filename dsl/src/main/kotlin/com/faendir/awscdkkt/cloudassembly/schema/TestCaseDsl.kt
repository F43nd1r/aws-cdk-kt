package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.TestCase

@Generated
public fun testCase(initializer: TestCase.Builder.() -> Unit = {}): TestCase =
    TestCase.builder().apply(initializer).build()
