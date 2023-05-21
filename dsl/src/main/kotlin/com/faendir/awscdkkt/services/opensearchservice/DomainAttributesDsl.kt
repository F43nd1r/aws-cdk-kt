package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.DomainAttributes

@Generated
public fun domainAttributes(initializer: DomainAttributes.Builder.() -> Unit = {}): DomainAttributes
    = DomainAttributes.builder().apply(initializer).build()
