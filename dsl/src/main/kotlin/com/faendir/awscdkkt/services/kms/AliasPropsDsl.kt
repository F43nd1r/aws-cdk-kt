package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.AliasProps

@Generated
public fun aliasProps(initializer: AliasProps.Builder.() -> Unit = {}): AliasProps =
    AliasProps.builder().apply(initializer).build()
