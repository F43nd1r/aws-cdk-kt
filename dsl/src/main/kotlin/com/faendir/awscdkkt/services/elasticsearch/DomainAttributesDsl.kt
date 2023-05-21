@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.DomainAttributes

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.DomainAttributes is deprecated in CDK.")
@Generated
public fun domainAttributes(initializer: DomainAttributes.Builder.() -> Unit = {}): DomainAttributes
    = DomainAttributes.builder().apply(initializer).build()
