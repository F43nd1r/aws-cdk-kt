package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CognitoDomainOptions

@Generated
public fun cognitoDomainOptions(initializer: CognitoDomainOptions.Builder.() -> Unit = {}):
    CognitoDomainOptions = CognitoDomainOptions.builder().apply(initializer).build()
