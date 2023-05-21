package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes

@Generated
public fun appsyncFunctionAttributes(initializer: AppsyncFunctionAttributes.Builder.() -> Unit =
    {}): AppsyncFunctionAttributes = AppsyncFunctionAttributes.builder().apply(initializer).build()
