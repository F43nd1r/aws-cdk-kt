package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnAssignment
import software.amazon.awscdk.services.sso.CfnAssignmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssignment(
  id: String,
  props: CfnAssignmentProps,
  initializer: CfnAssignment.() -> Unit = {},
): CfnAssignment = CfnAssignment(this, id, props).apply(initializer)
