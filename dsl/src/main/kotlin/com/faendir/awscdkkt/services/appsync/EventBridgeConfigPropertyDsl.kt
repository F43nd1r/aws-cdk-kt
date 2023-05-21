package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun eventBridgeConfigProperty(initializer: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.EventBridgeConfigProperty =
    CfnDataSource.EventBridgeConfigProperty.builder().apply(initializer).build()
