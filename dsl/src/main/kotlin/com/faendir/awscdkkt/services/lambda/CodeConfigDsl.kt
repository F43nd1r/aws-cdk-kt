package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CodeConfig

@Generated
public fun codeConfig(initializer: CodeConfig.Builder.() -> Unit = {}): CodeConfig =
    CodeConfig.builder().apply(initializer).build()
