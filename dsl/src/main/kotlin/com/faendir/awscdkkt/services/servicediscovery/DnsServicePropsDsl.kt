package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.DnsServiceProps

@Generated
public fun dnsServiceProps(initializer: DnsServiceProps.Builder.() -> Unit = {}): DnsServiceProps =
    DnsServiceProps.builder().apply(initializer).build()
