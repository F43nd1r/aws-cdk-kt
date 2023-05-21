package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationSet(
  id: String,
  props: CfnReplicationSetProps,
  initializer: CfnReplicationSet.() -> Unit = {},
): CfnReplicationSet = CfnReplicationSet(this, id, props).apply(initializer)
