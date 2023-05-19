@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall

public fun subnetMappingProperty(initializer: CfnFirewall.SubnetMappingProperty.Builder.() -> Unit):
    CfnFirewall.SubnetMappingProperty =
    CfnFirewall.SubnetMappingProperty.builder().apply(initializer).build()
