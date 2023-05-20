@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
