package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps
import software.constructs.Construct

@Generated
public fun Construct.databaseInstanceReadReplica(
  id: String,
  props: DatabaseInstanceReadReplicaProps,
  initializer: @AwsCdkDsl DatabaseInstanceReadReplica.() -> Unit = {},
): DatabaseInstanceReadReplica = DatabaseInstanceReadReplica(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseInstanceReadReplica(id: String, initializer: @AwsCdkDsl
    DatabaseInstanceReadReplica.Builder.() -> Unit = {}): DatabaseInstanceReadReplica =
    DatabaseInstanceReadReplica.Builder.create(this, id).apply(initializer).build()
