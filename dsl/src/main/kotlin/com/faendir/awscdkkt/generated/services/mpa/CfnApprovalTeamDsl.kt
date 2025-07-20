package com.faendir.awscdkkt.generated.services.mpa

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mpa.CfnApprovalTeam
import software.amazon.awscdk.services.mpa.CfnApprovalTeamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApprovalTeam(
  id: String,
  props: CfnApprovalTeamProps,
  initializer: @AwsCdkDsl CfnApprovalTeam.() -> Unit = {},
): CfnApprovalTeam = CfnApprovalTeam(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApprovalTeam(id: String, initializer: @AwsCdkDsl CfnApprovalTeam.Builder.() -> Unit = {}): CfnApprovalTeam = CfnApprovalTeam.Builder.create(this, id).apply(initializer).build()
