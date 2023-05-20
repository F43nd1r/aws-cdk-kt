@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
import software.constructs.Construct

public fun Construct.cfnResourceDataSync(
  id: String,
  props: CfnResourceDataSyncProps,
  initializer: CfnResourceDataSync.() -> Unit = {},
): CfnResourceDataSync = CfnResourceDataSync(this, id, props).apply(initializer)
