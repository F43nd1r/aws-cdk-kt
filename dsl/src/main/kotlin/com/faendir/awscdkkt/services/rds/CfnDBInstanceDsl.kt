@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
