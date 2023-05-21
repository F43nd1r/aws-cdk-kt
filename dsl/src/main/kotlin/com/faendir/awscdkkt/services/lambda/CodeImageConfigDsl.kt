package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CodeImageConfig

@Generated
public fun codeImageConfig(initializer: CodeImageConfig.Builder.() -> Unit = {}): CodeImageConfig =
    CodeImageConfig.builder().apply(initializer).build()
