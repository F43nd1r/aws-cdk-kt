@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.docdb.DatabaseClusterProps
import software.constructs.Construct

public fun Construct.databaseCluster(
  id: String,
  props: DatabaseClusterProps,
  initializer: DatabaseCluster.() -> Unit = {},
): DatabaseCluster = DatabaseCluster(this, id, props).apply(initializer)
