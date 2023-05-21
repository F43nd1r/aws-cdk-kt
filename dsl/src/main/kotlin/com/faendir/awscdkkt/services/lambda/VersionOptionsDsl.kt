package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.VersionOptions

@Generated
public fun versionOptions(initializer: VersionOptions.Builder.() -> Unit = {}): VersionOptions =
    VersionOptions.builder().apply(initializer).build()
