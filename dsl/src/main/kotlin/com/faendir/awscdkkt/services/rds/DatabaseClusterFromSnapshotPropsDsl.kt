package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps

@Generated
public
    fun databaseClusterFromSnapshotProps(initializer: DatabaseClusterFromSnapshotProps.Builder.() -> Unit
    = {}): DatabaseClusterFromSnapshotProps =
    DatabaseClusterFromSnapshotProps.builder().apply(initializer).build()
