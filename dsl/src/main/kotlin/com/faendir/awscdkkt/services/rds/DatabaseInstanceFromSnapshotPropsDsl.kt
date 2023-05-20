@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps

public
    fun databaseInstanceFromSnapshotProps(initializer: DatabaseInstanceFromSnapshotProps.Builder.() -> Unit):
    DatabaseInstanceFromSnapshotProps =
    DatabaseInstanceFromSnapshotProps.builder().apply(initializer).build()
