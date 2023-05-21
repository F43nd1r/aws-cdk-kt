package com.faendir.awscdkkt.services.lambda.nodejs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions

@Generated
public fun bundlingOptions(initializer: BundlingOptions.Builder.() -> Unit = {}): BundlingOptions =
    BundlingOptions.builder().apply(initializer).build()
