@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyProps

public fun keyProps(initializer: KeyProps.Builder.() -> Unit): KeyProps =
    KeyProps.builder().apply(initializer).build()
