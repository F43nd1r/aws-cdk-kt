package com.faendir.awscdkkt.generated.services.amplify

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBranch(id: String, props: CfnBranchProps): CfnBranch = CfnBranch(this, id,
    props)

@Generated
public fun Construct.cfnBranch(
  id: String,
  props: CfnBranchProps,
  initializer: @AwsCdkDsl CfnBranch.() -> Unit,
): CfnBranch = CfnBranch(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBranch(id: String, initializer: @AwsCdkDsl
    CfnBranch.Builder.() -> Unit): CfnBranch = CfnBranch.Builder.create(this,
    id).apply(initializer).build()
