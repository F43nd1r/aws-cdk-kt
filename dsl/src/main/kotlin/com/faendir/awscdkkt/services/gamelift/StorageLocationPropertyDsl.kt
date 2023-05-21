package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnBuild

@Generated
public fun storageLocationProperty(initializer: CfnBuild.StorageLocationProperty.Builder.() -> Unit
    = {}): CfnBuild.StorageLocationProperty =
    CfnBuild.StorageLocationProperty.builder().apply(initializer).build()
