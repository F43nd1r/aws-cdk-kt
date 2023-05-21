package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool

@Generated
public fun pushSyncProperty(initializer: CfnIdentityPool.PushSyncProperty.Builder.() -> Unit = {}):
    CfnIdentityPool.PushSyncProperty =
    CfnIdentityPool.PushSyncProperty.builder().apply(initializer).build()
