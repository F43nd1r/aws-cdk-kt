package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CustomDomainOptions

@Generated
public fun customDomainOptions(initializer: CustomDomainOptions.Builder.() -> Unit = {}):
    CustomDomainOptions = CustomDomainOptions.builder().apply(initializer).build()
