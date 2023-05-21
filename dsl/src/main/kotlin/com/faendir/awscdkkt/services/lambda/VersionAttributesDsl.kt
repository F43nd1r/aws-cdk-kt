package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.VersionAttributes

@Generated
public fun versionAttributes(initializer: VersionAttributes.Builder.() -> Unit = {}):
    VersionAttributes = VersionAttributes.builder().apply(initializer).build()
