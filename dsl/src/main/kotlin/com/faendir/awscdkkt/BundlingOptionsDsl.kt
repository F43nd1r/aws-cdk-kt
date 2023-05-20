@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.BundlingOptions

public fun bundlingOptions(initializer: BundlingOptions.Builder.() -> Unit): BundlingOptions =
    BundlingOptions.builder().apply(initializer).build()
