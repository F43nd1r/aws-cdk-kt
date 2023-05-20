@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnDBClusterParameterGroup(
  id: String,
  props: CfnDBClusterParameterGroupProps,
  initializer: CfnDBClusterParameterGroup.() -> Unit = {},
): CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(this, id, props).apply(initializer)
