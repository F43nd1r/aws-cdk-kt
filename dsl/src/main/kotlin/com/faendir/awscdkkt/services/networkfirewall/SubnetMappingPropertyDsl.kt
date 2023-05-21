package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall

@Generated
public fun subnetMappingProperty(initializer: CfnFirewall.SubnetMappingProperty.Builder.() -> Unit =
    {}): CfnFirewall.SubnetMappingProperty =
    CfnFirewall.SubnetMappingProperty.builder().apply(initializer).build()
