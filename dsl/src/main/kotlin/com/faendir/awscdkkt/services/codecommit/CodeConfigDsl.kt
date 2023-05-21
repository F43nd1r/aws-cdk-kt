package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CodeConfig

@Generated
public fun codeConfig(initializer: CodeConfig.Builder.() -> Unit = {}): CodeConfig =
    CodeConfig.builder().apply(initializer).build()
