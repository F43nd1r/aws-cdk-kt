package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.ClusterParameterGroup
import software.amazon.awscdk.services.docdb.ClusterParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.clusterParameterGroup(
  id: String,
  props: ClusterParameterGroupProps,
  initializer: ClusterParameterGroup.() -> Unit = {},
): ClusterParameterGroup = ClusterParameterGroup(this, id, props).apply(initializer)
