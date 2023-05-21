package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnService

@Generated
public fun dnsConfigProperty(initializer: CfnService.DnsConfigProperty.Builder.() -> Unit = {}):
    CfnService.DnsConfigProperty = CfnService.DnsConfigProperty.builder().apply(initializer).build()
