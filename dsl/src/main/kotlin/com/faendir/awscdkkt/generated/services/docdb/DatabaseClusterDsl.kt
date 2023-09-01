package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.docdb.DatabaseClusterProps
import software.constructs.Construct

@Generated
public fun Construct.databaseCluster(
  id: String,
  props: DatabaseClusterProps,
  initializer: @AwsCdkDsl DatabaseCluster.() -> Unit = {},
): DatabaseCluster = DatabaseCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseCluster(id: String, initializer: @AwsCdkDsl
    DatabaseCluster.Builder.() -> Unit = {}): DatabaseCluster = DatabaseCluster.Builder.create(this,
    id).apply(initializer).build()
