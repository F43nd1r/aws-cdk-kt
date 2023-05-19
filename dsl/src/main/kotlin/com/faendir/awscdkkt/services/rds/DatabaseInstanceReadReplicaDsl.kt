@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps
import software.constructs.Construct

public fun Construct.databaseInstanceReadReplica(
  id: String,
  props: DatabaseInstanceReadReplicaProps,
  initializer: DatabaseInstanceReadReplica.() -> Unit = {},
): DatabaseInstanceReadReplica = DatabaseInstanceReadReplica(this, id, props).apply(initializer)
