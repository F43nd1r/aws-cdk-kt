@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBInstance
import software.amazon.awscdk.services.neptune.CfnDBInstanceProps
import software.constructs.Construct

public fun Construct.cfnDBInstance(
  id: String,
  props: CfnDBInstanceProps,
  initializer: CfnDBInstance.() -> Unit = {},
): CfnDBInstance = CfnDBInstance(this, id, props).apply(initializer)
