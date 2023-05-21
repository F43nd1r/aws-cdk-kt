package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.DomainNameAttributes

@Generated
public fun domainNameAttributes(initializer: DomainNameAttributes.Builder.() -> Unit = {}):
    DomainNameAttributes = DomainNameAttributes.builder().apply(initializer).build()
