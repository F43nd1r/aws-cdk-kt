package com.faendir.awscdkkt.generated.cloudassembly.schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.TestCase

@Generated
public fun buildTestCase(initializer: @AwsCdkDsl TestCase.Builder.() -> Unit): TestCase =
    TestCase.Builder().apply(initializer).build()
