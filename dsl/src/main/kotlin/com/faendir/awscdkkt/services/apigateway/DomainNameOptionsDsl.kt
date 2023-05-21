package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.DomainNameOptions

@Generated
public fun domainNameOptions(initializer: DomainNameOptions.Builder.() -> Unit = {}):
    DomainNameOptions = DomainNameOptions.builder().apply(initializer).build()
