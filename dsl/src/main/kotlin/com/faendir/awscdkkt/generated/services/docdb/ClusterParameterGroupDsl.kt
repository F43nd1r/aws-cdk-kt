package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ClusterParameterGroup.() -> Unit = {},
): ClusterParameterGroup = ClusterParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildClusterParameterGroup(id: String, initializer: @AwsCdkDsl ClusterParameterGroup.Builder.() -> Unit = {}): ClusterParameterGroup = ClusterParameterGroup.Builder.create(this, id).apply(initializer).build()
