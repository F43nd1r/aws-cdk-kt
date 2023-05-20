@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyLookupOptions

public fun keyLookupOptions(initializer: KeyLookupOptions.Builder.() -> Unit): KeyLookupOptions =
    KeyLookupOptions.builder().apply(initializer).build()
