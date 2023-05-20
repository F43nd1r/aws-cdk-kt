@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

public
    fun statefulEngineOptionsProperty(initializer: CfnFirewallPolicy.StatefulEngineOptionsProperty.Builder.() -> Unit):
    CfnFirewallPolicy.StatefulEngineOptionsProperty =
    CfnFirewallPolicy.StatefulEngineOptionsProperty.builder().apply(initializer).build()
