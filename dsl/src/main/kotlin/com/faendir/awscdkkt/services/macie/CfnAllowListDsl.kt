package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAllowList(
  id: String,
  props: CfnAllowListProps,
  initializer: CfnAllowList.() -> Unit = {},
): CfnAllowList = CfnAllowList(this, id, props).apply(initializer)
