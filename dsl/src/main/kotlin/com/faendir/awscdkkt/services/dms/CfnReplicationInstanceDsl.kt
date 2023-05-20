@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
