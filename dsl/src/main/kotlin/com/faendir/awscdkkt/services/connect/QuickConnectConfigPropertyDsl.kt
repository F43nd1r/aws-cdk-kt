@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect

public
    fun quickConnectConfigProperty(initializer: CfnQuickConnect.QuickConnectConfigProperty.Builder.() -> Unit):
    CfnQuickConnect.QuickConnectConfigProperty =
    CfnQuickConnect.QuickConnectConfigProperty.builder().apply(initializer).build()
