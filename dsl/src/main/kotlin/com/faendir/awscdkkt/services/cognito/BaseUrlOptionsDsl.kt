package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.BaseUrlOptions

@Generated
public fun baseUrlOptions(initializer: BaseUrlOptions.Builder.() -> Unit = {}): BaseUrlOptions =
    BaseUrlOptions.builder().apply(initializer).build()
