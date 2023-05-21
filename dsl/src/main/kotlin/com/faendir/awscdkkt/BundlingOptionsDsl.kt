package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.BundlingOptions

@Generated
public fun bundlingOptions(initializer: BundlingOptions.Builder.() -> Unit = {}): BundlingOptions =
    BundlingOptions.builder().apply(initializer).build()
