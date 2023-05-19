@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnAssignment
import software.amazon.awscdk.services.sso.CfnAssignmentProps
import software.constructs.Construct

public fun Construct.cfnAssignment(
  id: String,
  props: CfnAssignmentProps,
  initializer: CfnAssignment.() -> Unit = {},
): CfnAssignment = CfnAssignment(this, id, props).apply(initializer)
