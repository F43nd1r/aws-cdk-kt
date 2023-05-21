package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyProps

@Generated
public fun keyProps(initializer: KeyProps.Builder.() -> Unit = {}): KeyProps =
    KeyProps.builder().apply(initializer).build()
