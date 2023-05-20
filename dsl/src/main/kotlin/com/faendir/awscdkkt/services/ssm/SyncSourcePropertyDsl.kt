@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

public
    fun syncSourceProperty(initializer: CfnResourceDataSync.SyncSourceProperty.Builder.() -> Unit):
    CfnResourceDataSync.SyncSourceProperty =
    CfnResourceDataSync.SyncSourceProperty.builder().apply(initializer).build()
