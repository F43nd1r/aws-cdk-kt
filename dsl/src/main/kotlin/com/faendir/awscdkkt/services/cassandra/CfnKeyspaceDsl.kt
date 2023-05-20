@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps
import software.constructs.Construct

public fun Construct.cfnKeyspace(
  id: String,
  props: CfnKeyspaceProps,
  initializer: CfnKeyspace.() -> Unit = {},
): CfnKeyspace = CfnKeyspace(this, id, props).apply(initializer)

public fun Construct.cfnKeyspace(id: String, initializer: CfnKeyspace.() -> Unit = {}): CfnKeyspace
    = CfnKeyspace(this, id).apply(initializer)
