@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogGroup
import software.amazon.awscdk.services.logs.CfnLogGroupProps
import software.constructs.Construct

public fun Construct.cfnLogGroup(id: String, initializer: CfnLogGroup.() -> Unit = {}): CfnLogGroup
    = CfnLogGroup(this, id).apply(initializer)

public fun Construct.cfnLogGroup(
  id: String,
  props: CfnLogGroupProps,
  initializer: CfnLogGroup.() -> Unit = {},
): CfnLogGroup = CfnLogGroup(this, id, props).apply(initializer)
