package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnService

@Generated
public fun buildDnsRecordProperty(initializer: @AwsCdkDsl
    CfnService.DnsRecordProperty.Builder.() -> Unit = {}): CfnService.DnsRecordProperty =
    CfnService.DnsRecordProperty.Builder().apply(initializer).build()
