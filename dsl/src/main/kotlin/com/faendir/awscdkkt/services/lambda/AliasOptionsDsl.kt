package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AliasOptions

@Generated
public fun aliasOptions(initializer: AliasOptions.Builder.() -> Unit = {}): AliasOptions =
    AliasOptions.builder().apply(initializer).build()
