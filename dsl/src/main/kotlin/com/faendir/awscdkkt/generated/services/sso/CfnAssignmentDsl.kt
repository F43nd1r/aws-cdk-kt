package com.faendir.awscdkkt.generated.services.sso

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnAssignment
import software.amazon.awscdk.services.sso.CfnAssignmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssignment(id: String, props: CfnAssignmentProps): CfnAssignment =
    CfnAssignment(this, id, props)

@Generated
public fun Construct.cfnAssignment(
  id: String,
  props: CfnAssignmentProps,
  initializer: @AwsCdkDsl CfnAssignment.() -> Unit,
): CfnAssignment = CfnAssignment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssignment(id: String, initializer: @AwsCdkDsl
    CfnAssignment.Builder.() -> Unit): CfnAssignment = CfnAssignment.Builder.create(this,
    id).apply(initializer).build()
