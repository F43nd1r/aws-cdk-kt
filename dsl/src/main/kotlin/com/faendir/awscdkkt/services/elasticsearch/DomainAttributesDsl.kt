@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.DomainAttributes

public fun domainAttributes(initializer: DomainAttributes.Builder.() -> Unit): DomainAttributes =
    DomainAttributes.builder().apply(initializer).build()
