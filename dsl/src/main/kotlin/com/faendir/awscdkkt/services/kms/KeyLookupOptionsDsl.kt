@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyLookupOptions

public fun keyLookupOptions(initializer: KeyLookupOptions.Builder.() -> Unit): KeyLookupOptions =
    KeyLookupOptions.builder().apply(initializer).build()
