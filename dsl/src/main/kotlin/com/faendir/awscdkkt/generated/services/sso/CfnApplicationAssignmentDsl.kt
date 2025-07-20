package com.faendir.awscdkkt.generated.services.sso

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnApplicationAssignment
import software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationAssignment(
  id: String,
  props: CfnApplicationAssignmentProps,
  initializer: @AwsCdkDsl CfnApplicationAssignment.() -> Unit = {},
): CfnApplicationAssignment = CfnApplicationAssignment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationAssignment(id: String, initializer: @AwsCdkDsl CfnApplicationAssignment.Builder.() -> Unit = {}): CfnApplicationAssignment = CfnApplicationAssignment.Builder.create(this, id).apply(initializer).build()
