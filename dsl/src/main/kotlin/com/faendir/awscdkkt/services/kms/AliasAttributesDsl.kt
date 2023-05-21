package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.AliasAttributes

@Generated
public fun aliasAttributes(initializer: AliasAttributes.Builder.() -> Unit = {}): AliasAttributes =
    AliasAttributes.builder().apply(initializer).build()
