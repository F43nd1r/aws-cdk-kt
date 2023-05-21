@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.DomainProps

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.DomainProps is deprecated in CDK.")
@Generated
public fun domainProps(initializer: DomainProps.Builder.() -> Unit = {}): DomainProps =
    DomainProps.builder().apply(initializer).build()
