@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
import software.constructs.Construct

public fun Construct.cfnReplicationSet(
  id: String,
  props: CfnReplicationSetProps,
  initializer: CfnReplicationSet.() -> Unit = {},
): CfnReplicationSet = CfnReplicationSet(this, id, props).apply(initializer)
