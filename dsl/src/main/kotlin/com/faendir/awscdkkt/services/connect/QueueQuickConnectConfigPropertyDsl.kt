package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect

@Generated
public
    fun queueQuickConnectConfigProperty(initializer: CfnQuickConnect.QueueQuickConnectConfigProperty.Builder.() -> Unit
    = {}): CfnQuickConnect.QueueQuickConnectConfigProperty =
    CfnQuickConnect.QueueQuickConnectConfigProperty.builder().apply(initializer).build()
