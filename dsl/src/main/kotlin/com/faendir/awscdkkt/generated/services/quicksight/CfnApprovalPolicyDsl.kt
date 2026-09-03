package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnApprovalPolicy
import software.amazon.awscdk.services.quicksight.CfnApprovalPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApprovalPolicy(
  id: String,
  props: CfnApprovalPolicyProps,
  initializer: @AwsCdkDsl CfnApprovalPolicy.() -> Unit = {},
): CfnApprovalPolicy = CfnApprovalPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApprovalPolicy(id: String, initializer: @AwsCdkDsl CfnApprovalPolicy.Builder.() -> Unit = {}): CfnApprovalPolicy = CfnApprovalPolicy.Builder.create(this, id).apply(initializer).build()
