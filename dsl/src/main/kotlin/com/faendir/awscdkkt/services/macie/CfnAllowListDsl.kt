@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps
import software.constructs.Construct

public fun Construct.cfnAllowList(
  id: String,
  props: CfnAllowListProps,
  initializer: CfnAllowList.() -> Unit = {},
): CfnAllowList = CfnAllowList(this, id, props).apply(initializer)
