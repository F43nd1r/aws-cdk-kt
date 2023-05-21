package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps

@Generated
public
    fun serverlessClusterFromSnapshotProps(initializer: ServerlessClusterFromSnapshotProps.Builder.() -> Unit
    = {}): ServerlessClusterFromSnapshotProps =
    ServerlessClusterFromSnapshotProps.builder().apply(initializer).build()
