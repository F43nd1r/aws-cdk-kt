@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationInstance
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
import software.constructs.Construct

public fun Construct.cfnReplicationInstance(
  id: String,
  props: CfnReplicationInstanceProps,
  initializer: CfnReplicationInstance.() -> Unit = {},
): CfnReplicationInstance = CfnReplicationInstance(this, id, props).apply(initializer)
