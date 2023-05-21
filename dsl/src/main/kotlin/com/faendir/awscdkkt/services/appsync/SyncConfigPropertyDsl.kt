package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnResolver

@Generated
public fun syncConfigProperty(initializer: CfnResolver.SyncConfigProperty.Builder.() -> Unit = {}):
    CfnResolver.SyncConfigProperty =
    CfnResolver.SyncConfigProperty.builder().apply(initializer).build()
