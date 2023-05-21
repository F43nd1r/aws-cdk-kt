package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CodeConfig

@Generated
public fun codeConfig(initializer: CodeConfig.Builder.() -> Unit = {}): CodeConfig =
    CodeConfig.builder().apply(initializer).build()
