@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterProps
import software.constructs.Construct

public fun Construct.databaseCluster(
  id: String,
  props: DatabaseClusterProps,
  initializer: DatabaseCluster.() -> Unit = {},
): DatabaseCluster = DatabaseCluster(this, id, props).apply(initializer)
