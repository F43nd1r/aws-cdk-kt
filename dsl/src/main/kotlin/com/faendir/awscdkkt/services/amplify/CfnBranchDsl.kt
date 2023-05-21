package com.faendir.awscdkkt.services.amplify

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBranch(
  id: String,
  props: CfnBranchProps,
  initializer: CfnBranch.() -> Unit = {},
): CfnBranch = CfnBranch(this, id, props).apply(initializer)
