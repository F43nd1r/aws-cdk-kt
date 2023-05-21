package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.DomainProps

@Generated
public fun domainProps(initializer: DomainProps.Builder.() -> Unit = {}): DomainProps =
    DomainProps.builder().apply(initializer).build()
