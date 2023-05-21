package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AliasProps

@Generated
public fun aliasProps(initializer: AliasProps.Builder.() -> Unit = {}): AliasProps =
    AliasProps.builder().apply(initializer).build()
