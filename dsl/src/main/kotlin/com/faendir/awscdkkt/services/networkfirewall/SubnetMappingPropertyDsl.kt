@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall

public fun subnetMappingProperty(initializer: CfnFirewall.SubnetMappingProperty.Builder.() -> Unit):
    CfnFirewall.SubnetMappingProperty =
    CfnFirewall.SubnetMappingProperty.builder().apply(initializer).build()
