@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyProps

public fun keyProps(initializer: KeyProps.Builder.() -> Unit): KeyProps =
    KeyProps.builder().apply(initializer).build()
