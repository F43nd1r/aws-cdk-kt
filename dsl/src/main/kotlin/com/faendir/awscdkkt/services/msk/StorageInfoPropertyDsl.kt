package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun storageInfoProperty(initializer: CfnCluster.StorageInfoProperty.Builder.() -> Unit = {}):
    CfnCluster.StorageInfoProperty =
    CfnCluster.StorageInfoProperty.builder().apply(initializer).build()
