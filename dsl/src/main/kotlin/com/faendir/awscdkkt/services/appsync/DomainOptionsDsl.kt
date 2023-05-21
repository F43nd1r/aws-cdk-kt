package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.DomainOptions

@Generated
public fun domainOptions(initializer: DomainOptions.Builder.() -> Unit = {}): DomainOptions =
    DomainOptions.builder().apply(initializer).build()
