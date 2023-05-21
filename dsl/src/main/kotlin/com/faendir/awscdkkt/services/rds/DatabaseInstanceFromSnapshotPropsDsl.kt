package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps

@Generated
public
    fun databaseInstanceFromSnapshotProps(initializer: DatabaseInstanceFromSnapshotProps.Builder.() -> Unit
    = {}): DatabaseInstanceFromSnapshotProps =
    DatabaseInstanceFromSnapshotProps.builder().apply(initializer).build()
