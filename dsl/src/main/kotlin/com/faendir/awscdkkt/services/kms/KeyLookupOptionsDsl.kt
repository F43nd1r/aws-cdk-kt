package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyLookupOptions

@Generated
public fun keyLookupOptions(initializer: KeyLookupOptions.Builder.() -> Unit = {}): KeyLookupOptions
    = KeyLookupOptions.builder().apply(initializer).build()
