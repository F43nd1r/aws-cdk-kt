@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda.nodejs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions

public fun bundlingOptions(initializer: BundlingOptions.Builder.() -> Unit): BundlingOptions =
    BundlingOptions.builder().apply(initializer).build()
