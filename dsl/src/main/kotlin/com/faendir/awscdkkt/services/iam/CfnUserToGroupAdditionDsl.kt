@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
import software.constructs.Construct

public fun Construct.cfnUserToGroupAddition(
  id: String,
  props: CfnUserToGroupAdditionProps,
  initializer: CfnUserToGroupAddition.() -> Unit = {},
): CfnUserToGroupAddition = CfnUserToGroupAddition(this, id, props).apply(initializer)
