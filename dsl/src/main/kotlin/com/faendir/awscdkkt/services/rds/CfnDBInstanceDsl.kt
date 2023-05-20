@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBInstanceProps
import software.constructs.Construct

public fun Construct.cfnDBInstance(id: String, initializer: CfnDBInstance.() -> Unit = {}):
    CfnDBInstance = CfnDBInstance(this, id).apply(initializer)

public fun Construct.cfnDBInstance(
  id: String,
  props: CfnDBInstanceProps,
  initializer: CfnDBInstance.() -> Unit = {},
): CfnDBInstance = CfnDBInstance(this, id, props).apply(initializer)
