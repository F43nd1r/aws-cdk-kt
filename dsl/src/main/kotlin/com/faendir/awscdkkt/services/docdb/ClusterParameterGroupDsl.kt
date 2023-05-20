@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.ClusterParameterGroup
import software.amazon.awscdk.services.docdb.ClusterParameterGroupProps
import software.constructs.Construct

public fun Construct.clusterParameterGroup(
  id: String,
  props: ClusterParameterGroupProps,
  initializer: ClusterParameterGroup.() -> Unit = {},
): ClusterParameterGroup = ClusterParameterGroup(this, id, props).apply(initializer)
