package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AliasAttributes

@Generated
public fun aliasAttributes(initializer: AliasAttributes.Builder.() -> Unit = {}): AliasAttributes =
    AliasAttributes.builder().apply(initializer).build()
